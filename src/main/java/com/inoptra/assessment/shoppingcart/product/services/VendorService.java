package com.inoptra.assessment.shoppingcart.product.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.inoptra.assessment.shoppingcart.product.models.entities.Vendor;
import com.inoptra.assessment.shoppingcart.product.repositories.VendorRepository;

@Service
public class VendorService {

	@Autowired
	private VendorRepository vendorRepository;
	
	public List<Vendor> getAllVendors(){
		return vendorRepository.findAll();
	}
	
	public Optional<Vendor> getVendor(Long vid){
		return vendorRepository.findById(vid);
	}
	
	public Vendor saveOrUpdate(Vendor vendor) {
		return vendorRepository.save(vendor);
	}
}
