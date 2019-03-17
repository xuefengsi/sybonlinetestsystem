package com.alice.controller;

import com.alice.model.GradeManageVO;
import com.alice.service.IAdminInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
@RequestMapping("/syb_online_test")
public class ManageController {
    @Autowired
    private IAdminInfoService adminInfoService;

    @RequestMapping("/gradeManage")
    public String getGradeManageView(HttpServletRequest request, Model model)
    {
        List<GradeManageVO> result = adminInfoService.getAllGradeManageVO();
        model.addAttribute("dataList", result);
        return "grade_manage";
    }

    @RequestMapping("/studentManage")
    public String getStudentManageView(HttpServletRequest request)
    {
        return "student_manage";
    }

    @RequestMapping("/testManage")
    public String getTestManageView(HttpServletRequest request)
    {
        return "test_manage";
    }

    @RequestMapping("/gradeManageFilter")
    public String getGradeManageViewFilter(HttpServletRequest request, Model model)
    {
        Integer minScore = null;
        Integer maxScore = null;
        String studentNumber = request.getParameter("studentNumber");
        String studentName = request.getParameter("studentName");
        String grade = request.getParameter("grade");
        String minScoreStr = request.getParameter("minScore");
        String maxScoreStr= request.getParameter("maxScore");

        if (minScoreStr == null || minScoreStr.isEmpty())
        {
            minScore = 0;
        }
        else
        {
            minScore = Integer.parseInt(minScoreStr);
        }

        if (maxScoreStr == null || maxScoreStr.isEmpty())
        {
            maxScore = 100;
        }
        else
        {
            maxScore = Integer.parseInt(maxScoreStr);
        }

        List<GradeManageVO> result = adminInfoService.getAllGradeManageVOFilter(studentNumber, studentName, grade, minScore, maxScore);
        System.out.println(result.size());
        model.addAttribute("dataList", result);
        return "grade_manage";
    }
}
