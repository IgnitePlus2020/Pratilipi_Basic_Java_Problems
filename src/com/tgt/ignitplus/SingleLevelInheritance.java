/*Program to display single level inheritance.
A single derived class inherited from a single base class
 */
package com.tgt.ignitplus;

class Doctor {
    void Doctor_Details() {
        System.out.println("Doctor Details...");
    }
}

class Surgeon extends Doctor {
    void Surgeon_Details() {
        System.out.println("Surgen Detail...");
    }
}

public class SingleLevelInheritance {
    public static void main(String args[]) {
        Surgeon s = new Surgeon();
        s.Doctor_Details();
        s.Surgeon_Details();
    }
}
/*
Output:
Doctor Details...
Surgen Detail...
 */