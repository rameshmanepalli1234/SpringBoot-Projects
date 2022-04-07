package com.Ramesh.StudentLoggingProject.Repository;

import com.Ramesh.StudentLoggingProject.Entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student,Integer> {
}
