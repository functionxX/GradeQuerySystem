package com.exmple.model;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;
@Data
public class Teacher {
    private String teacherID;//教师编号
    private String name;//姓名
    private List<Course> teachingCourses = new ArrayList<>();  // 教师教授的课程列表

    // 构造方法
    public Teacher(String teacherID, String name) {
        this.teacherID = teacherID;
        this.name = name;
    }

/*    // 获取和设置方法
    public String getTeacherID() {
        return teacherID;
    }

    public String getName() {
        return name;
    }

    public List<Course> getTeachingCourses() {
        return teachingCourses;
    }*/
    // 教授课程方法
    public void teachCourse(Course course) {
        teachingCourses.add(course);
    }
}
