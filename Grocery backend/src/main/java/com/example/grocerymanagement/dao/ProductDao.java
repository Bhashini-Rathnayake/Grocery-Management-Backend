package com.example.grocerymanagement.dao;

import com.example.grocerymanagement.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductDao extends JpaRepository<Product, Integer> {

    Product findByProductId(Integer productID);

    Product getProductByProductId(Integer productID);
}
