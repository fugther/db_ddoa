package com.qfedu.controller;

import com.github.pagehelper.Page;
import com.qfedu.common.JsonResult;
import com.qfedu.entity.Depart;
import com.qfedu.entity.Grade;
import com.qfedu.service.departService;
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

    /**
     * 柱状图展示部门信息
     * @param
     * @param
     * @return
     */
    @RequestMapping("departlist.do")
    public Map<String,Object> departlist(){
        HashMap<String, Object> map = new HashMap<>();

        List<Depart> departs = departService.departlist();

        String[] names = new String[departs.size()];
        int[] counts  = new int[departs.size()];


        for (int i=0;i < departs.size();i++){
            names[i]= departs.get(i).getName();
            counts[i]= departs.get(i).getNum();
        }
        map.put("code",1);
        map.put("name",names);
        map.put("count",counts);

        return map;
    }
}
