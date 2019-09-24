package com.ust.test;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SalesData objSalesData= new SalesData();
		System.out.println("Welcome to sales app");
		displayGreeting();
		
		objSalesData.display();
		

	}
	private static void displayGreeting(){
		System.out.println("Hello..");
		System.out.println("second done");
	}

}
