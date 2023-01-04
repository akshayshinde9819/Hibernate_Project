package com.jsp.service;

import com.jsp.dao.ProductDao;
import com.jsp.dto.Product;

public class ProductService {

	public Product saveProduct(Product product) {
		ProductDao productDao = new ProductDao();
		return productDao.saveProduct(product);
	}
	public Product getProductById(Product product) {
		ProductDao productDao = new ProductDao();
		return productDao.getProductById(product);
	}
	public Product getAllProduct(Product product) {
		ProductDao productDao = new ProductDao();
		return productDao.getAllProduct(product);
	}
	public Product deleteProduct(Product product) {
		ProductDao productDao = new ProductDao();
		return productDao.deleteProduct(product);
	}
	public Product updateProduct(Product product) {
		ProductDao productDao = new ProductDao();
		return productDao.updateProduct(product);
	}
	
	
}
