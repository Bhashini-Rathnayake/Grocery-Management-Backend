package com.example.grocerymanagement.service;

import com.example.grocerymanagement.dao.UserDao;
import com.example.grocerymanagement.model.User;
import com.example.grocerymanagement.model.dto.UserDTO;
import com.example.grocerymanagement.model.dto.UserRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class  UserService {
    @Autowired
    private UserDao userDao;

    public UserDTO getLoggedUser (UserRequest userRequest){
        User user = this.userDao.findByUserNameAndUserPassword(userRequest.getUserName(),userRequest.getPassword());

        UserDTO userDTO = null;

        if (user !=null){
            userDTO= new UserDTO(user);
        }
        return userDTO;
    }
}
