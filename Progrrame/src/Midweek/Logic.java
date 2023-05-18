/*Write a “main” method into main class. It has scanner that takes user  input. Also write the logic that it ask user to “Enter first Number:”,  “Enter second Number:” “Please enter one of symbol +,-,*, /:” if user  enter + symbol result like “Addition of 5 and 10 is: 15” and respective  for other symbol.
*/package Midweek;

import java.util.Scanner;

public class Logic {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter first number: ");//Enter first number
        double num1 = input.nextDouble();

        System.out.print("Enter second number: ");//Add second number
        double num2 = input.nextDouble();

        System.out.print("Please enter one of the symbols (+, -, *, /): ");//Input symbol
        char operator = input.next().charAt(0);

        double result = 0;

        // Perform arithmetic operation based on the operator symbol
        if (operator == '+') {
            result = num1 + num2;
            System.out.println("Addition of " + num1 + " and " + num2 + " is: " + result);
        } else if (operator == '-') {
            result = num1 - num2;
            System.out.println("Subtraction of " + num2 + " from " + num1 + " is: " + result);
        } else if (operator == '*') {
            result = num1 * num2;
            System.out.println("Multiplication of " + num1 + " and " + num2 + " is: " + result);
        } else if (operator == '/') {
            if (num2 != 0) {
                result = num1 / num2;
                System.out.println("Division of " + num1 + " by " + num2 + " is: " + result);
            } else {
                System.out.println("Cannot divide by zero!");
            }
        } else {
            System.out.println("Invalid operator symbol!");
        }

        // Run report
        System.out.println("\nRun Report:");
        System.out.println("First number: " + num1);
        System.out.println("Second number: " + num2);
        System.out.println("Operator: " + operator);
        System.out.println("Result: " + result);
    }
}



