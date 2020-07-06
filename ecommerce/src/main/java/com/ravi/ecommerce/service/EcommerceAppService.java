package com.ravi.ecommerce.service;

import java.util.List;
import com.ravi.ecommerce.entity.Inventory;

public interface EcommerceAppService {

	List<Inventory> getInventoryDeatilsByBrand(String brandName) throws Exception;

	List<Inventory> getInventoryDeatilsBySize(String size) throws Exception;

	List<Inventory> getInventoryDeatilsByColor(String color) throws Exception;

	int getAvailableNumberOfProductBySeller(Long seller);

}
