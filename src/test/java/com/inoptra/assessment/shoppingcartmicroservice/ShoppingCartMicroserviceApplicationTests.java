package com.inoptra.assessment.shoppingcartmicroservice;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.inoptra.assessment.shoppingcartmicroservice.models.ProductItem;
import com.inoptra.assessment.shoppingcartmicroservice.repositories.ProductRepository;
import com.inoptra.assessment.shoppingcartmicroservice.services.ProductService;

@SpringBootTest
class ShoppingCartMicroserviceApplicationTests {

    @Mock
    private ProductRepository productRepository;

    @Autowired
    private ProductService productService;

    @Test
    void contextLoads() {
    }

    @Test
    void whenSaved_thenFindsByName() {
        /*ProductItem productItem = new ProductItem(1L, "iPhone 13 Pro Max", "iPhone 13 Pro Max", "iPhone", "Black", 139900, "01/05/2022", "01/05/2025", "testUser1", "08/06/2022", "testUser1", "08/06/2022");
        productRepository.save(productItem);
        assertThat(productRepository.findByName("iPhone 13 Pro Max")).isNotNull();*/
    }
}
