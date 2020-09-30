package com.qfedu.service.impl;

import com.github.pagehelper.PageHelper;
import com.qfedu.dao.staffDao;
import com.qfedu.entity.Staff;
import com.qfedu.service.staffService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * projectName: T3_db_ddoa
 * author: GSL
 * time: 2020/9/30 9:13
 * description:
 */
@Service
public class staffServiceImpl implements staffService {
    @Autowired
    private staffDao staffDao;

    @Override
    public void staffAdd(Staff staff) {
        if (staff==null) {
            throw new RuntimeException("数据异常");
        }
        staffDao.staffAdd(staff);
    }

    @Override
    public List<Staff> staffAll(Integer page, Integer limit) {
        PageHelper.startPage(page,limit);
        return staffDao.staffAll();
    }

    @Override
    public void staffdelete(int id) {
        staffDao.staffdelete(id);
    }
}
