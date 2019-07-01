package com.company;

public class VIP {
    private String name;
    private double creditLimit;
    private String email;

    public VIP (){
        this("Joe Dirt", 1000000, "dirt-ay@dirt.com");
    }


    public VIP (String name, double creditLimit, String email){
        this.name = name;
        this.creditLimit = creditLimit;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    public String getEmail() {
        return email;
    }
}
