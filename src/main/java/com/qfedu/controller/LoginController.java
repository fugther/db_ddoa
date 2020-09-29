package com.qfedu.controller;

import com.qfedu.common.JsonResult;
import com.qfedu.entity.User;
import com.qfedu.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;

/**
 * projectName: T3_db_ddoa
 * author: GSL
 * time: 2020/9/25 14:56
 * description:
 */
@Controller
@ResponseBody
public class LoginController {
    @Autowired
    private LoginService loginService;

    /**
     * 登录
     * @param no 账号
     * @param pass 密码
     * @param session 存储session
     * @return
     */
    @RequestMapping("login.do")
    public JsonResult login(String no, String pass, HttpSession session){
        User user =loginService.login(no,pass);
        //存储seesion
        session.setAttribute("loginUser",user);
        return new JsonResult(1,user.getIdentity());
    }

    /**
     * 退出
     * @param session   用户的session
     * @return
     */
    @RequestMapping("loginOut.do")
    public JsonResult loginOut(HttpSession  session){
        //删除该用户session
        session.invalidate();
        return new JsonResult(1,"退出登录成功");
    }
}
