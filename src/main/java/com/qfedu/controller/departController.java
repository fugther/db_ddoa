package com.qfedu.controller;

import com.qfedu.common.JsonResult;
import com.qfedu.entity.Depart;
import com.qfedu.service.departService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * projectName: T3_db_ddoa
 * author: GSL
 * time: 2020/9/30 9:42
 * description:
 */
@Controller
@ResponseBody
public class departController {
    @Autowired
    private departService departService;

    /**
     * 增加部门
     * @return
     */
    @RequestMapping("addDepart.do")
    public JsonResult addDepart(Depart depart){
        departService.addDepart(depart);
        return new JsonResult(1,"增加成功");
    }


}
