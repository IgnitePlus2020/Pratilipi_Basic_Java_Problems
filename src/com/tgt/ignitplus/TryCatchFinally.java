/* Program describes that finally block if executed
whether an exception is handled or not.
 */
package com.tgt.ignitplus;

public class TryCatchFinally {
    public static void main(String[] args) {
        try {
            int num = 10 / 0;
        } catch (Exception e) {
            System.out.println("Inside 1st catch block\n" + e);
        } finally {
            System.out.println("Inside 1st finally block");
        }
        try {
            int num = 10 / 10;
        } catch (Exception e) {
            System.out.println("\nInside 2nd catch block\n" + e);
        } finally {
            System.out.println("\nInside 2nd finally block");
        }
    }
}
/*
Output:
Inside 1st catch block
java.lang.ArithmeticException: / by zero
Inside 1st finally block

Inside 2nd finally block
 */