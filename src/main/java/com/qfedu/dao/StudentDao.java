package com.qfedu.dao;

import com.qfedu.entity.Grade;
import com.qfedu.entity.Student;

import java.util.List;

/**
 * projectName: T3_db_ddoa
 * author: GSL
 * time: 2020/9/29 20:25
 * description:
 */
public interface StudentDao {
    void insertStudent(Student student);

    List<Grade> studentpage();
}
