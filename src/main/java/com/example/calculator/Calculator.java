package com.example.calculator;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		Calculator calculator = new Calculator();
		Scanner scanner = new Scanner(System.in);
		int choice;
		int first, second;
		boolean exit = false;
		while (!exit) {
			System.out.println("1. Square Root");
			System.out.println("2. Factorial");
			System.out.println("3. Natural logarithm");
			System.out.println("4. Power");
			System.out.println("0. Exit");
			System.out.print("Enter your choice:");
			choice = scanner.nextInt();
			System.out.print("Enter number: ");
			first = scanner.nextInt();
			switch (choice) {
				case 1:
					System.out.println("Result is : " + calculator.root(first));
					break;
				case 2:
					System.out.println("Result is : " + calculator.factorial(first));
					break;
				case 3:
					System.out.println("Result is : " + calculator.log(first));
					break;
				case 4:
					System.out.print("Enter exponent: ");
					second = scanner.nextInt();
					System.out.println("Result is : " + calculator.power(first, second));
					break;
				case 0:
					exit = true;
					break;
				default:
					System.out.println("Enter correct choice");
			}
		}
		scanner.close();
	}

	public double root(int num1) {
		return Math.sqrt(num1);
	}

	public int factorial(int num1) {
		int ans = 1;
		for (int i = 1; i <= num1; i++)
			ans = ans * i;
		return ans;
	}

	public double log(int num1) {
		double ans;
		ans = Math.log(num1);
		ans = Math.round(ans * Math.pow(10, 2)) / Math.pow(10, 2);
		return ans;
	}

	public double power(double num1, double num2) {
		return Math.pow(num1, num2);
	}
}
