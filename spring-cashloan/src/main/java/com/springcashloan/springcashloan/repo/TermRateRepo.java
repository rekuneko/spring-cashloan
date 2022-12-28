package com.springcashloan.springcashloan.repo;

import com.springcashloan.springcashloan.model.TermRate;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Date;
import java.util.List;

public interface TermRateRepo extends JpaRepository<TermRate, Integer> {
}
