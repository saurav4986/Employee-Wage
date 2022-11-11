package com.bridgelabz;
/*Use Case 14
Ability to get the Total Wage when queried by Company
- Create Method in EmpWageBuilder to get total wage by Company*/

import java.util.*;

public class EmpWage {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Map<String, List<Integer>> dailyWageMap = new HashMap<String, List<Integer>>();
        // Array list to save the employee wages
        Map<String, Integer> wageList = new HashMap<>();

        System.out.println("Welcome to Employee Wage Computation Program");

        System.out.println("How may company's details would you like to add ?");
        int num = sc.nextInt();
        for (int i = 0; i < num; i++) {
            System.out.println("Enter Company Name: ");
            String companyName = sc.next();

            System.out.println("Enter Wage per Hour:");
            int wagePerHour = sc.nextInt();

            System.out.println("Enter Total No. of Working Days in a Month:");
            int MAX_WORKING_DAYS = sc.nextInt();

            System.out.println("Enter Total No. of Working Hours in a Month:");
            int MAX_WORKING_HOURS = sc.nextInt();

            Employee_Wage_Program empObj = new Employee_Wage_Program(companyName, wagePerHour, MAX_WORKING_DAYS,
                    MAX_WORKING_HOURS);
            int wage = empObj.totalWage();
            wageList.put(companyName, wage);
            dailyWageMap.put(companyName, empObj.dailyWageList);
        }

        // Map to add all the monthly wage
        System.out.println("Array of monthly wages of companies: ");
        System.out.println(wageList);

        // Iterating the Map
        System.out.println("The Daily Wage of the Companies are below: ");
        for (Map.Entry<String, List<Integer>> dailyWage : dailyWageMap.entrySet()) {
            System.out.println(
                    "The Company Name is: " + dailyWage.getKey() + " and their daily wage is: " + dailyWage.getValue());
        }
        System.out.println("***********************************************************");
        System.out.println("Do you wish to check the total wage of the Company: (Y/N)");
        String wish=sc.next();
        if(wish.equalsIgnoreCase("y") || wish.equalsIgnoreCase("Yes")){
            System.out.println("Please enter the Company name to check the total wage: ");
            String cName = sc.next();
            boolean flag = true;
            for (Map.Entry<String, Integer> wage_List : wageList.entrySet()) {
                if (cName.equalsIgnoreCase(wage_List.getKey())) {
                    flag = false;
                    System.out
                            .println("the total wage of the company " + wage_List.getKey() + " is: " + wage_List.getValue());
                }
            }
            if (flag) {
                System.out.println("Sorry the entered company name is invalid!");
            }

        }else {
            System.exit(num);
        }

        sc.close();

    }
}