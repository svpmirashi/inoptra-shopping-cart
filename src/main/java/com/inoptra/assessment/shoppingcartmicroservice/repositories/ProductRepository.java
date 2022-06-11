package com.inoptra.assessment.shoppingcartmicroservice.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.inoptra.assessment.shoppingcartmicroservice.models.ProductItem;

@Repository
public interface ProductRepository extends JpaRepository<ProductItem, Long> {
    List<ProductItem> findByTitle(String title);
    List<ProductItem> findByName(String name);
}
