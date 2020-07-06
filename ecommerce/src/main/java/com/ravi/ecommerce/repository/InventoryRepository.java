package com.ravi.ecommerce.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.ravi.ecommerce.entity.Inventory;

public interface InventoryRepository extends JpaRepository<Inventory, Long> {

	@Query("select inv from Inventory inv where inv.brandName = :brandName")
	List<Inventory> findByBrandName(@Param("brandName") String brandName);

	@Query("select inv from Inventory inv where inv.size = :size")
	List<Inventory> findBySize(@Param("size") String size);

	@Query("select inv from Inventory inv where inv.color = :color")
	List<Inventory> findByColor(@Param("color") String color);

	@Query("select sum(inv.quantity) from Inventory inv group by inv.supplierId having inv.supplierId = :seller")
	int getAvailableNumberOfProductBySeller(@Param("seller") Long seller);

}
