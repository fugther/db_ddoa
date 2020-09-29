package com.qfedu.service.impl;

import com.github.pagehelper.PageHelper;
import com.qfedu.dao.GradeDao;
import com.qfedu.entity.Grade;
import com.qfedu.service.GradeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * projectName: T3_db_ddoa
 * author: GSL
 * time: 2020/9/29 15:35
 * description:
 */
@Service
public class GradeServiceImpl implements GradeService {
    @Autowired
    private GradeDao gradeDao;



    @Override
    public void insertGrade(Grade grade) {
        if (grade==null){
            throw new RuntimeException("输入班级信息错误");
        }
        gradeDao.insertGrade(grade);
    }

    @Override
    public List<Grade> selectGrade(Integer page, Integer limit) {
        PageHelper.startPage(page,limit);
        return gradeDao.selectGrade();
    }

    @Override
    public void deleteGradeById(int id) {
        gradeDao.deleteGradeById(id);
    }

    @Override
    public void updateGrade(Grade grade) {
        if (grade.getId()==null) {
            throw new RuntimeException("数据异常");
        }
        gradeDao.updateGrade(grade);
    }
}
