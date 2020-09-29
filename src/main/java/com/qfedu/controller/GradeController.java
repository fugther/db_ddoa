package com.qfedu.controller;

import com.github.pagehelper.Page;
import com.qfedu.common.JsonResult;
import com.qfedu.entity.Grade;
import com.qfedu.service.GradeService;
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
 * time: 2020/9/29 15:28
 * description:
 */
@Controller
@ResponseBody
public class GradeController {
    @Autowired
    private GradeService gradeService;

    /**
     * 增加班级
     * @param grade
     * @return
     */
    @RequestMapping("insertGrade.do")
    public JsonResult insertGrade(Grade grade){
        gradeService.insertGrade(grade);
        return new JsonResult(1,"添加班级成功");
    }

    /**
     * 查询所有班级信息并分页展示
     * @param page
     * @param limit
     * @return
     */
    @RequestMapping("selectGradeAll.do")
    public Map<String,Object>selectGrade(Integer page,Integer limit){
        List<Grade> list=gradeService.selectGrade(page,limit);
        long total = ((Page) list).getTotal();
        Map<String, Object> map = new HashMap<>();
        map.put("code",0);
        map.put("msg","");
        map.put("count",total);
        map.put("data",list);
        return map;
    }
}
