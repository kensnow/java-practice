package com.company;

public class BankAccount {

    private String id;
    private double balance;
    private String name;
    private String email;
    private String phone;


    //constructor
    //overload the constructor method so that if feilds are not completed
    // to complete with default values.

    public BankAccount(){
        this("1234567", 0, "John Doe", "No Email Provided", "0000000000");
    }
    //these are required upon instantiating a new BankAccount class.
    public BankAccount(String id, double balance, String name, String email, String phone){
        this.id = id;
        this.balance = balance;
        this.name = name;
        this.email = email;
        this.phone = phone;
    }

    //getters setters

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    // addl functionality

    public void depositFunds(double amount){
        this.balance += amount;
        System.out.println("Successfully deposited $" + amount);
        System.out.println("Current balance is $" + this.balance);
    }

    public void withdrawFunds(double amount){
        if (amount <= this.balance){

            this.balance -= amount;
            System.out.println("Sucessfully withdrew $" + amount);
            System.out.println("Current balance is $" + this.balance);
        } else {
            System.out.println("Not enough funds to process withdrawl.");
        }
    }
}
