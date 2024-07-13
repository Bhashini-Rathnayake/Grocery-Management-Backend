package com.example.grocerymanagement.dao;

import com.example.grocerymanagement.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderDao extends JpaRepository<Order,Integer> {
    Order findByOrderId(Integer orderId);

    Order getOrderByOrderId(Integer orderID);

}
