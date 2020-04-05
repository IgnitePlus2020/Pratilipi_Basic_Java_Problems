/*Program displays the differenece in time complexity of StringBuffer
and StringBuilder methods.
 */
package com.tgt.ignitplus;

public class StringBufferAndStringBuilder {
    public static void main(String[] args){
        long startTime = System.currentTimeMillis();
        StringBuffer strBuffer = new StringBuffer("Java");
        for (int i=0; i<10000; i++){
            strBuffer.append("Tpoint");
        }
        System.out.println("Time taken by StringBuffer: " + (System.currentTimeMillis() - startTime) + " ms");
        startTime = System.currentTimeMillis();
        StringBuilder strBuilder = new StringBuilder("Java");
        for (int i=0; i<10000; i++){
            strBuilder.append("Tpoint");
        }
        System.out.println("Time taken by StringBuilder: " + (System.currentTimeMillis() - startTime) + " ms");
    }
}
/*
Time taken by StringBuffer: 21 ms
Time taken by StringBuilder: 4 ms
 */