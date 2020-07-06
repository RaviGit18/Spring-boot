package com.ravi.ecommerce.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import com.ravi.ecommerce.entity.Inventory;
import com.ravi.ecommerce.repository.InventoryRepository;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
public class EcommerceAppServiceImpl implements EcommerceAppService {

	@Autowired
	InventoryRepository inventoryRepository;

	@Override
	public List<Inventory> getInventoryDeatilsByBrand(String brandName) throws Exception {
		log.info("ENTERED INTO EcommerceAppServiceImpl.getInventoryDeatilsByBrand()");
		List<Inventory> inventoryList = inventoryRepository.findByBrandName(brandName);
		if (CollectionUtils.isEmpty(inventoryList)) {
			throw new Exception();
		}
		return inventoryList;
	}

	@Override
	public List<Inventory> getInventoryDeatilsBySize(String size) throws Exception {
		log.info("ENTERED INTO EcommerceAppServiceImpl.getInventoryDeatilsBySize()");
		List<Inventory> inventoryList = inventoryRepository.findBySize(size);
		if (CollectionUtils.isEmpty(inventoryList)) {
			throw new Exception();
		}
		return inventoryList;
	}

	@Override
	public List<Inventory> getInventoryDeatilsByColor(String color) throws Exception {
		log.info("ENTERED INTO EcommerceAppServiceImpl.getInventoryDeatilsByColor()");
		List<Inventory> inventoryList = inventoryRepository.findByColor(color);
		if (CollectionUtils.isEmpty(inventoryList)) {
			throw new Exception();
		}
		return inventoryList;
	}

	@Override
	public int getAvailableNumberOfProductBySeller(Long seller) {
		log.info("ENTERED INTO EcommerceAppServiceImpl.getAvailableNumberOfProductBySeller()");
		int productCount = inventoryRepository.getAvailableNumberOfProductBySeller(seller);
		return productCount;
	}

}
