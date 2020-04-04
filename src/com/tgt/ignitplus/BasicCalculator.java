/*
Program to make a basic calculator using switch case
 */
package com.tgt.ignitplus;

import java.util.Scanner;

public class BasicCalculator {
    public static void main(String[] args) {

        double num1, num2;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first number: ");
        num1 = scanner.nextDouble();

        System.out.print("Enter an operator (+, -, *, /, %): ");
        char operator = scanner.next().charAt(0);


        System.out.print("Enter second number: ");
        num2 = scanner.nextDouble();

        scanner.close();
        double output;

        switch (operator) {
            case '+':
                output = num1 + num2;
                break;

            case '-':
                output = num1 - num2;
                break;

            case '*':
                output = num1 * num2;
                break;

            case '/':
                if (num2 == 0) {
                    System.out.println("Divide by 0 error");
                    System.exit(0);
                }
                output = num1 / num2;
                break;

            case '%':
                output = num1 % num2;
                break;

            default:
                System.out.printf("You have entered wrong operator");
                return;
        }
        System.out.println(num1 + " " + operator + " " + num2 + " = " + output);
    }
}
/*
Enter first number: 2.2
Enter an operator (+, -, *, /, %): +
Enter second number: 5.5
2.2 + 5.5 = 7.7
 */
