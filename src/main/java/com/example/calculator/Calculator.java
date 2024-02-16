package com.example.calculator;

import java.util.Scanner;

public class Calculator {

  public static void main(String[] args) {
    Calculator calculator = new Calculator();
    Scanner scanner = new Scanner(System.in);
    int choice;
    Double first, second;
    System.out.print("Enter first number: ");
    first = scanner.nextDouble();
    System.out.print("Enter second number: ");
    second = scanner.nextDouble();
    System.out.println("1. Addition");
    System.out.println("2. Subtraction");
    System.out.println("3. Multiplication");
    System.out.println("4. Division");
    System.out.print("Enter your choice:");
    choice = scanner.nextInt();
    switch (choice) {
        case 1:
            System.out.println("Result is : " + calculator.add(first, second));
            break;
        case 2:
            System.out.println("Result is : " + calculator.subtract(first, second));
            break;
        case 3:
            System.out.println("Result is : " + calculator.multiply(first, second));
            break;
        case 4:
            System.out.println("Result is : " + calculator.divide(first, second));
            break;
        default:
            System.out.println("Enter correct choice");
    }
    scanner.close();
  }

  public double add(double num1, double num2) {
      return num1 + num2;
  }

  public double subtract(double num1, double num2) {
      return num1 - num2;
  }

  public double multiply(double num1, double num2) {
      return num1 * num2;
  }

  public double divide(double num1, double num2) {
      if (num2 == 0) {
          throw new IllegalArgumentException("Division by zero is not allowed.");
      }
      return num1 / num2;
  }
}
