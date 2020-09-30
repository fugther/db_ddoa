package com.qfedu.controller;

import com.qfedu.common.JsonResult;
import com.qfedu.entity.Course;
import com.qfedu.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Date;

/**
 * projectName: T3_db_ddoa
 * author: GSL
 * time: 2020/9/30 8:20
 * description:
 */
@Controller
@ResponseBody
public class CourseController {
    @Autowired
    private CourseService courseService;

    /**
     * 增加学科
     * @param name
     * @param createtime
     * @param week
     * @return
     */
    @RequestMapping("addCourse.do")
    public JsonResult addCourse(String name, Date createtime,int week){
        Course course = new Course();
        course.setName(name);
        course.setCreatetime(createtime);
        course.setWeek(week);
        courseService.addCourse(course);
        return new JsonResult(1,"加入成功");
    }

}
