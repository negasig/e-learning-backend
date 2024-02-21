package com.elearning.elearning.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.elearning.elearning.models.User;

public interface UserRepository extends JpaRepository<User, Integer> {

}
