package com.Ramesh.StudentLoggingProject.Controller;

import com.Ramesh.StudentLoggingProject.Entity.StudentLogger;
import com.Ramesh.StudentLoggingProject.Repository.StudentLoggerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/logging")
public class StudentLoggerController {

    @Autowired
    private StudentLoggerRepository studentLoggerRepository;

    @GetMapping
    public List<StudentLogger> getAllRequest()
    {
        return studentLoggerRepository.findAll();
    }
}

