package com.springcashloan.springcashloan.repo;

import com.springcashloan.springcashloan.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UserRepo extends JpaRepository<User, Integer> {

    public User findByUsername(String username);
    public List<User> findByRole(String role);
}
