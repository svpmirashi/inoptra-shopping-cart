package com.inoptra.assessment.shoppingcart.repositories;

import org.springframework.core.annotation.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.inoptra.assessment.shoppingcart.models.entities.ShoppingCart;

/**
* @Author: Shrikrishna Prabhumirashi
* @Description:
* ShoppingCartRepository - Support for Pagination and acts as a persistence layer for Vendor object
**/

@Order(value = 200)
@Repository
public interface ShoppingCartRepository extends JpaRepository<ShoppingCart, Long>, AbstractRepository{

}
