package com.inoptra.assessment.shoppingcart.services;

import java.util.List;
import java.util.Optional;
import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.inoptra.assessment.shoppingcart.models.entities.Vendor;
import com.inoptra.assessment.shoppingcart.repositories.VendorRepository;

/**
* @Author: Shrikrishna Prabhumirashi
* @Description:
* VendorService - Service layer for Vendor object
**/

@Service
public class VendorService {

    private static final Logger logger = Logger.getLogger(VendorService.class.getName());
    
	@Autowired
	private VendorRepository vendorRepository;
	
	public List<Vendor> getAllVendors(){
		
		logger.info("VendorService::getAllVendors ==> Searching for all Vendors");
		
		return vendorRepository.findAll();
	}
	
	
	public Optional<Vendor> getVendor(Long vid){
		
		logger.info("VendorService::getVendor ==> Searching for a Vendor with id = " + vid);
		
		return vendorRepository.findById(vid);
	}
	
	
	public Vendor saveOrUpdate(Vendor vendor) {
		
		logger.info("VendorService::saveOrUpdate ==> Vendor = " + vendor.toString());
		
		return vendorRepository.save(vendor);
	}
	
    public void deleteById(Long id) {

        logger.info("VendorService::deleteById ==> id = " + id);

        vendorRepository.deleteById(id);
    }
}
