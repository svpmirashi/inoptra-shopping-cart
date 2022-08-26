package com.inoptra.assessment.shoppingcart.repositories;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;
import java.util.logging.Logger;

import javax.persistence.EntityManagerFactory;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.inoptra.assessment.shoppingcart.models.entities.CartTotal;
import com.inoptra.assessment.shoppingcart.models.entities.ProductItem;
import com.inoptra.assessment.shoppingcart.models.entities.ShoppingCart;
import com.inoptra.assessment.shoppingcart.utils.ShoppingCartUtil;

@Repository
public class ShoppingCartRepositoryImpl implements AbstractRepository {
	
	@Autowired
	private EntityManagerFactory entityManagerFactory;

	private static final Logger logger = Logger.getLogger(ShoppingCartRepositoryImpl.class.getName());

	@Transactional
	public ShoppingCart addProductsToCart(long shoppingCartId, List<Long> productItemIds) {

		logger.info(String.format(
				"ShoppingCartRepositoryImpl#addProductsToCart ==> with shoppingCartId = %s and productItemIds = %s",
				shoppingCartId, productItemIds));
		
		Session session = entityManagerFactory.unwrap(SessionFactory.class).openSession();
		
		Transaction tx = session.beginTransaction();
		
		ShoppingCart shoppingCart = Optional.ofNullable(session.get(ShoppingCart.class, shoppingCartId))
				.orElseGet(ShoppingCart::new);
		
		logger.info(
				String.format("ShoppingCartRepositoryImpl#addProductsToCart ==> got shoppingCart = %s", shoppingCart));
		
		List<ProductItem> products =
		  	session.createQuery("from :entityName p where p.id in :productItemIds", ProductItem.class)
			  	.setParameter("entityName", ProductItem.class.getName())
			  	.setParameter("productItemIds", productItemIds)
			  	.getResultList();
  
		logger.info(String.
				format("ShoppingCartRepositoryImpl#addProductsToCart ==> with products = %s", products));
		
		shoppingCart.getProductItems().addAll(products);
		 
		shoppingCart.setModifiedBy("Test");

		shoppingCart.setModifiedDate(LocalDate.now());
		
		CartTotal cartTotal = ShoppingCartUtil.updateCartTotal(shoppingCart);
		shoppingCart.setCartTotal(cartTotal);

		session.saveOrUpdate(shoppingCart);
		
		tx.commit();

		logger.info(String.format("ShoppingCartRepositoryImpl#addProductsToCart ==> Returning shoppingCart = %s",
				shoppingCart));

		return shoppingCart;
	}
}
