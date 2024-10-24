package com.exmple.menu;

import java.util.Scanner;
import com.exmple.service.DataInitializer;
public class Menu {
    private Scanner scanner = new Scanner(System.in);

    public void showMenu() {
        System.out.println("1. 生成初始数据");
        System.out.println("2. 学生选课");
        System.out.println("3. 输入平时成绩");
        System.out.println("4. 输入期中成绩");
        System.out.println("5. 输入实验成绩");
        System.out.println("6. 输入期末成绩");
        System.out.println("7. 计算综合成绩");
        System.out.println("8. 显示学生成绩");
        System.out.println("9. 按学号查询学生成绩");
        System.out.println("10. 按成绩排名");
        System.out.println("0. 退出");
    }

    public void run() {
        while (true) {
            DataInitializer initializer = new DataInitializer();
            showMenu();
            int choice = scanner.nextInt();
            switch (choice) {
                case 1: initializer.generateInitialData();; break;  //生成初始数据
                case 2: studentSelectCourses(); break;//学生选课
                case 3: inputDailyGrades(); break; //输入平时成绩
                case 4: inputMidtermGrades(); break; //输入期中成绩
                case 5: inputLabGrades(); break;  //输入实验成绩
                case 6: inputFinalGrades(); break;    //输入期末成绩
                case 7: calculateOverallGrades(); break;    //计算综合成绩
                case 8: displayGrades(); break;    //显示学生成绩
                case 9: queryStudentById(); break;    //按学号查询学生成绩
                case 10: rankStudentsByGrade(); break;    //按成绩排名
                case 0: System.exit(0);
                default: System.out.println("Invalid option.");
            }
        }
    }
    //生成初始数据
    private void generateInitialData() {

    }
    //学生选课
    private void studentSelectCourses() {

    }
    //输入平时成绩
    private void inputDailyGrades() {

    }
    //输入期中成绩
    private void inputMidtermGrades() {

    }
    //输入实验成绩
    private void inputLabGrades() {

    }
    //输入期末成绩
    private void inputFinalGrades() {

    }
    //计算综合成绩
    private void calculateOverallGrades() {

    }
    //显示学生成绩
    private void displayGrades() {

    }
    //按学号查询学生成绩
    private void queryStudentById() {

    }
    //按成绩排名
    private void rankStudentsByGrade() {

    }
}