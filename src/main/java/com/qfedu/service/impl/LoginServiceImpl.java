package com.qfedu.service.impl;

import com.qfedu.dao.LoginDao;
import com.qfedu.entity.User;
import com.qfedu.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * projectName: T3_db_ddoa
 * author: GSL
 * time: 2020/9/25 15:46
 * description:
 */
@Service
public class LoginServiceImpl implements LoginService {
    @Autowired
    private LoginDao loginDao;


    @Override
    public User login(String no, String pass) {
        User user=loginDao.login(no);

        if (user==null) {
            throw new RuntimeException("账号错误");
        }else if (!user.getPassword().equals(pass)){
            throw new RuntimeException("密码错误");
        }
        return user;
    }
}
