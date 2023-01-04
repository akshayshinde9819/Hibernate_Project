package com.jsp.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.jsp.dto.Product;

public class ProductDao {
	EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("akshay");
	EntityManager entityManager=entityManagerFactory.createEntityManager();
	EntityTransaction entityTransaction=entityManager.getTransaction();
	
	public Product saveProduct(Product product) {
		
		entityTransaction.begin();
		entityManager.persist(product);
		entityTransaction.commit();
		
		return product;
	}
public Product updateProduct(Product product) {
	Product product1= entityManager.find(Product.class, product.getId());
	product.setName("Jeans");
	
		
		entityTransaction.begin();
		entityManager.persist(product);
		entityTransaction.commit();
		
		return product;
	}
	
public Product deleteProduct(Product product) {
	Product product1= entityManager.find(Product.class, product.getId());
	
	
		
		entityTransaction.begin();
		entityManager.persist(product);
		entityTransaction.commit();
		
		return product;
	}
	
	
	public Product getProductById(Product product) {
		Product product1= entityManager.find(Product.class, product.getId());
		product.setId(product.getId());
		
		if(product1 !=null) {
			System.out.println("Product of entity"+product.getId()+"is");
			System.out.println(product1.getBrand());
			System.out.println(product1.getName());
			System.out.println(product1.getType());
			System.out.println(product1.getPrice());
		}else {
			System.out.println("Entity of Product is Not Available");
		}
		return product;
				
	}
	public Product getAllProduct(Product product) {
		String sql = "select p from p";
		Query query = entityManager.createQuery(sql);
		List<Product> products = query.getResultList();
		
		for(Product p : products) {
			System.out.println("=============");
			System.out.println(p.getId());
			System.out.println(p.getBrand());
			System.out.println(p.getName());
			System.out.println(p.getType());
			System.out.println(p.getPrice());
		}
		return product;
	}
}
