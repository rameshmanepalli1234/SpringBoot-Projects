package com.Ramesh.Manepalli;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {
    @Autowired
    private StudentRepository repo;

    //creating functions

    public List<Student> listAll()
    {
        return repo.findAll();
    }
    public void save(Student student) {
        repo.save(student);
    }
    public Student get(Integer id)
    {
        return repo.findById(id).get();
    }
    public void delete(Integer id)
    {
        repo.deleteById(id);
    }

    }



