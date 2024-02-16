package com.example.calculator;

import java.util.Scanner;

public class Calculator {

  public static void main(String[] args) {
    Calculator calculator = new Calculator();
    Scanner scanner = new Scanner(System.in);
    int first, second;
    System.out.print("Enter first number: ");
    first = scanner.nextInt();
    System.out.print("Enter second number: ");
    second = scanner.nextInt();
    System.out.println("Result is : " + calculator.add(first, second));
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
