package com.qfedu.controller;

import com.github.pagehelper.Page;
import com.qfedu.common.JsonResult;
import com.qfedu.entity.Grade;
import com.qfedu.entity.Student;
import com.qfedu.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * projectName: T3_db_ddoa
 * author: GSL
 * time: 2020/9/29 20:15
 * description:
 */
@Controller
@ResponseBody
public class StudentController {
    @Autowired
    private StudentService studentService;

    /**
     * 增加学生
     * @param student
     * @return
     */
    @RequestMapping("insertStudent.do")
    public JsonResult insertStudent(Student student){
        studentService.insertStudent(student);
        return new JsonResult(1,"学生信息加入成功");
    }

    /**
     * 学生信息列表
     * @param page
     * @param limit
     * @return
     */
    @RequestMapping("studentpage.do")
    public Map<String,Object> studentpage(Integer page, Integer limit){
        List<Grade> list=studentService.studentpage(page,limit);
        long total = ((Page) list).getTotal();
        Map<String, Object> map = new HashMap<>();
        map.put("code",0);
        map.put("msg","");
        map.put("count",total);
        map.put("data",list);
        return map;
    }
    /**
     * 学生列表的删除修改
     */
    //@RequestMapping("studentdelete.do")

    //@RequestMapping("")


}
