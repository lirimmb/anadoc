package com.anadoc.project.controller;

import com.anadoc.project.models.Teacher;
import com.anadoc.project.service.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class TeacherController {

    @Autowired
    private TeacherService service;

    @PostMapping("/addTeacher")
    public Teacher addTeacher(@RequestBody Teacher teacher){
        return service.saveTeacher(teacher);
    }

    @PostMapping("/addTeachers")
    public List<Teacher> addTeachers(List<Teacher>teachers){
        return service.saveTeachers(teachers);
    }

    @GetMapping("/teachers")
    public List<Teacher> findAllTeachers(){
        return service.getAllTeachers();
    }

    @GetMapping("/teacher/{id}")
    public Teacher getTeacherById(@PathVariable int id){
        return service.getTeacherById(id);
    }

    @PutMapping("/update")
    public Teacher updateTeacher(@RequestBody Teacher teacher){
        return service.update(teacher);
    }

    @DeleteMapping("/delete/{id}")
    public String deleteTeacher(@PathVariable int id){
        return service.deleteTeacher(id);
    }

}
