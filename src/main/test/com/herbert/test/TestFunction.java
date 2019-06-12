package com.herbert.test;

import com.herbert.domain.Student;
import com.herbert.mapper.StudentMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;


/**
 * @author Herbert
 * @create 2019-06-12 15:01
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class TestFunction {

    @Autowired
    private StudentMapper studentMapper;

    @Test
    public void testSaveStudent(){
        Student s = new Student();
        s.setUsername("tom");
        s.setPassword("123");
        s.setSno("11122222");
        s.setSex("男");

        Integer studentId = studentMapper.saveStudent(s);

        System.out.println("学生ID是:"+studentId);
    }
}
