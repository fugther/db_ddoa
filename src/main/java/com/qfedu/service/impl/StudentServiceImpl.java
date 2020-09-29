package com.qfedu.service.impl;

import com.github.pagehelper.PageHelper;
import com.qfedu.dao.StudentDao;
import com.qfedu.entity.Grade;
import com.qfedu.entity.Student;
import com.qfedu.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * projectName: T3_db_ddoa
 * author: GSL
 * time: 2020/9/29 20:23
 * description:
 */
@Service
public class StudentServiceImpl implements StudentService {
    @Autowired
    private StudentDao studentDao;


    @Override
    public void insertStudent(Student student) {
        if (student==null) {
            throw new RuntimeException("学生信息异常");
        }
        studentDao.insertStudent(student);
    }

    @Override
    public List<Grade> studentpage(Integer page, Integer limit) {
        PageHelper.startPage(page,limit);
        return studentDao.studentpage();
    }
}
