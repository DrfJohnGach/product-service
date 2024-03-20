package com.drfjohngach.productservice;

import com.drfjohngach.productservice.model.Product;
import com.drfjohngach.productservice.repository.ProductRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.math.BigDecimal;

@SpringBootApplication
public class ProductServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProductServiceApplication.class, args);
	}

	@Bean
	CommandLineRunner runner(ProductRepository repository){
		return args -> {
			Product product = new Product(
					"Iphone 13",
					"Iphone 13",
					BigDecimal.valueOf(1200)
			);
			repository.insert(product);
		};
	}
}
