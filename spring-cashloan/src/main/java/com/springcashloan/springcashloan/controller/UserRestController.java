package com.springcashloan.springcashloan.controller;

import com.springcashloan.springcashloan.model.User;
import com.springcashloan.springcashloan.repo.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/borrower")
public class UserRestController {

    private final UserRepo userRepo;

    @Autowired
    public UserRestController(UserRepo userRepo) {
        this.userRepo = userRepo;
    }

    @PostMapping("/create-user")
    public User createUser(@RequestBody User user){
        System.out.println("user created!");
        User newUser =  userRepo.save(user);
        return newUser;
    }

    @GetMapping("/get-all-users")
    public List<User> getAllEmployee(){
        System.out.println("user get!");
        List<User> allUserList = userRepo.findAll();
        return allUserList;
    }
}
