package com.qfedu.service.impl;

import com.github.pagehelper.PageHelper;
import com.qfedu.dao.CourseDao;
import com.qfedu.entity.Course;
import com.qfedu.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

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

    @Override
    public List<Course> coursepage(Integer page, Integer limit) {
        PageHelper.startPage(page,limit);
        return courseDao.coursepage();
    }

    @Override
    public void coursedelete(int id) {
        courseDao.coursedelete(id);
    }

    @Override
    public void courseupdate(Course course) {
        if (course.getId()==0) {
            throw new RuntimeException("数据异常");
        }
        courseDao.courseupdate(course);
    }
}
