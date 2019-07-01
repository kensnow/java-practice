package com.company;

public class Dog extends Animal {

    private int eyes;
    private int legs;
    private int teeth;
    private String coat;

    //initialize animal
    //auto complete constructor Alt + Insert
    public Dog(String name, int brain, int body, int size, int weight, int eyes, int legs, int teeth, String coat) {
        super(name, 1, 1, size, weight); //super, call super class, the constructor we are extending from
        this.eyes = eyes;
        this.legs = legs;
        this.teeth = teeth;
        this.coat = coat;


    }

    public Dog (String name, int size, int weight, int teeth, String coat){
        super(name, 1, 1, size, weight);

    }


    private void chew(){
        System.out.println("Chewy! Have you even seen star wars?");
    }

    //Override is used to change the parent method to make it unique to Dog class
    //kind of like an interceptor for the eat( method
    @Override
    public void eat(){
        chew();
        super.eat();
    }

    public void walk(){
        move(3);
    }

    public void run(){
        move(9);
    }

    @Override
    public void move(int speed){
        System.out.println("This dog is crusing at " + speed);
        super.move(speed);

    }


}
