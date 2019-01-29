package com.examine.beyondsoft_qf.model;

import org.springframework.stereotype.Repository;

/**
 * 考试记录 用于记录每次考试信息
 */
@Repository
public class ExamRecord {
    private Integer id;
    private Integer paperId;
    private Integer userId;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getPaperId() {
        return paperId;
    }

    public void setPaperId(Integer paperId) {
        this.paperId = paperId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }
}
