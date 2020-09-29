package com.qfedu.service;

import com.qfedu.entity.Grade;
import com.qfedu.entity.Student;

import java.util.List;

/**
 * projectName: T3_db_ddoa
 * author: GSL
 * time: 2020/9/29 20:16
 * description:
 */
public interface StudentService {
    void insertStudent(Student student);

    List<Grade> studentpage(Integer page, Integer limit);
}
