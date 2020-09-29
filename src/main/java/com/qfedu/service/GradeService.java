package com.qfedu.service;

import com.qfedu.entity.Grade;

import java.util.List;

/**
 * projectName: T3_db_ddoa
 * author: GSL
 * time: 2020/9/29 15:29
 * description:
 */
public interface GradeService {
    void insertGrade(Grade grade);

    List<Grade> selectGrade(Integer page, Integer limit);

    void deleteGradeById(int id);

    void updateGrade(Grade grade);
}
