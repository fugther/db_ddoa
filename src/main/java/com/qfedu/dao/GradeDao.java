package com.qfedu.dao;

import com.qfedu.entity.Grade;

import java.util.List;

/**
 * projectName: T3_db_ddoa
 * author: GSL
 * time: 2020/9/29 15:37
 * description:
 */
public interface GradeDao {
    void insertGrade(Grade grade);

    List<Grade> selectGrade();

    void deleteGradeById(int id);

    void updateGrade(Grade grade);
}
