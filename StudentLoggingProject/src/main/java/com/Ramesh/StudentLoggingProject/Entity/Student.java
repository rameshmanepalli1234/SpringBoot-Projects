package com.Ramesh.StudentLoggingProject.Entity;

import com.Ramesh.StudentLoggingProject.Controller.StudentController;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name="Students")
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name="name")
    private String name;

    @Column(name="course")
    private String course;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public Student(String name, String course)
    {
        this.name = name;
        this.course = course;
    }

    public Student() {

    }
}
