package com.qfedu.controller;

import com.github.pagehelper.Page;
import com.qfedu.common.JsonResult;
import com.qfedu.entity.Course;
import com.qfedu.entity.Grade;
import com.qfedu.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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

    /**
     * 分页展示学科列表
     * @param page
     * @param limit
     * @return
     */
    @RequestMapping("coursepage.do")
    public Map<String,Object> coursepage(Integer page, Integer limit){
        List<Course> list=courseService.coursepage(page,limit);
        long total = ((Page) list).getTotal();
        Map<String, Object> map = new HashMap<>();
        map.put("code",0);
        map.put("msg","");
        map.put("count",total);
        map.put("data",list);
        return map;
    }

    /**
     * 在学科信息列表的删除学科信息功能
     * @param id
     * @return
     */
    @RequestMapping("coursedelete.do")
    public JsonResult coursedelete(int id){
        courseService.coursedelete(id);
        return new JsonResult(1,"删除成功");
    }

    /**
     * 在学科信息列表的修改学科信息功能
     * @param course
     * @return
     */
    @RequestMapping("courseupdate.do")
    public JsonResult courseupdate(Course course){
        courseService.courseupdate(course);
        return new JsonResult(1,"修改成功");
    }

}
