package com.jsp.controller;

import com.jsp.dto.Product;
import com.jsp.service.ProductService;

public class TestUpdateProduct {

	public static void main(String[] args) {
		ProductService productservice = new ProductService();
		
		Product product = new Product();
		product.setId(1);
		
		Product product2 = productservice.updateProduct(product);
		
		if(product2 !=null) {
			System.out.println("Product Updated");
		}
		else {
			System.out.println("Not Updated");
		}
	}

}
