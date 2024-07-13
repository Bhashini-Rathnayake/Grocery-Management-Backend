package com.example.grocerymanagement.dao;

import com.example.grocerymanagement.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserDao extends JpaRepository<User,Integer> {
    User findByUserNameAndUserPassword(String UserName, String UserPassword);
}
