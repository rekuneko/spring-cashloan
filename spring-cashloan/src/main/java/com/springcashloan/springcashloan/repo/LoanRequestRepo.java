package com.springcashloan.springcashloan.repo;

import com.springcashloan.springcashloan.model.LoanRequest;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface LoanRequestRepo extends JpaRepository<LoanRequest, Integer> {

}
