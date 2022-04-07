package com.Ramesh.StudentLoggingProject.Controller;

import com.Ramesh.StudentLoggingProject.Entity.Student;
import com.Ramesh.StudentLoggingProject.Entity.StudentLogger;
import com.Ramesh.StudentLoggingProject.Exception.ResourceNotFoundException;
import com.Ramesh.StudentLoggingProject.Repository.StudentLoggerRepository;
import com.Ramesh.StudentLoggingProject.Repository.StudentRepository;
import org.apache.tomcat.jni.Local;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.List;

@RestController
@RequestMapping("/student")
public class StudentController {

    @Autowired
    private StudentRepository studentRepository;

    @Autowired
    private StudentLoggerRepository studentLoggerRepository;


    @GetMapping
    public List<Student> getAllStudents()
    {
        String requestType="GET/student";
        LocalDateTime timeStamp= LocalDateTime.now();
        StudentLogger studentLogger=new StudentLogger();
        studentLogger.setTimeStamp(timeStamp);
        studentLogger.setRequestType(requestType);
        studentLoggerRepository.save(studentLogger);
        return studentRepository.findAll();
    }

    @PostMapping
    public Student createStudent( @RequestBody Student student)
    {
        String requestType="POST/student";
        LocalDateTime timeStamp= LocalDateTime.now();
        StudentLogger studentLogger=new StudentLogger();
        studentLogger.setTimeStamp(timeStamp);
        studentLogger.setRequestType(requestType);
        studentLoggerRepository.save(studentLogger);
        return studentRepository.save(student);
    }


    @GetMapping("{id}")
    public ResponseEntity<Student> getStudentById(@PathVariable int id)
    {
        String requestType="GET/student"+id;
        LocalDateTime timeStamp= LocalDateTime.now();
        StudentLogger studentLogger=new StudentLogger();
        studentLogger.setTimeStamp(timeStamp);
        studentLogger.setRequestType(requestType);
        studentLoggerRepository.save(studentLogger);

        Student student=studentRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Student not exist with id"+ id));
        return ResponseEntity.ok(student);
    }


    @PutMapping("{id}")
    public ResponseEntity<Student> updateStudent(@PathVariable int id,@RequestBody Student studentDetails)
    {
        String requestType="PUT/student";
        LocalDateTime timeStamp= LocalDateTime.now();
        StudentLogger studentLogger=new StudentLogger();
        studentLogger.setTimeStamp(timeStamp);
        studentLogger.setRequestType(requestType);
        studentLoggerRepository.save(studentLogger);
        Student updateStudent = studentRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Student not exist with id" + id));
        updateStudent.setName(studentDetails.getName());
        updateStudent.setCourse(studentDetails.getCourse());
        studentRepository.save(updateStudent);
        return  ResponseEntity.ok(updateStudent);
    }


    @DeleteMapping("{id}")
    public ResponseEntity<HttpStatus> deleteStudent(@PathVariable int id)
    {
        String requestType="DELETE/student";
        LocalDateTime timeStamp= LocalDateTime.now();
        StudentLogger studentLogger=new StudentLogger();
        studentLogger.setTimeStamp(timeStamp);
        studentLogger.setRequestType(requestType);
        studentLoggerRepository.save(studentLogger);
        Student student=studentRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Student not exist with id"+ id));
        studentRepository.delete(student);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);

    }

}
