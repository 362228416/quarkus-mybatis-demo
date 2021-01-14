package com.cs.web;

import com.cs.dao.UserMapper;
import com.cs.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Autowired
    UserMapper userMapper;

    @GetMapping("/users")
    public Object users() {
        return userMapper.findAll();
    }

    @GetMapping("/users/get")
    public Object get(@RequestParam("id") int id) {
        return userMapper.findById(id);
    }

    @GetMapping("/users/save")
    public Object save(@RequestParam("username") String username, @RequestParam("password") String password) {
        User user = new User();
        user.setUsername(username);
        user.setPassword(password);
        return userMapper.insert(user);
    }

}
