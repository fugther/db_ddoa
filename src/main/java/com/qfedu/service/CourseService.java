package com.qfedu.service;

import com.qfedu.entity.Course;

import java.util.List;

/**
 * projectName: T3_db_ddoa
 * author: GSL
 * time: 2020/9/30 8:21
 * description:
 */
public interface CourseService {
    void addCourse(Course course);

    List<Course> coursepage(Integer page, Integer limit);

    void coursedelete(int id);

    void courseupdate(Course course);
}
