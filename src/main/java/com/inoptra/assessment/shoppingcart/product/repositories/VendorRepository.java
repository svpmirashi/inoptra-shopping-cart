package com.inoptra.assessment.shoppingcart.product.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.inoptra.assessment.shoppingcart.product.models.Vendor;

@Repository
public interface VendorRepository extends JpaRepository<Vendor, Integer>{

}
