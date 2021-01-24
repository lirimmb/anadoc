package com.anadoc.project.models;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
public class Course {

    @Id
    @GeneratedValue
    private int id;
    @Column(unique = true)
    private String name;
    private String description;
    private Date createdDate;

    @OneToMany()
    List<Document> documents;

    @ManyToOne
    private Commission commission;

    @ManyToOne
    private Teacher teacher;

    public Course(int id, String name, String description, Date createdDate, Commission commission, Teacher teacher) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.createdDate = createdDate;
        this.commission = commission;
        this.teacher = teacher;
    }

    public Course(){}

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

    public Date getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }

    public List<Document> getDocuments() {
        return documents;
    }

    public Commission getCommission() {
        return commission;
    }

    public Teacher getTeacher() {
        return teacher;
    }
}
