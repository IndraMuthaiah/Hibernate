package com.indy.springdata.product;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.util.Optional;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.indy.springdata.product.entities.Product;
import com.indy.springdata.product.repos.ProductRepository;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ProductDataApplicationTests {

	@Autowired
	ProductRepository repository;

	@Test
	public void contextLoads() {
	}

	@Test
	public void testCreate() {
		Product product = new Product();
		product.setId(1);
		product.setName("Iphone");
		product.setDesc("6S");
		product.setPrice(80000.0);
		repository.save(product);
	}

	@Test
	public void testRead() {
		Optional<Product> product1 = repository.findById(1);
		assertNotNull(product1);
		if (product1.isPresent()) {
			Product prod = product1.get();
			assertEquals("Equals", "Iphone", prod.getName());
			System.out.println("***************" + prod.getDesc() + "****************");
		}
	}

	@Test
	public void testUpdate() {
		Optional<Product> result = repository.findById(1);
		if (result.isPresent()) {
			Product prod = result.get();
			prod.setPrice(70000.00);
			repository.save(prod);
		}
	}

	@Test
	public void testDelete() {
		repository.deleteById(1);
	}
}
