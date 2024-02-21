package com.elearning.elearning.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.elearning.elearning.models.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Integer>{

}
