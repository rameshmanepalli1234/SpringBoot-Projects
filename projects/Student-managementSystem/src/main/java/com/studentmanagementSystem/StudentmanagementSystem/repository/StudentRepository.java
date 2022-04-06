package com.studentmanagementSystem.StudentmanagementSystem.repository;

import com.studentmanagementSystem.StudentmanagementSystem.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student,Long> {

}
