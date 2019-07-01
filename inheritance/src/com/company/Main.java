package com.company;

public class Main {

    public static void main(String[] args) {
	// Inheritance project

        Animal animal = new Animal("Animal", 1, 2, 5, 5);

        Dog dog = new Dog("Nova Scotia Duck Tolling Retriever", 8, 20, 2, "Golden");

        dog.eat(); //inheriting method from Animal Class

        dog.walk();
        dog.run();
        animal.move(6);
    }
}
