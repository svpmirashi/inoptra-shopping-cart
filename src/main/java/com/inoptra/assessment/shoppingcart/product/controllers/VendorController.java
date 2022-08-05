package com.inoptra.assessment.shoppingcart.product.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.inoptra.assessment.shoppingcart.product.models.Vendor;
import com.inoptra.assessment.shoppingcart.product.services.VendorService;

@RestController
@RequestMapping(value = "/vendors")
public class VendorController {
	@Autowired
	private VendorService vendorService;
	
	@GetMapping(value = "/")
	public List<Vendor> getAllVendors(){
		return vendorService.getAllVendors();
	}
	
	@GetMapping(value = "/{id}")
	public Vendor getVendor(@PathVariable(value = "id", required = true) int vid){
		return vendorService
					.getVendor(vid)
					.orElse(null);
	}
	
	@PutMapping(value = "/{id}")
	public Vendor update(@PathVariable(value = "id", required = true) int vid, @RequestBody Vendor vendor) {
		Optional<Vendor> vendorOpt = vendorService.getVendor(vid);
		
		if(vendorOpt.isPresent()) { 
			return vendorService.saveOrUpdate(vendor);
		}
		return vendorService.saveOrUpdate(vendor);
	}
	
	@PostMapping(value = "/save")
	public Vendor save(@RequestBody Vendor vendor) {
		return vendorService.saveOrUpdate(vendor);
	}
}
