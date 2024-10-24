package com.exmple.model;

import lombok.Data;

import java.time.LocalDateTime;
@Data
public class Grade {
    private int regularScore;  // 平时成绩
    private int midtermScore;  // 期中成绩
    private int labScore;      // 实验成绩
    private int finalScore;    // 期末成绩
    private double finalGrade; // 综合成绩
    private LocalDateTime recordTime;  // 成绩录入时间

    // 构造方法
    public Grade(int regularScore, int midtermScore, int labScore, int finalScore) {
        this.regularScore = regularScore;
        this.midtermScore = midtermScore;
        this.labScore = labScore;
        this.finalScore = finalScore;
        this.recordTime = LocalDateTime.now();  // 自动记录成绩录入时间
        calculateFinalGrade();
    }

    // 计算综合成绩的方法
    public void calculateFinalGrade() {
        this.finalGrade = regularScore * 0.1 + midtermScore * 0.3 + labScore * 0.2 + finalScore * 0.4;
    }

    // 获取成绩信息
    public int getRegularScore() {
        return regularScore;
    }

    public int getMidtermScore() {
        return midtermScore;
    }

    public int getLabScore() {
        return labScore;
    }

    public int getFinalScore() {
        return finalScore;
    }

    public double getFinalGrade() {
        return finalGrade;
    }

    public LocalDateTime getRecordTime() {
        return recordTime;
    }
}
