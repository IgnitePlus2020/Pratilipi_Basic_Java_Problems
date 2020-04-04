/*Program handles Number Format Exception
where an integer variable is assigned a string value
 */
package com.tgt.ignitplus;

public class NumberFormatException_Example {
    public static void main(String args[]) {
        try {
            // "abc" is not a number
            int num = Integer.parseInt("abc");
            System.out.println(num);
        } catch (NumberFormatException e) {
            System.out.println("Exception:\t" + e);
        }
    }
}
/*
Output:
Exception:	java.lang.NumberFormatException: For input string: "abc"
 */