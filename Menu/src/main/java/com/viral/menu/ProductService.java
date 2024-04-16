package com.viral.menu;

import java.util.List;
import java.util.Map;

import org.springframework.http.ResponseEntity;



public interface ProductService {
	 List<Product> getAllMenuItems();
	ResponseEntity<String> addNewProduct(Map<String,String> requestMap);
	
	ResponseEntity<String> updateMenuItem( Map<String, String> requestMap);

	ResponseEntity<String> deleteMenuItem(Integer productId);
	
	  List<String> getAllProductNames();
	
	
}
