package com.qfedu.dao;

import com.qfedu.entity.User;

/**
 * projectName: T3_db_ddoa
 * author: GSL
 * time: 2020/9/25 15:47
 * description:
 */
public interface LoginDao {
    User login(String no);
}
