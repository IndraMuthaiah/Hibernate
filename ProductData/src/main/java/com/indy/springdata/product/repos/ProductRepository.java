package com.indy.springdata.product.repos;

import org.springframework.data.repository.CrudRepository;

import com.indy.springdata.product.entities.Product;

public interface ProductRepository extends CrudRepository<Product, Integer> {

}
