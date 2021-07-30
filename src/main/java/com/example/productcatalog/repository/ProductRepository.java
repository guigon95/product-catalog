package com.example.productcatalog.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.productcatalog.model.Product;

@Repository
public interface ProductRepository extends CrudRepository<Product, Long> {

	
}
