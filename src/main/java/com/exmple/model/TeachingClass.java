package com.exmple.model;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;
@Data
public class TeachingClass {
    private String classID;//教学班号
    private Teacher teacher;//老师
    private Course course;//课程
    private List<Student> students = new ArrayList<>();  // 教学班的学生列表
    private String term;

    // 构造方法
    public TeachingClass(String classID, Teacher teacher, Course course, String term) {
        this.classID = classID;
        this.teacher = teacher;
        this.course = course;
        this.term = term;
    }

/*    // 获取和设置方法
    public String getClassID() {
        return classID;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public Course getCourse() {
        return course;
    }

    public List<Student> getStudents() {
        return students;
    }

    public String getTerm() {
        return term;
    }*/

    // 添加学生方法
    public void addStudent(Student student) {
        students.add(student);
    }
}
