package com.qfedu.service;

import com.qfedu.entity.User;

/**
 * projectName: T3_db_ddoa
 * author: GSL
 * time: 2020/9/25 14:59
 * description:
 */
public interface LoginService {
    User login(String no, String pass);
}
