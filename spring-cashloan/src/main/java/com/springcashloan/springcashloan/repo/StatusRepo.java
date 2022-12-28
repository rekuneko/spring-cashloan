package com.springcashloan.springcashloan.repo;

import com.springcashloan.springcashloan.model.Status;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface StatusRepo extends JpaRepository<Status, Integer> {


    public List<Status> findStatusById(Integer id);
}
