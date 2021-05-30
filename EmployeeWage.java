package com.bridgelab.employeewage.day4;

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
	
public static void main(String[] args) {
	System.out.println("Welcome To Employyee Wage Computation::");
	System.out.println("Check Employee Avilablity::");
	checkAvilablity();
}
}
