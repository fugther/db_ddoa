package com.qfedu.controller;

import com.github.pagehelper.Page;
import com.qfedu.common.JsonResult;
import com.qfedu.entity.Grade;
import com.qfedu.entity.Staff;
import com.qfedu.service.staffService;
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
 * time: 2020/9/30 9:05
 * description:
 */
@Controller
@ResponseBody
public class staffController {
    @Autowired
    private staffService staffService;

    /**
     * 新增员工
     * @param staff
     * @return
     */
    @RequestMapping("staffAdd.do")
    public JsonResult staffAdd(Staff staff){
        staffService.staffAdd(staff);
        return new JsonResult(1,"新增员工成功");
    }

    /**
     * 分页展示员工信息
     * @param page
     * @param limit
     * @return
     */
    @RequestMapping("staffAll.do")
    public Map<String,Object> staffAll(Integer page, Integer limit){
        List<Staff> list=staffService.staffAll(page,limit);
        long total = ((Page) list).getTotal();
        Map<String, Object> map = new HashMap<>();
        map.put("code",0);
        map.put("msg","");
        map.put("count",total);
        map.put("data",list);
        return map;
    }

    @RequestMapping("staffdelete.do")
    public JsonResult staffdelete(int id){
        staffService.staffdelete(id);
        return new JsonResult(1,"删除成功");
    }
}
