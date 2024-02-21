package com.elearning.elearning.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.elearning.elearning.models.Teacher;
@Repository
public interface TeacherRepo extends JpaRepository<Teacher, Integer>{

}
