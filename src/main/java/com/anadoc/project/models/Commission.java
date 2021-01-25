package com.anadoc.project.models;


import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
public class Commission {
    @Id
    @GeneratedValue
    private int id;
    private String firstName;
    private String lastName;
    private String birthday;
    @Column(unique = true)
    private String username;
    private String password;

    @OneToMany(mappedBy = "commission")
    private List<Teacher> teachers;

    @OneToMany(mappedBy = "commission")
    private List<Course> courses;

    public Commission(int id, String firstName, String lastName, String birthday, String username, String password) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthday = birthday;
        this.username = username;
        this.password = password;
    }

    public Commission(){}

    public int getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public List<Teacher> getTeachers() {
        return teachers;
    }

    public List<Course> getCourses() {
        return courses;
    }
}
