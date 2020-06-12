package com.example.ws.api_ws_final.controller;

import com.example.ws.api_ws_final.config.DataConfig;
import com.example.ws.api_ws_final.dao.UserDao;
import com.example.ws.api_ws_final.dto.User;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

@Controller
public class UserController {

    UserDao userDao;

    public UserController(UserDao userDao) {
        this.userDao = userDao;
    }

    @PostMapping("/")
    public ResponseEntity<User> welcome(@RequestBody User user) throws SQLException {
        System.out.println(user);
        return new ResponseEntity<User>(userDao.getUserByUserNameAndPassword(user), HttpStatus.ACCEPTED);
    }
}
