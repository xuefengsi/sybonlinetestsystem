package com.alice.mapper;

import com.alice.entity.AdminInfoEntity;
import com.alice.entity.StudentInfoEntity;
import com.alice.entity.SubjectInfoEntity;
import com.alice.entity.TestResultEntity;
import com.alice.model.GradeManageVO;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface IAdminInfoMapper {
    AdminInfoEntity getAdminInfoById(String adminNumber);

    StudentInfoEntity getAllStudentInfoEntity();

    SubjectInfoEntity getAllSubjectInfoEntity();

    TestResultEntity getAllTestResultEntity();

    List<GradeManageVO> getAllGradeManageVO();

    List<GradeManageVO> getAllGradeManageVOFilter(@Param("studentNumber") String studentNumber, @Param("studentName") String studentName, @Param("grade") String grade,
                                                  @Param("minScore") Integer minScore, @Param("maxScore") Integer maxScore);
}
