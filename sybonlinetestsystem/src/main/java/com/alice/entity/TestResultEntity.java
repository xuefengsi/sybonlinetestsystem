package com.alice.entity;

/**
 * 考试结果实体
 */
public class TestResultEntity {

    private String number;

    private Integer times;

    private Integer score;

    private String errorHistory;

    private String owner;

    public String getNumber() {
        return number;
    }

    public Integer getTimes() {
        return times;
    }

    public Integer getScore() {
        return score;
    }

    public String getErrorHistory() {
        return errorHistory;
    }

    public String getOwner() {
        return owner;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public void setTimes(Integer times) {
        this.times = times;
    }

    public void setScore(Integer score) {
        this.score = score;
    }

    public void setErrorHistory(String errorHistory) {
        this.errorHistory = errorHistory;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }
}
