package com.bridgelabz;
/*Use Case 10
Ability to manage Employee
Wage of multiple companies*/

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EmpWage {

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        List<Integer> wageList=new ArrayList<>();

        System.out.println("Welcome to Employee Wage Computation Program");

        System.out.println("How may company's details would you like to add ?");
        int num = sc.nextInt();
        System.out.println("-------------------------");

        for (int i = 0; i < num; i++) {
            System.out.println("Enter Company Name: ");
            String companyName = sc.next();

            System.out.println("Enter Wage per Hour:");
            int wagePerHour = sc.nextInt();

            System.out.println("Enter Total No. of Working Days in a Month:");
            int MAX_WORKING_DAYS = sc.nextInt();

            System.out.println("Enter Total No. of Working Hours in a Month:");
            int MAX_WORKING_HOURS = sc.nextInt();

            Employee_Wage_Program empObj= new Employee_Wage_Program(companyName,wagePerHour,MAX_WORKING_DAYS,MAX_WORKING_HOURS);
            int wage=empObj.totalWage();
            wageList.add(wage);
        }
        System.out.println("Array of company wage:");
        System.out.println(wageList);
        sc.close();
    }
}