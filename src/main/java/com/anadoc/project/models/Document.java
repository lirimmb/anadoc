package com.anadoc.project.models;


import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;

@Entity
public class Document {

    @Id
    @GeneratedValue
    private int id;
    @Column(unique = true)
    private String name;
    private String description;
    private String format;
    private String createdDate;
    private double fileSize;

    @ManyToOne
    @JoinColumn(name = "teacher")
    private Teacher teacher;

    @ManyToOne
    @JoinColumn(name = "course")
    private Course course;


    public Document(int id, String name, String description, String format, String createdDate, double fileSize) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.format = format;
        this.createdDate = createdDate;
        this.fileSize = fileSize;
    }

    public Document(){}

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getFormat() {
        return format;
    }

    public void setFormat(String format) {
        this.format = format;
    }

    public String getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(String createdDate) {
        this.createdDate = createdDate;
    }

    public double getFileSize() {
        return fileSize;
    }

    public void setFileSize(double fileSize) {
        this.fileSize = fileSize;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public Course getCourse() {
        return course;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public void setCourse(Course course) {
        this.course = course;
    }
}
