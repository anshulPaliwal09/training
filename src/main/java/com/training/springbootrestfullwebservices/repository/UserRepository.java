package com.training.springbootrestfullwebservices.repository;

import com.training.springbootrestfullwebservices.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
