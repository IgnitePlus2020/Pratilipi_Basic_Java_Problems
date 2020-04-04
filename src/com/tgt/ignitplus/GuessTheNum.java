/*Guessing Game
Guess a number in the range 0 to 9
 */

package com.tgt.ignitplus;

import java.util.Random;
import java.util.Scanner;

public class GuessTheNum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Random rand = new Random();
        System.out.println("Guessing Game");
        System.out.println("----------------");
        int key = rand.nextInt(10);
        int chance = 3;
        while (chance > 0) {
            chance -= 1;
            System.out.print("Guess: ");
            int guess = in.nextInt();
            if (guess == key) {
                System.out.println("\nYou won!");
                System.exit(0);
            }
        }
        if (chance <= 0)
            System.out.println("\nYou Lost...");
    }
}
/*
Output 1:
Guessing Game
----------------
Guess: 2
Guess: 3
Guess: 4

You won!

Output 2:
Guessing Game
----------------
Guess: 4
Guess: 5
Guess: 7

You Lost...
 */