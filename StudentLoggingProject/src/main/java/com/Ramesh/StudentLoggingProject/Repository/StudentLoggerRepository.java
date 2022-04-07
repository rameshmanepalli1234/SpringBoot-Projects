package com.Ramesh.StudentLoggingProject.Repository;

import com.Ramesh.StudentLoggingProject.Entity.StudentLogger;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentLoggerRepository extends JpaRepository<StudentLogger,Integer> {
}
