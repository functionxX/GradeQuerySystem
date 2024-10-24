package com.exmple.service;

import com.exmple.model.Course;
import com.exmple.model.Student;
import com.exmple.model.Teacher;
import com.exmple.model.TeachingClass;

import java.util.*;
//生成初始数据
public class DataInitializer {

    private List<Student> students = new ArrayList<>();
    private List<Teacher> teachers = new ArrayList<>();
    private List<Course> courses = new ArrayList<>();
    private List<TeachingClass> teachingClasses = new ArrayList<>();

    private Random random = new Random();

    // 生成中文姓名
    private String[] familyNames = {"王", "李", "张", "刘", "陈", "杨", "黄", "吴", "赵", "周"};
    private String[] givenNames = {"伟", "芳", "秀英", "娜", "敏", "静", "丽", "强", "磊", "军"};

    public String generateChineseName() {
        return familyNames[random.nextInt(familyNames.length)] + givenNames[random.nextInt(givenNames.length)];
    }

    // 生成性别
    public String generateGender() {
        return random.nextBoolean() ? "男" : "女";
    }

    // 生成初始化数据
    public void generateInitialData() {
        generateStudents();
        generateTeachers();
        generateCourses();
        generateTeachingClasses();
        System.out.println("数据初始化完成！");
    }

    // 生成学生
    private void generateStudents() {
        for (int i = 1; i <= 120; i++) {
            String studentID = String.format("STU2025%04d", i);
            String name = generateChineseName();
            String gender = generateGender();
            Student student = new Student(studentID, name, gender);
            students.add(student);
        }
        System.out.println("120名学生已生成！");
    }

    // 生成教师
    private void generateTeachers() {
        for (int i = 1; i <= 8; i++) {
            String teacherID = String.format("TEA%04d", i);
            String name = generateChineseName();
            Teacher teacher = new Teacher(teacherID, name);
            teachers.add(teacher);
        }
        System.out.println("8位教师已生成！");
    }

    // 生成课程
    private void generateCourses() {
        courses.add(new Course("Course001", "数据结构"));
        courses.add(new Course("Course002", "数据库系统"));
        courses.add(new Course("Course003", "计算机组成原理"));
        courses.add(new Course("Course004", "计算机网络"));

        // 为课程分配教师
        courses.get(0).addTeacher(teachers.get(0)); // TEA0001
        courses.get(0).addTeacher(teachers.get(1)); // TEA0002
        courses.get(1).addTeacher(teachers.get(2)); // TEA0003
        courses.get(1).addTeacher(teachers.get(3)); // TEA0004
        courses.get(2).addTeacher(teachers.get(4)); // TEA0005
        courses.get(2).addTeacher(teachers.get(5)); // TEA0006
        courses.get(3).addTeacher(teachers.get(6)); // TEA0007
        courses.get(3).addTeacher(teachers.get(7)); // TEA0008

        System.out.println("4门课程已生成！");
    }

    // 生成教学班
    private void generateTeachingClasses() {
        teachingClasses.add(new TeachingClass("Class001", teachers.get(0), courses.get(0), "2024年秋季")); // TEA0001, Course001
        teachingClasses.add(new TeachingClass("Class002", teachers.get(1), courses.get(1), "2024年秋季")); // TEA0002, Course002
        teachingClasses.add(new TeachingClass("Class003", teachers.get(2), courses.get(2), "2024年秋季")); // TEA0003, Course003
        teachingClasses.add(new TeachingClass("Class004", teachers.get(3), courses.get(3), "2024年秋季")); // TEA0004, Course004

        // 分配学生到教学班
        for (int i = 0; i < 30; i++) {
            teachingClasses.get(0).addStudent(students.get(i));       // Class001对应STU20250001到STU20250030
            teachingClasses.get(1).addStudent(students.get(i + 30));  // Class002对应STU20250031到STU20250060
            teachingClasses.get(2).addStudent(students.get(i + 60));  // Class003对应STU20250061到STU20250090
            teachingClasses.get(3).addStudent(students.get(i + 90));  // Class004对应STU20250091到STU20250120
        }
        System.out.println("4个教学班和学生分配已生成！");
    }

    public List<Student> getStudents() {
        return students;
    }

    public List<Teacher> getTeachers() {
        return teachers;
    }

    public List<Course> getCourses() {
        return courses;
    }

    public List<TeachingClass> getTeachingClasses() {
        return teachingClasses;
    }

/*    public static void main(String[] args) {
        DataInitializer initializer = new DataInitializer();
        initializer.generateInitialData();
    }*/
}
