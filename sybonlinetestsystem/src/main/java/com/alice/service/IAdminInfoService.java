package com.alice.service;

import com.alice.entity.AdminInfoEntity;
import com.alice.model.GradeManageVO;

import java.util.List;

public interface IAdminInfoService {

    AdminInfoEntity getAdminInfoById(String adminNumber);

    List<GradeManageVO> getAllGradeManageVO();

    List<GradeManageVO> getAllGradeManageVOFilter(String studentNumber, String studentName, String grade, Integer minScore, Integer maxScore);

}
