package com.elearning.elearning.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.elearning.elearning.models.User;

import java.util.List;

public interface UserRepository extends JpaRepository<User, Integer> {
List<User> findByUsername(String username);
}
