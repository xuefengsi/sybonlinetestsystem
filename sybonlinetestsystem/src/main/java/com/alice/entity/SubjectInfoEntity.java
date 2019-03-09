package com.alice.entity;

/**
 * 题目实体
 */
public class SubjectInfoEntity {

    private Integer subjectId;

    private String topic;

    private String option;

    private String answer;

    public Integer getSubjectId() {
        return subjectId;
    }

    public String getTopic() {
        return topic;
    }

    public String getOption() {
        return option;
    }

    public String getAnswer() {
        return answer;
    }

    public void setSubjectId(Integer subjectId) {
        this.subjectId = subjectId;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }

    public void setOption(String option) {
        this.option = option;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }
}
