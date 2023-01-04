package com.jsp.controller;

import com.jsp.dto.Product;
import com.jsp.service.ProductService;

public class TestSavProduct {
public static void main(String[] args) {
	
	ProductService productService =new ProductService();
	
	Product product =new Product();
	product.setName("jeans");
	product.setBrand("Killer");
	product.setType("clothing");
	product.setPrice(2000);
	
	Product product2 = productService.saveProduct(product);
	if(product2 != null) {
		System.out.println("Product Inserted");
	}
	else {
			System.out.println("Not Inserted");
		}
	}
	
}

