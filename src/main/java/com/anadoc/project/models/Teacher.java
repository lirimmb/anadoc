package com.anadoc.project.models;


import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
public class Teacher {

    @Id
    @GeneratedValue()
    private int id;
    private String firstName;
    private String lastName;
    private String birthday;
    @Column(unique = true)
    private String username;
    private String password;

    @OneToMany(mappedBy = "teacher")
    private List<Document> documents;

    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinColumn(name = "commission")
    private Commission commission;

    @OneToMany(mappedBy = "teacher")
    private List<Course> courses;


    public Teacher(int id, String firstName, String lastName, String birthday, String username, String password) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthday = birthday;
        this.username = username;
        this.password = password;
    }

    public Teacher(){}

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

    public List<Document> getDocuments() {
        return documents;
    }

    public Commission getCommission() {
        return commission;
    }

    public List<Course> getCourses() {
        return courses;
    }
}
