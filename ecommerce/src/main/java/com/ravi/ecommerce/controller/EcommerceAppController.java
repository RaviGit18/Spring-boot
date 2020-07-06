package com.ravi.ecommerce.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.ravi.ecommerce.entity.Inventory;
import com.ravi.ecommerce.service.EcommerceAppService;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
public class EcommerceAppController {

	@Autowired
	EcommerceAppService ecommerceAppService;

	@GetMapping("/brand/{brandName}")
	public List<Inventory> getInventoryDeatilsByBrandGet(@PathVariable("brandName") String brandName) throws Exception {
		log.info("ENTERED INTO EcommerceAppController.getInventoryDeatilsByBrandGet()");
		List<Inventory> inventoryList = ecommerceAppService.getInventoryDeatilsByBrand(brandName);

		return inventoryList;
	}

	@GetMapping("/color/{color}")
	public List<Inventory> getInventoryDeatilsByColorGet(@PathVariable("color") String color) throws Exception {
		log.info("ENTERED INTO EcommerceAppController.getInventoryDeatilsByColorGet()");
		List<Inventory> inventoryList = ecommerceAppService.getInventoryDeatilsByColor(color);

		return inventoryList;
	}

	@GetMapping("/size/{size}")
	public List<Inventory> getInventoryDeatilsBySizeGet(@PathVariable("size") String size) throws Exception {
		log.info("ENTERED INTO EcommerceAppController.getInventoryDeatilsBySizeGet()");
		List<Inventory> inventoryList = ecommerceAppService.getInventoryDeatilsBySize(size);

		return inventoryList;
	}

	@GetMapping("/productCount/{seller}")
	public int getAvailableNumberOfProductBySeller(@PathVariable("seller") Long seller) {
		log.info("ENTERED INTO EcommerceAppController.getInventoryDeatilsBySizeGet()");
		int productCount = ecommerceAppService.getAvailableNumberOfProductBySeller(seller);
		return productCount;
	}
}
