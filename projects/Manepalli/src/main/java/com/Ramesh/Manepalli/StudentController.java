package com.Ramesh.Manepalli;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class StudentController {
    @Autowired
    private StudentService service;

    @GetMapping("/students")
    public List<Student> list()
    {
        return service.listAll();
    }
    @GetMapping("/students/{id}")
    public ResponseEntity<Student> get(@PathVariable Integer id)
    {
        try
        {
            Student student=service.get(id);
            return new ResponseEntity<Student>(student, HttpStatus.OK);
        }
        catch(Exception e)
        {
               return new ResponseEntity<Student>(HttpStatus.NOT_FOUND);
        }
    }
    @PostMapping("/students/")
    public void add(@RequestBody Student student)
    {
        service.save(student);
    }
    @DeleteMapping("/students/{id}")
    public void delete(@PathVariable Integer id)
    {
        service.delete(id);
    }

}
