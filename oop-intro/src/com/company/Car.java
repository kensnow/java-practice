package com.company;

public class Car {
    // public class car is the statement for creating a new class 'Car'
    // public is a keyword that is an access modifier, determines access to class, public,
    // public - unrestricted access to file
    // private - no other class can access
    // protected - only other classes in this package can access

    //Class is a blueprint for our object.

    //establishing the 'state' of the car
    private int doors;
    private int wheels;
//    public String model; //bad solution, violates Dependency Inversion principle
    private String model; //bad solution, violates Dependency Inversion principle / encapsulation
    private String enging;
    private String color;
    //end state establishing

    //setModel is an example as 'setter'.  A 'setter' sets values in state.
    public void setModel(String model){
        this.model = model;
        //this.model refers to above private String model.
        /// Contents is model being passed to method.
    }

    //getModel is an example of a 'getter'.
    // A getter is a function that retrieves data/state/functionality from this Class
    public String getModel(){
        return this.model;
    }
}
