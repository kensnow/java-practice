package com.company;

public class Animal {
    //create basic class where all animals have these base properties.

    private String name;
    private int brain;
    private int body;
    private int size;
    private int weight;

    //auto gen constructor Alt + insert
    public Animal(String name, int brain, int body, int size, int weight) {
        this.name = name;
        this.brain = brain;
        this.body = body;
        this.size = size;
        this.weight = weight;
    }

    //addl behavior / methods

    public void eat(){
        System.out.println(this.name + " is eating");
    }

    public void move(int speed){
        System.out.println("Animal is moving at " + speed);
    }


    //auto gen getters and setters Alt + Insert
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBrain() {
        return brain;
    }

    public void setBrain(int brain) {
        this.brain = brain;
    }

    public int getBody() {
        return body;
    }

    public void setBody(int body) {
        this.body = body;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }
}
