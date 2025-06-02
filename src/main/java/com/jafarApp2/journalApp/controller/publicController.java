package com.jafarApp2.journalApp.controller;


import com.jafarApp2.journalApp.entity.User;
import com.jafarApp2.journalApp.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/public")
public class publicController {

    @Autowired
    private UserService userService;

    @GetMapping("/check")
    public String HealthCheck(){
        return  "Ok";
    }

    @PostMapping("create-user")
    public void createUser(@RequestBody User user){
        userService.saveNewUser(user);
    }
}
