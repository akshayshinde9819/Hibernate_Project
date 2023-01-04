package com.jsp.controller;

import com.jsp.dto.Product;
import com.jsp.service.ProductService;

public class GetProductById {
 public static void main(String[] args) {
	 
	ProductService productservice=new ProductService();
	
	Product product = new Product();
	if(product !=null) {
		product.setId(1);
		
		productservice.getProductById(product);
		Product product3= productservice.getProductById(product);
	}
	else {
			System.out.println("Product Not Found");
		}
	}
}

