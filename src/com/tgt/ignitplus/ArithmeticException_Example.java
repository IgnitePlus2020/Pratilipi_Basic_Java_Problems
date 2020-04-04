/*
Program handles Arithmetic exception of divide by zero
and prints appropriate message
 */
package com.tgt.ignitplus;

public class ArithmeticException_Example {
    public static void main(String[] args) {
        try {
            int numerator = 20, denominator = 0;
            int result = numerator / denominator;
            System.out.println("Result = " + result);
        } catch (ArithmeticException e) {
            System.out.println("Cannot divide a number by 0\n" + e);
        }
    }
}
/*
Output:
Cannot divide a number by 0
java.lang.ArithmeticException: / by zero
 */