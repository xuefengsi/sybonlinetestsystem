package com.alice.service.impl;

import com.alice.entity.AdminInfoEntity;
import com.alice.mapper.IAdminInfoMapper;
import com.alice.model.GradeManageVO;
import com.alice.service.IAdminInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class IAdminInfoServiceImpl implements IAdminInfoService {
    @Autowired
    private IAdminInfoMapper adminInfoMapper;

    @Override
    public AdminInfoEntity getAdminInfoById(String adminNumber) {
        return adminInfoMapper.getAdminInfoById(adminNumber);
    }

    @Override
    public List<GradeManageVO> getAllGradeManageVOFilter(String studentNumber, String studentName, String grade, Integer minScore, Integer maxScore) {
        return adminInfoMapper.getAllGradeManageVOFilter(studentNumber, studentName, grade,minScore, maxScore);
    }

    @Override
    public List<GradeManageVO> getAllGradeManageVO() {
        return adminInfoMapper.getAllGradeManageVO();
    }
}
