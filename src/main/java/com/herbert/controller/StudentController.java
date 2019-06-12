package com.herbert.controller;

import com.herbert.domain.Student;
import com.herbert.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author Herbert
 * @create 2019-06-11 15:49
 */
@Controller
public class StudentController {

    @Autowired
    private StudentService studentService;

    @RequestMapping(value = "/addStudent")
    public String addStudent(Student student){

        Integer studentId = studentService.addStudent(student);

        System.out.println("学生ID："+studentId);

        return "success";
    }
}
