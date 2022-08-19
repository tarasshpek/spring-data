package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.PostConstruct;
import java.util.Arrays;

@SpringBootApplication
public class DemoApplication {

	@Autowired
	private ProductRepository productRepository;

	@PostConstruct
	void init() {
		Product product1 = new Product("Mars", 10);
		Product product2 = new Product("Snickers", 15);
		Product product3 = new Product("Snickers", 20);
//		productRepository.saveAll(Arrays.asList(product1, product3, product2));
		productRepository.saveWithNameSuffix(product1);
		productRepository.saveWithNameSuffix(product2);
		productRepository.saveWithNameSuffix(product3);
	}

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

}
