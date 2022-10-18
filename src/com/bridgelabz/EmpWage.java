package com.bridgelabz;

public class EmpWage {
    public static void main(String[] args) {
        //Use case 2

        System.out.println("Welcome to Employee wage");

        int empCheck = (int)(Math.random() * 2);
        int wage = 0;
        int isFullTime = 1;
        int empHrs = 0;
        int empWagePerHrs = 20;

        if(empCheck==isFullTime){
            System.out.println("The employee is present");
            empHrs = 8;


        }else{
            System.out.println("Employee is Absent");
            empHrs = 0;
        }

        wage = empHrs * empWagePerHrs;
        System.out.println("The employee wage is  "+ wage);
    }
}