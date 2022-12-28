package com.springcashloan.springcashloan.controller;

import com.springcashloan.springcashloan.model.User;
import com.springcashloan.springcashloan.repo.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;
import java.util.concurrent.ExecutionException;

@Controller
public class UserController {

    @Autowired
    UserDetailsService userDetailsService;

    @Autowired
    UserRepo userRepo;

    @GetMapping("/users")
    public String getAllUsers(ModelMap model) throws ExecutionException, InterruptedException {
        //checking the current user role
        List<User> userList = userRepo.findAll();
        model.addAttribute("userList", userList);

        return "forAuthenticated/admin/userlist";
    }


}
