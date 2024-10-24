package com.exmple.model;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;
@Data
public class Student {
    private String studentID;//学号
    private String name;//姓名
    private String gender;//性别
    private List<Course> courses = new ArrayList<>();  // 学生已选课程
    private List<Grade> grades = new ArrayList<>();    // 学生的成绩列表

    // 构造方法
    public Student(String studentID, String name, String gender) {
        this.studentID = studentID;
        this.name = name;
        this.gender = gender;
    }

/*    // 获取和设置方法
    public String getStudentID() {
        return studentID;
    }

    public String getName() {
        return name;
    }

    public String getGender() {
        return gender;
    }

    public List<Course> getCourses() {
        return courses;
    }

    public List<Grade> getGrades() {
        return grades;
    }*/

    // 选课方法
    public void selectCourse(Course course) {
        courses.add(course);
    }

    // 添加成绩方法
    public void addGrade(Grade grade) {
        grades.add(grade);
    }
}
