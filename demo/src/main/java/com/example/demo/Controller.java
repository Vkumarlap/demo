package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
    
    User user;
    Controller(User user)
    {
        this.user=user;   
    }
    @GetMapping("/user")
    public User getUser() {
      user.setName("kumar");
      user.setAge(22);
      user.setId(203);
    
           return user;
    }
}
