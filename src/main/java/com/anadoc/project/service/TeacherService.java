package com.anadoc.project.service;


import com.anadoc.project.models.Teacher;
import com.anadoc.project.repository.TeacherRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TeacherService {

    @Autowired
    private TeacherRepository teacherRepository;

    public Teacher saveTeacher(Teacher teacher){
        return teacherRepository.save(teacher);
    }

    public List<Teacher> saveTeachers(List<Teacher> teachers){
        return teacherRepository.saveAll(teachers);
    }

    public List<Teacher> getAllTeachers(){
        return teacherRepository.findAll();
    }

    public Teacher getTeacherById(int id){
        return teacherRepository.findById(id).orElse(null);
    }

    public String deleteTeacher(int id){
        teacherRepository.deleteById(id);
        return "Teacher deleted!";
    }

    public Teacher updated(Teacher teacher){
        Teacher existingTeacher = teacherRepository.findById(teacher.getId()).orElse(null);
        existingTeacher.setFirstName(teacher.getFirstName());
        existingTeacher.setLastName(teacher.getLastName());
        existingTeacher.setBirthday(teacher.getBirthday());
        existingTeacher.setUsername(teacher.getUsername());
        existingTeacher.setPassword(teacher.getPassword());
        return existingTeacher;
    }
}
