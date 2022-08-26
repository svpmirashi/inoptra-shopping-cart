package com.inoptra.assessment.shoppingcart.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.inoptra.assessment.shoppingcart.models.entities.Vendor;

/**
* @Author: Shrikrishna Prabhumirashi
* @Description:
* VendorRepository - Support for Pagination and acts as a persistence layer for Vendor object
**/

@Repository
public interface VendorRepository extends JpaRepository<Vendor, Long>, AbstractRepository{

}
