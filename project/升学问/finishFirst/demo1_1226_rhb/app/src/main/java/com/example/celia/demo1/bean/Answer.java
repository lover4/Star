package com.example.celia.demo1.bean;

public class Answer {
    private int answerId;
    private String answerContent;
    private String answerTime;
    private int questionId;
    private UserBean user;
    private int userId;
    private String answerUserName;
    private String answerUserImg;

    public Answer(int answerId, String answerContent, String answerTime, int questionId, UserBean user, int userId, String answerUserName, String answerUserImg) {
        this.answerId = answerId;
        this.answerContent = answerContent;
        this.answerTime = answerTime;
        this.questionId = questionId;
        this.user = user;
        this.userId = userId;
        this.answerUserName = answerUserName;
        this.answerUserImg = answerUserImg;
    }

    public Answer() {
        super();
    }

    public String getAnswerUserName() {
        return answerUserName;
    }

    public void setAnswerUserName(String answerUserName) {
        this.answerUserName = answerUserName;
    }

    public String getAnswerUserImg() {
        return answerUserImg;
    }

    public void setAnswerUserImg(String answerUserImg) {
        this.answerUserImg = answerUserImg;
    }

    public int getAnswerId() {
        return answerId;
    }

    public void setAnswerId(int answerId) {
        this.answerId = answerId;
    }

    public String getAnswerContent() {
        return answerContent;
    }

    public void setAnswerContent(String answerContent) {
        this.answerContent = answerContent;
    }

    public String getAnswerTime() {
        return answerTime;
    }

    public void setAnswerTime(String answerTime) {
        this.answerTime = answerTime;
    }

    public int getQuestionId() {
        return questionId;
    }

    public void setQuestionId(int questionId) {
        this.questionId = questionId;
    }

    public UserBean getUser() {
        return user;
    }

    public void setUser(UserBean user) {
        this.user = user;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    @Override
    public String toString() {
        return "Answer{" +
                "answerId=" + answerId +
                ", answerContent='" + answerContent + '\'' +
                ", answerTime='" + answerTime + '\'' +
                ", questionId=" + questionId +
                ", user=" + user +
                ", userId=" + userId +
                ", answerUserName='" + answerUserName + '\'' +
                ", answerUserImg='" + answerUserImg + '\'' +
                '}';
    }
}
