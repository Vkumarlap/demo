package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @GetMapping("/user")
    public User getUser() {
      User user=new User();
      user.setName("kumar");
      user.setAge(22);
      user.setId(203);
    
           return user;
    }
}
