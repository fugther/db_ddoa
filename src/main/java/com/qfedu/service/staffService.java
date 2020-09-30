package com.qfedu.service;

import com.qfedu.entity.Staff;

import java.util.List;

/**
 * projectName: T3_db_ddoa
 * author: GSL
 * time: 2020/9/30 9:06
 * description:
 */
public interface staffService {
    void staffAdd(Staff staff);

    List<Staff> staffAll(Integer page, Integer limit);

    void staffdelete(int id);
}
