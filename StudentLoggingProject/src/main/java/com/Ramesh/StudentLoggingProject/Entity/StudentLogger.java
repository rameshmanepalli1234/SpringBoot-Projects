package com.Ramesh.StudentLoggingProject.Entity;

import org.apache.tomcat.jni.Local;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name="student_logger")
public class StudentLogger {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name="request_type")
    private String requestType;

    @Column(name="time_Stamp")
    private LocalDateTime timeStamp;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getRequestType() {
        return requestType;
    }

    public void setRequestType(String requestType) {
        this.requestType = requestType;
    }

    public LocalDateTime getTimeStamp() {
        return timeStamp;
    }

    public void setTimeStamp(LocalDateTime timeStamp) {
        this.timeStamp = timeStamp;
    }

    public StudentLogger(LocalDateTime timeStamp, String requestType) {
        this.requestType = requestType;
        this.timeStamp = timeStamp;
    }

    public StudentLogger() {

    }
}
