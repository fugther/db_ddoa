package com.qfedu.dao;

import com.qfedu.entity.Course;

import java.util.List;

/**
 * projectName: T3_db_ddoa
 * author: GSL
 * time: 2020/9/30 8:33
 * description:
 */
public interface CourseDao {
    void addCourse(Course course);

    List<Course> coursepage();

    void coursedelete(int id);

    void courseupdate(Course course);
}
