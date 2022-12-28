package com.springcashloan.springcashloan.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/borrower")
public class BorrowerController {

    @GetMapping("/home")
    public String forBorrower(){
        return "borrower/home";
    }
}
