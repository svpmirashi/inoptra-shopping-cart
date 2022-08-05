package com.inoptra.assessment.shoppingcart;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableAutoConfiguration
@EnableJpaRepositories(basePackages = "com.inoptra.assessment.shoppingcart.product.repositories")
@SpringBootApplication
public class ShoppingCartMicroserviceApplication {

    public static void main(String[] args) {
        SpringApplication.run(ShoppingCartMicroserviceApplication.class, args);
    }

}
