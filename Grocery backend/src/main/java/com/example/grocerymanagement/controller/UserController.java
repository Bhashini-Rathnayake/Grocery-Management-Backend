package com.example.grocerymanagement.controller;
import com.example.grocerymanagement.model.dto.UserDTO;
import com.example.grocerymanagement.model.dto.UserRequest;
import com.example.grocerymanagement.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping(value = "/getLoggedUser", method = RequestMethod.POST)
    public ResponseEntity<UserDTO> getLoggedUser(@RequestBody UserRequest userRequest){
        UserDTO userDTO = this.userService.getLoggedUser(userRequest);

        return new ResponseEntity<>(userDTO, HttpStatus.OK);
    }
}
