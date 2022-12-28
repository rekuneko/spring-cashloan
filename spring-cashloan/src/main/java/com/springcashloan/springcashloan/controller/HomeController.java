package com.springcashloan.springcashloan.controller;

import com.springcashloan.springcashloan.model.LenderShop;
import com.springcashloan.springcashloan.model.LoanRequest;
import com.springcashloan.springcashloan.model.TermRate;
import com.springcashloan.springcashloan.model.User;
import com.springcashloan.springcashloan.repo.LenderShopRepo;
import com.springcashloan.springcashloan.repo.LoanRequestRepo;
import com.springcashloan.springcashloan.repo.TermRateRepo;
import com.springcashloan.springcashloan.repo.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class HomeController {

    @Autowired
    private LenderShopRepo lenderShopRepo;
    @Autowired
    private UserRepo userRepo;
    @Autowired
    private TermRateRepo termRateRepo;
    @Autowired
    private LoanRequestRepo loanRequestRepo;

    @GetMapping({"/home", "/"})
    public String home() {
        return "home";
    }

    @GetMapping("/access-denied")
    public String access() {
        return "access-denied";
    }

//    @GetMapping("/rates")
//    public String rates(ModelMap m) {
//        m.addAttribute("rates", termRateRepo.findAll());
//        return "rates";
//    }

    @GetMapping("/home")
    public String home(Model model) {
        List<User> userList = userRepo.findAll();
        List<LoanRequest> loanRequests = loanRequestRepo.findAll();
        List<LenderShop> lenderShopList =  lenderShopRepo.findAll();
        List<TermRate> termRateList =  termRateRepo.findAll();
        System.out.println(userList);
        model.addAttribute("users",userList);
        model.addAttribute("loans",loanRequests);
        model.addAttribute("store",lenderShopList);
        model.addAttribute("rates",termRateList);
        return "home";
    }

    @GetMapping("/{*}")
    public String forNotFound() {
        return "/not-found";
    }


}
