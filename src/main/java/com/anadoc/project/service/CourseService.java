package com.anadoc.project.service;

import com.anadoc.project.models.Course;
import com.anadoc.project.repository.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CourseService {

    @Autowired
    private CourseRepository courseRepository;

    public Course saveCourse(Course course){
        return courseRepository.save(course);
    }

    public List<Course> saveCourses(List<Course> courses){
        return courseRepository.saveAll(courses);
    }

    public List<Course> getAllCourses(){
        return courseRepository.findAll();
    }

    public Course getCourseById(int id){
        return courseRepository.findById(id).orElse(null);
    }

    public String deleteCourse(int id){
        courseRepository.deleteById(id);
        return "Course deleted!";
    }

    public Course update(Course course){
        Course existingCourse = courseRepository.findById(course.getId()).orElse(null);
        existingCourse.setName(course.getName());
        existingCourse.setDescription(course.getDescription());
        return existingCourse;
    }
}
