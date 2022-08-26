package com.inoptra.assessment.shoppingcart.utils;

import java.util.logging.Logger;
import java.util.stream.Collectors;

import com.inoptra.assessment.shoppingcart.models.entities.CartTotal;
import com.inoptra.assessment.shoppingcart.models.entities.ShoppingCart;

public final class ShoppingCartUtil {

	private static final Logger logger = Logger.getLogger(ShoppingCartUtil.class.getName());
	
	public static CartTotal updateCartTotal(ShoppingCart shoppingCart) {
		
		logger.info(
				String.format("ShoppingCartUtil#updateCartTotal ==> got shoppingCart with # of products= %d", shoppingCart.getProductItems().size()));

		
		CartTotal cartTotal = new CartTotal();
		
		double grossTotalAmount = shoppingCart.getProductItems()
															.stream()
															.collect(Collectors.summingDouble(p -> p.getProductMeta().getBasePrice()));
		double totalDiscount = 0.0; // ToDo - calculate discount amount
		
		cartTotal.setGrossTotalAmount(grossTotalAmount);
		cartTotal.setTotalDiscountAmount(totalDiscount);
		cartTotal.setNetPayableAmount(grossTotalAmount - totalDiscount);
		
		return cartTotal;

	}
	
}
