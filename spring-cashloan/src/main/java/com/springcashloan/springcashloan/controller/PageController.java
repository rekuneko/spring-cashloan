package com.springcashloan.springcashloan.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/page")
public class PageController {

    @GetMapping("/all")
    public String forAll(){
        return "forAll/page1";
    }

    @GetMapping("/manager")
    public String forManager(){
        return "forAuthenticated/manager";
    }


    @GetMapping("/admin")
    public String forAdmin(){
        return "forAuthenticated/admin/admin";
    }
    @GetMapping("/lender")
    public String forLender(){
        return "forAuthenticated/lender";
    }

    @GetMapping("/borrower")
    public String forBorrower(){
        return "forAuthenticated/borrower";
    }

    @GetMapping("/access_denied")
    public String forUnAuthorized(){
        return "/access_denied";
    }



}
