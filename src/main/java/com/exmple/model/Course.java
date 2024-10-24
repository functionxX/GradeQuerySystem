package com.exmple.model;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;
@Data
public class Course {
    private String courseID;//课程编号
    private String courseName;//课程名
    private List<Teacher> teachers = new ArrayList<>();        // 该课程的教师列表
    private List<TeachingClass> teachingClasses = new ArrayList<>();  // 该课程的教学班列表

    // 构造方法
    public Course(String courseID, String courseName) {
        this.courseID = courseID;
        this.courseName = courseName;
    }
/*
    // 获取和设置方法
    public String getCourseID() {
        return courseID;
    }

    public String getCourseName() {
        return courseName;
    }

    public List<Teacher> getTeachers() {
        return teachers;
    }

    public List<TeachingClass> getTeachingClasses() {
        return teachingClasses;
    }*/

    // 添加教师方法
    public void addTeacher(Teacher teacher) {
        teachers.add(teacher);
    }

    // 添加教学班方法
    public void addTeachingClass(TeachingClass teachingClass) {
        teachingClasses.add(teachingClass);
    }
}
