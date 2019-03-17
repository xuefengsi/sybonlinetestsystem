package com.alice.model;

public class GradeManageVO {
    private String studentNumber;

    private String studentName;

    private String gender;

    private String studentGrade;

    private String department;

    private String score;

    private String belongTeacher;

    public String getStudentNumber() {
        return studentNumber;
    }

    public void setStudentNumber(String studentNumber) {
        this.studentNumber = studentNumber;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getStudentGrade() {
        return studentGrade;
    }

    public void setStudentGrade(String studentGrade) {
        this.studentGrade = studentGrade;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getScore() {
        return score;
    }

    public void setScore(String score) {
        this.score = score;
    }

    public String getBelongTeacher() {
        return belongTeacher;
    }

    public void setBelongTeacher(String belongTeacher) {
        this.belongTeacher = belongTeacher;
    }
}
