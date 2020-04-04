/*Program to display the grade of student
 This program assumes that the student has 3 subjects.
 You can change this as per the requirement.
 */
package com.tgt.ignitplus;

import java.util.Scanner;

public class GradeOfStudent {
    public static void main(String[] args) {
        int marks[] = new int[3];
        int i;
        float total = 0, avg;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the marks in 3 subjects out of 100:");
        for (i = 0; i < 3; i++) {
            System.out.print("Enter Marks of Subject " + (i + 1) + ": ");
            marks[i] = scanner.nextInt();
            total = total + marks[i];
        }
        scanner.close();

        //Calculating average
        avg = total / 6;

        //Displaying grades
        System.out.print("The student Grade is: ");
        if (avg >= 80) {
            System.out.print("A");
        } else if (avg >= 60 && avg < 80) {
            System.out.print("B");
        } else if (avg >= 40 && avg < 60) {
            System.out.print("C");
        } else {
            System.out.print("D");
        }
    }
}
/*
Output:
Enter the marks in 3 subjects out of 100:
Enter Marks of Subject 1: 60
Enter Marks of Subject 2: 100
Enter Marks of Subject 3: 80
The student Grade is: C
 */