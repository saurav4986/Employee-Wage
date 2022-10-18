package com.bridgelabz;

public class EmpWage {
    static final int IS_FULL_TIME = 1; // Constants
    static final int IS_PART_TIME = 2;
    static final int EMP_WAGE_HRS = 20;

    public static void main(String[] args) {
        //Use case 4 code with Switch statement

        System.out.println("Welcome to Employee wage");

        int empCheck = (int)(Math.random() * 3); //Generating Random Number
        int wage = 0;
        int empHrs = 0;

        switch (empCheck){
            case IS_FULL_TIME :
                System.out.println("The employee is doing full time");
                empHrs = 8;
                break;
            case IS_PART_TIME:
                System.out.println("Employee is doing part time");
                empHrs = 4;
                break;
            default:
                System.out.println("Employee is Absent");
                empHrs = 0;
        }

        wage = empHrs * EMP_WAGE_HRS;
        System.out.println("The employee wage is  "+ wage);
    }
}