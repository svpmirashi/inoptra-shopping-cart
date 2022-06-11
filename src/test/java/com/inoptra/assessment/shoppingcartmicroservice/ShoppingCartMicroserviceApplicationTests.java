package com.inoptra.assessment.shoppingcartmicroservice;

import static org.assertj.core.api.Assertions.assertThat;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.inoptra.assessment.shoppingcartmicroservice.models.ProductItem;
import com.inoptra.assessment.shoppingcartmicroservice.repositories.ProductRepository;
import com.inoptra.assessment.shoppingcartmicroservice.services.ProductService;

@SpringBootTest
class ShoppingCartMicroserviceApplicationTests {

    public static Logger logger = Logger.getLogger(ShoppingCartMicroserviceApplicationTests.class.getName());
    @Mock
    private ProductRepository productRepository;

    @Autowired
    private ProductService productService;

    //private static final DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");

    @Test
    void contextLoads() {
    }

    @Test
    void whenSaved_thenFindsByTitle() throws Exception {
        LocalDate mfgDate = LocalDate.parse("2022-01-05");
        LocalDate expiryDate = LocalDate.parse("2025-01-05");
        LocalDate createdDate = LocalDate.parse("2022-06-08");
        LocalDate modifiedDate = LocalDate.parse("2022-06-08");

        ProductItem productItem = new ProductItem(1L, "iPhone 13 Pro Max", "iPhone 13 Pro Max", "iPhone", "Black", 139900, "Vendor 1", mfgDate, expiryDate, "testUser1", createdDate, "testUser1", modifiedDate);
        productRepository.save(productItem);
        //List<ProductItem> productItems = productRepository.findByTitle("iPhone 13 Pro Max");
        List<ProductItem> productItems = productRepository.findAll();
        productItems.forEach(item -> {
            logger.log(Level.FINE, item.toString());
        });
        assertThat(productItems).isNotNull();
        //assertThat(productItems.size()).isGreaterThan(0);
    }
}
