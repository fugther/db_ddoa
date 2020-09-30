package com.qfedu.service.impl;

import com.qfedu.dao.CourseDao;
import com.qfedu.entity.Course;
import com.qfedu.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * projectName: T3_db_ddoa
 * author: GSL
 * time: 2020/9/30 8:32
 * description:
 */
@Service
public class CourseServiceImpl implements CourseService {
    @Autowired
    private CourseDao courseDao;



    @Override
    public void addCourse(Course course) {
        courseDao.addCourse(course);
    }
}
