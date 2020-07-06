package com.ravi.ecommerce;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;

import com.ravi.ecommerce.entity.Inventory;
import com.ravi.ecommerce.repository.InventoryRepository;
import com.ravi.ecommerce.service.EcommerceAppService;

@RunWith(SpringRunner.class)
@SpringBootTest
class EcommerceApplicationTests {

	@Autowired
	private EcommerceAppService ecommerceAppService;

	@MockBean
	private InventoryRepository inventoryRepository;

	@Test
	public void getInventoryDeatilsByBrandTest() throws Exception {
		when(inventoryRepository.findByBrandName("Invictus")).thenReturn(Stream
				.of(new Inventory(4000L, "Invictus", 800.00, "Black", "XL", "sku_100", 14, 3000L, 1000L),
						new Inventory(4001L, "Invictus", 600.00, "Black", "XS", "sku_101", 5, 3000L, 1000L))
				.collect(Collectors.toList()));
		assertEquals(2, ecommerceAppService.getInventoryDeatilsByBrand("Invictus").size());
	}

	@Test
	public void getInventoryDeatilsBySizeTest() throws Exception {
		when(inventoryRepository.findBySize("XL")).thenReturn(Stream
				.of(new Inventory(4000L, "Invictus", 800.00, "Black", "XL", "sku_100", 14, 3000L, 1000L),
						new Inventory(4002L, "Peter England", 300.00, "Blue", "XL", "sku_102", 1, 3000L, 1001L))
				.collect(Collectors.toList()));
		assertEquals(2, ecommerceAppService.getInventoryDeatilsBySize("XL").size());
	}

	@Test
	public void getInventoryDeatilsByColorTest() throws Exception {
		when(inventoryRepository.findByColor("Black")).thenReturn(Stream
				.of(new Inventory(4000L, "Invictus", 800.00, "Black", "XL", "sku_100", 14, 3000L, 1000L),
						new Inventory(4001L, "Invictus", 600.00, "Black", "XS", "sku_101", 5, 3000L, 1000L))
				.collect(Collectors.toList()));
		assertEquals(2, ecommerceAppService.getInventoryDeatilsByColor("Black").size());
	}

	@Test
	public void getAvailableNumberOfProductBySellerTest() throws Exception {
		when(inventoryRepository.getAvailableNumberOfProductBySeller(1000L)).thenReturn(21);
		assertEquals(21, ecommerceAppService.getAvailableNumberOfProductBySeller(1000L));
	}

}
