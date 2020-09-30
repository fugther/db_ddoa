package com.qfedu.dao;

import com.qfedu.entity.Staff;

import java.util.List;

/**
 * projectName: T3_db_ddoa
 * author: GSL
 * time: 2020/9/30 9:16
 * description:
 */
public interface staffDao {
    void staffAdd(Staff staff);

    List<Staff> staffAll();

    void staffdelete(int id);
}
