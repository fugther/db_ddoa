package com.qfedu.service;

import com.qfedu.entity.Depart;

import java.util.List;

/**
 * projectName: T3_db_ddoa
 * author: GSL
 * time: 2020/9/30 9:43
 * description:
 */
public interface departService {
    void addDepart(Depart depart);

    List<Depart> departlist();


}
