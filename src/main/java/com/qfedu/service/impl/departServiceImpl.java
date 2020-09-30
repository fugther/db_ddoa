package com.qfedu.service.impl;

import com.github.pagehelper.PageHelper;
import com.qfedu.dao.departDao;
import com.qfedu.entity.Depart;
import com.qfedu.service.departService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * projectName: T3_db_ddoa
 * author: GSL
 * time: 2020/9/30 9:49
 * description:
 */
@Service
public class departServiceImpl implements departService {
    @Autowired
    private departDao departDao;

    @Override
    public void addDepart(Depart depart) {
        if (depart==null) {
            throw new RuntimeException("数据异常");
        }
        departDao.addDepart(depart);
    }

    @Override
    public List<Depart> departlist() {
        return departDao.departlist();
    }


}
