/*Program to Find Area of Square,Rectangle and Circle using Method Overloading
Method with the same name "Area" is used with different number and type of
arguments.
 */
package com.tgt.ignitplus;

public class CalculateArea {
    void Area(float x) {
        System.out.println("Area of the square is: " + Math.pow(x, 2) + " sq units");
    }

    void Area(float x, float y) {
        System.out.println("Area of the rectangle is: " + x * y + " sq units");
    }

    void Area(double x) {
        double z = 3.14 * x * x;
        System.out.println("Area of the circle is " + z + " sq units");
    }
}

class Overload {
    public static void main(String args[]) {
        CalculateArea ob = new CalculateArea();
        ob.Area(5);
        ob.Area(11, 12);
        ob.Area(2.5);
    }
}
/*
Output:
Area of the square is: 25.0 sq units
Area of the rectangle is: 132.0 sq units
Area of the circle is 19.625 sq units
 */
