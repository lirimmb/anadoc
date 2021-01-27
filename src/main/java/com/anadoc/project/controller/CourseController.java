package com.anadoc.project.controller;

import com.anadoc.project.models.Commission;
import com.anadoc.project.models.Course;
import com.anadoc.project.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CourseController {

    @Autowired
    private CourseService service;

    @PostMapping("/addCourse")
    public Course addCourse(@RequestBody Course course){
        return service.saveCourse(course);
    }

    @PostMapping("/addCourses")
    public List<Course> addCourses(@RequestBody List<Course> courses){
        return service.saveCourses(courses);
    }

    @GetMapping("/courses")
    public List<Course> findAllCourses(){
        return service.getAllCourses();
    }

    @GetMapping("/course/{id}")
    public Course findCourseById(@PathVariable int id){
        return service.getCourseById(id);
    }

    @PutMapping("/update")
    public Course updateCourse(@RequestBody Course course){
        return service.update(course);
    }

    @DeleteMapping("/delete/{id}")
    public String deleteCourse(@PathVariable int id){
        return service.deleteCourse(id);
    }
}
