package com.anadoc.project.controller;

import com.anadoc.project.models.Teacher;
import com.anadoc.project.service.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TeacherController {

    @Autowired
    private TeacherService service;

    @PostMapping("/addTeacher")
    public Teacher addTeacher(@RequestBody Teacher teacher){
        return service.saveTeacher(teacher);
    }
}
