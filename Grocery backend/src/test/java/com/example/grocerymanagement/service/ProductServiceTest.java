package com.example.grocerymanagement.service;

import com.example.grocerymanagement.model.dto.ProductDTO;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class ProductServiceTest {

    @Autowired
    private ProductService productService;
    private ProductDTO productDTO;

//    @Test
//    void getAllProduct() {
//        this.productService.getAllProduct();
//    }

//    @Test
//    void getProductByID() {
//        productService.getProductByID(1);
//    }

    @Test
    void saveAndUpdateProduct() {
        ProductDTO products = new ProductDTO();
        products.setProductName("Kottu");
        products.setPrice(450);

        productService.saveAndUpdateProduct(products);
    }
}