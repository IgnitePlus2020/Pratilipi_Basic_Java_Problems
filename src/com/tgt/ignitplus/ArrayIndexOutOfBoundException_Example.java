// Program handles Array Index Out Of Bound Exception
package com.tgt.ignitplus;

public class ArrayIndexOutOfBoundException_Example {
    public static void main(String args[]) {
        try {
            int array[] = new int[10]; // Size of array is 5
            array[15] = 9; // Accessing 11th element
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Exception:\n" + e);
        }
    }
}
/*
Output:
Exception:
java.lang.ArrayIndexOutOfBoundsException: 15
 */
