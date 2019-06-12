package com.herbert.service;

import com.herbert.domain.Student;
import com.herbert.mapper.StudentMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author Herbert
 * @create 2019-06-11 16:00
 */
@Service
@Transactional
public class StudentServiceImpl implements StudentService{

    @Autowired
    private StudentMapper studentMapper;

    @Override
    public Integer addStudent(Student student) {

        Integer studentId = studentMapper.saveStudent(student);

        return studentId;
    }
}
