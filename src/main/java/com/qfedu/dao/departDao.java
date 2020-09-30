package com.qfedu.dao;

import com.qfedu.entity.Depart;

import java.util.List;

/**
 * projectName: T3_db_ddoa
 * author: GSL
 * time: 2020/9/30 9:50
 * description:
 */
public interface departDao {
    void addDepart(Depart depart);

    List<Depart> departlist();


}
