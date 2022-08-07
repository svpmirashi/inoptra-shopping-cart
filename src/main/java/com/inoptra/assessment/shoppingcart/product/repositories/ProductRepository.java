package com.inoptra.assessment.shoppingcart.product.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.inoptra.assessment.shoppingcart.product.models.entities.ProductItem;

/**
* @Author: Shrikrishna Prabhumirashi
* @Description:
* ProductRepository - Support for Pagination and acts as a persistence layer for ProductItem object
**/

@Repository
public interface ProductRepository extends JpaRepository<ProductItem, Long> {
    List<ProductItem> findByTitle(String title);
    List<ProductItem> findByName(String name);
    
    @Query("SELECT p FROM ProductItem p WHERE p.name LIKE %:keyword% OR p.title LIKE %:keyword%")
	List<ProductItem> findByKeyword(@Param("keyword") String keyword);
}
