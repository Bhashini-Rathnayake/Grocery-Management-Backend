package com.example.grocerymanagement.service;

import com.example.grocerymanagement.dao.CustomerDao;
import com.example.grocerymanagement.dao.OrderDao;
import com.example.grocerymanagement.dao.ProductDao;
import com.example.grocerymanagement.model.Customer;
import com.example.grocerymanagement.model.Order;
import com.example.grocerymanagement.model.Product;
import com.example.grocerymanagement.model.dto.OrderDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class OrderService {

    @Autowired
    private OrderDao orderDao;

    @Autowired
    private CustomerDao customerDao;

    @Autowired
    private ProductDao productDao;

    public List<OrderDTO> getAllOrder(){
        List <Order> orders =this.orderDao.findAll();

        List<OrderDTO> orderDTOS= new ArrayList<>();

        for (Order order:orders){
            OrderDTO orderDTO = new OrderDTO(order);

            orderDTOS.add(orderDTO);
        }
        return orderDTOS;
    }

//    public void getOrderByID(Integer orderID){
//        Order order1 = orderDao.findByOrderId(orderID);
//        System.out.println(order1);
//    }

    public OrderDTO getOrderById(Integer orderID){
        Order order = this.orderDao.getOrderByOrderId(orderID);
        return new OrderDTO(order);
    }


    public OrderDTO saveAndUpdateOrder (OrderDTO orderDTO){
        Order existingOrder = null;

        if (orderDTO.getOrderId()!= null){
            existingOrder = this.orderDao.getOrderByOrderId(orderDTO.getOrderId());
        }else {
            existingOrder = new Order();
        }

        Customer customer = customerDao.getCustomerByCustomerId(orderDTO.getCustomerId());
        Product product = productDao.getProductByProductId( orderDTO.getProductId());

        existingOrder.setInvoiceNumber(orderDTO.getInvoiceNumber());
        existingOrder.setOrderDate(orderDTO.getOrderDate());
        existingOrder.setCustomer(customer);
        existingOrder.setProduct(product);
        existingOrder.setQuantity(orderDTO.getQuantity());
        existingOrder.setAmount(orderDTO.getAmount());
        existingOrder.setPaymentMethod(orderDTO.getPaymentMethod());
        existingOrder.setStatus(orderDTO.getStatus());

        existingOrder = orderDao.saveAndFlush(existingOrder);

        return new OrderDTO(existingOrder);

        }


}
