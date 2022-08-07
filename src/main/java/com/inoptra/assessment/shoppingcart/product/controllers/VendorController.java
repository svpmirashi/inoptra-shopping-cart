package com.inoptra.assessment.shoppingcart.product.controllers;

import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.inoptra.assessment.shoppingcart.product.models.entities.ProductItem;
import com.inoptra.assessment.shoppingcart.product.models.entities.Vendor;
import com.inoptra.assessment.shoppingcart.product.services.VendorService;

@RestController
@RequestMapping(value = "/vendors")
public class VendorController {
	final static Logger logger = LoggerFactory.getLogger(VendorController.class);
	
	@Autowired
	private VendorService vendorService;
	
	@GetMapping(value = {"/", ""})
	public List<Vendor> getAllVendors(){
		return vendorService.getAllVendors();
	}
	
	@GetMapping(value = {"/{id}", "/{id}/"})
	public Vendor getVendor(@PathVariable(value = "id", required = true) Long vid){
		Optional<Vendor> vendorOpt = vendorService
					.getVendor(vid);
		
		
		if(!vendorOpt.isPresent()) return null;
		//vendorOpt.get().getProductItemsForSale().forEach(x -> logger.info( x.toString()));
		return vendorOpt.get();
		
	}
	
	@GetMapping(value = { "/{id}/products", "/{id}/products/"})
	public List<ProductItem> getProductItemsFromVendor(@PathVariable(value = "id", required = true) Long vid){
		Optional<Vendor> vendorOpt = vendorService
					.getVendor(vid);
		
		
		if(!vendorOpt.isPresent()) return null;
		//vendorOpt.get().getProductItemsForSale().forEach(x -> logger.info( x.toString()));
		return vendorOpt.get().getProductItemsForSale();
		
	}
	
	@PutMapping(value = {"/{id}", "/{id}/"})
	public Vendor update(@PathVariable(value = "id", required = true) Long vid, @RequestBody Vendor vendor) {
		Optional<Vendor> vendorOpt = vendorService.getVendor(vid);
		
		if(vendorOpt.isPresent()) { 
			return vendorService.saveOrUpdate(vendor);
		}
		return vendorService.saveOrUpdate(vendor);
	}
	
	@PostMapping(value = { "/add", "/add/"})
	public Vendor save(@RequestBody Vendor vendor) {
		return vendorService.saveOrUpdate(vendor);
	}
}
