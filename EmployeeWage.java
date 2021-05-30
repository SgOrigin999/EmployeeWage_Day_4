package com.bridgelab.employeewage.day4;

import com.bridgelab.day3.EmployeeWage;

public class EmployeeWage {
	public static final int FULL_TIME = 1;
	public static final int HALF_TIME = 0;
	public static int WAGEPERHOUR = 20;
	public static int FULL_TIME_HRS;
	public static int HALF_TIME_HRS;
	public static int NUM_OF_WORKING_DAYS = 20;
	public static int MAX_WORKING_HRS=100 ;
	public static int TOTAL_WAGE ;
	
	public static void checkAvilablity() {
		double empCheck = Math.floor(Math.random() * 10) % 2;
		System.out.println("Emp Check Value::" + empCheck);
		if (empCheck == FULL_TIME) {
			System.out.println("Employee is Present");
		} else {
			System.out.println("Employee is not Present");
		}
	}
	
	public static void calculateDailyWage() {
		int totalWage = 0;
		double empCheck = Math.floor(Math.random() * 10) % 2;
		if (empCheck == 1) {
			totalWage = WAGEPERHOUR * FULL_TIME_HRS;
			System.out.println("Employee daily Wage::" + totalWage);
		} else {
			System.out.println("Employee daily Wage::" + totalWage);
		}
	}
	
	public static void partTimeWage() {
		int totalWage = 0;
		int partTimrHrs=8;
		double empCheck = Math.floor(Math.random() * 10) % 2;
		if (empCheck == 1) {
			totalWage = WAGEPERHOUR * partTimrHrs;
			System.out.println("Employee PartTimeIf Present Wage::" + totalWage);
		} else {
			System.out.println("Employee Absent Then Wage::" + totalWage);
		}
	}
	
	public  double useSwitch(int random) {
		int empCheck = random;
		int empHrs;
		int empWage;
		switch (empCheck) {
		case HALF_TIME :
			empHrs = 4;
			break;
		case FULL_TIME :
			empHrs = 8;
			break;
		default:
			empHrs = 0;
		}
		TOTAL_WAGE = WAGEPERHOUR * empHrs;
		return TOTAL_WAGE;
	}
	
public static void main(String[] args) {
	System.out.println("Welcome To Employyee Wage Computation::");
	System.out.println("Check Employee Avilablity::");
	checkAvilablity();
	System.out.println("Calculate Daily Wage::");
	calculateDailyWage();
	System.out.println("Add Part Time wage");
	partTimeWage();	
	int random = (int) Math.floor(Math.random() * 10) % 2;
	EmployeeWage emp = new EmployeeWage();
	double totalWage=emp.useSwitch(random);
	System.out.println("Use Switch Case::"+totalWage);
}
}
