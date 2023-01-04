package com.jsp.controller;

import com.jsp.dto.Product;
import com.jsp.service.ProductService;

public class GetAllProduct {

	ProductService productservice=new ProductService();
	
	Product product = new Product();
	
	Product product2 = productservice.getAllProduct(product);
}
