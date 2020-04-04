//Program handles String Index Out Of Bound Exception

package com.tgt.ignitplus;

public class StringIndexOutOfBoundException_Example {
    public static void main(String args[]) {
        try {
            String str = "Hello World"; // length is 11
            char c = str.charAt(20); // accessing 21st element
            System.out.println(c);
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Exception:\n" + e);
        }
    }
}
/*
Output:
Exception:
java.lang.StringIndexOutOfBoundsException: String index out of range: 20
 */
