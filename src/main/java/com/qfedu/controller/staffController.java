package com.qfedu.controller;

import com.qfedu.common.JsonResult;
import com.qfedu.entity.Staff;
import com.qfedu.service.staffService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

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

    @RequestMapping("staffAdd.do")
    public JsonResult staffAdd(Staff staff){
        staffService.staffAdd(staff);
        return new JsonResult(1,"新增员工成功");
    }
}
