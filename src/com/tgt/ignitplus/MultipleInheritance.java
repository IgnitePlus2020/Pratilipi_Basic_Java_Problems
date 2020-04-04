/*Program to display multiple inheritance using interface and abstract class.
 */
package com.tgt.ignitplus;

interface MotorBike {
    int speed = 50;

    public void totalDistance();
}

interface Cycle {
    int distance = 100;

    public void speed();
}

class TwoWheeler implements MotorBike, Cycle {
    int totalDistance;
    int avgSpeed;
    int time = 100;

    public void totalDistance() {
        totalDistance = speed * time;
        System.out.println("Total Distance Travelled : " + totalDistance);
    }

    public void speed() {
        avgSpeed = totalDistance / time;
        System.out.println("Average Speed maintained : " + avgSpeed);
    }

}

public class MultipleInheritance {
    public static void main(String args[]) {
        TwoWheeler t1 = new TwoWheeler();
        t1.totalDistance();
        t1.speed();
    }
}

/*
Output:
Total Distance Travelled : 5000
Average Speed maintained : 50
 */