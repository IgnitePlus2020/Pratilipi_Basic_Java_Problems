//Program handles Null Pointer Exception
package com.tgt.ignitplus;

public class NullPointerException_Example {
    public static void main(String args[]) {
        try {
            String str = null; //null value
            System.out.println(str.charAt(2));
        } catch (NullPointerException e) {
            System.out.println("Exception:\t" + e);
        }
    }
}
/*
Output:
Exception:	java.lang.NullPointerException
 */