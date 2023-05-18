/*With the result it’s also print one more message “Would you like to do  more calculation Please enter “Y” or “N” :” (Hint use while loop if user  enter Y program asking the user to enter First Number, and if user enter  N programme should terminate)
 */
        package Midweek;

import java.util.Scanner;

public class Terminate {
    public static void main(String[] args) {
                    Scanner input = new Scanner(System.in);

                    boolean Calculations = true;

                    while (Calculations) {
                        // Input first number
                        System.out.print("Enter first number: ");
                        double num1 = input.nextDouble();

                        // Input second number
                        System.out.print("Enter second number: ");
                        double num2 = input.nextDouble();

                        // Input arithmetic operator symbol
                        System.out.print("Please enter one of the symbols (+, -, *, /): ");
                        char operator = input.next().charAt(0);

                        double result = 0;

                        // Perform arithmetic operation  operator symbol
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

                        System.out.print("Would you like to do more calculations? Please enter 'Y' or 'N': ");//perform calculation.
                        char choice = input.next().charAt(0);

                        if (choice == 'N' || choice == 'n') {
                            Calculations = false;
                        }
                    }
                }
            }











