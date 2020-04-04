//Program displays method overriding.
package com.tgt.ignitplus;

public class Animal {
    public void display() {
        System.out.println("This is an animal.");
    }
}

class Dog extends Animal {
    public void display() {
        System.out.println("This is a dog.");
    }
}

class Override {
    public static void main(String[] args) {
        Animal animal_object = new Animal();
        Dog dog_object = new Dog();
        animal_object.display();
        dog_object.display();
    }
}
/*
Output:
This is an animal.
This is a dog.
 */