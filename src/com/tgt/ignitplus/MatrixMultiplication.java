/*
Program to multiply two matrices.
Before multiplication, we check whether they can be multiplied or not.
 */
package com.tgt.ignitplus;

import java.util.Scanner;

class MatrixMultiplication {
    public static void main(String args[]) {
        int m, n, p, q, sum = 0, c, d, k;

        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number of rows and columns of first matrix");
        m = in.nextInt();
        n = in.nextInt();

        int first[][] = new int[m][n];

        System.out.println("Enter elements of first matrix");

        for (c = 0; c < m; c++)
            for (d = 0; d < n; d++)
                first[c][d] = in.nextInt();

        System.out.println("Enter the number of rows and columns of second matrix");
        p = in.nextInt();
        q = in.nextInt();

        if (n != p)
            System.out.println("The matrices can't be multiplied with each other.");
        else {
            int second[][] = new int[p][q];
            int result[][] = new int[m][q];

            System.out.println("Enter elements of second matrix");

            for (c = 0; c < p; c++)
                for (d = 0; d < q; d++)
                    second[c][d] = in.nextInt();

            for (c = 0; c < m; c++) {
                for (d = 0; d < q; d++) {
                    for (k = 0; k < p; k++)
                        sum = sum + first[c][k] * second[k][d];

                    result[c][d] = sum;
                    sum = 0;
                }
            }

            System.out.println("Product of the matrices:");

            for (c = 0; c < m; c++) {
                for (d = 0; d < q; d++)
                    System.out.print(result[c][d] + "\t");

                System.out.print("\n");
            }
        }
    }
}
/*
Output 1:
Enter the number of rows and columns of first matrix
3 3
Enter elements of first matrix
1 2 3
4 5 6
7 8 9
Enter the number of rows and columns of second matrix
3 3
Enter elements of second matrix
9 8 7
6 5 4
3 2 1
Product of the matrices:
30	24	18
84	69	54
138	114	90

Output 2:
Enter the number of rows and columns of first matrix
2 2
Enter elements of first matrix
1 2
3 4
Enter the number of rows and columns of second matrix
1 1
The matrices can't be multiplied with each other.
 */