package com.upskill.assignment_3;

class Animal {
    public void makeSound() {
        System.out.println("The animal makes a generic sound.");
    }
}

class Dog extends Animal {
    @Override
    public void makeSound() {
        System.out.println("The dog barks.");
    }
}

class Cat extends Animal {
    @Override
    public void makeSound() {
        System.out.println("The cat meows.");
    }
}

public class JavaAssignment_3_4 {
    public static void main(String[] args) {
        Animal animal1 = new Dog(); // Upcasting
        Animal animal2 = new Cat(); // Upcasting

        animal1.makeSound(); // Calls the makeSound method of Dog
        animal2.makeSound(); // Calls the makeSound method of Cat
    }
}