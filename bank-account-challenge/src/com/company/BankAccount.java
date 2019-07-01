package com.company;

public class BankAccount {

    private String number;
    private double balance;
    private String ownerName;
    private String phoneNumber;
    private String email;

    //constructor

    //establish object defaults using uniquie 'this' keyword
    public BankAccount(){
        this("000000", 0, "John Doe", "12343252523", "test@test.com");
    }

    //constructor

    public BankAccount(String number, double balance, String ownerName, String phoneNumber, String email){
        //initialize numbers
        this.number = number;
        this.balance = balance;
        this.ownerName = ownerName;
        this.phoneNumber = phoneNumber;
        this.email = email;

    }

    //getters
    public String getNumber(){
        return this.number;
    }

    public double getBalance(){
        return this.balance;
    }

    public String getOwnerName(){
        return this.ownerName;
    }

    public String getPhoneNumber(){
        return this.phoneNumber;
    }

    public String getEmail(){
        return this.email;
    }

    //setters

    public void setNumber(String number){
        this.number = number;
    }

    public void setBalance(double balance){
        this.balance = balance;
    }

    public void setOwnerName(String ownerName){
        this.ownerName = ownerName;
    }

    public void setPhoneNumber(String phoneNumber){
        this.phoneNumber = phoneNumber;
    }

    public void setEmail(String email){
        this.email = email;
    }

    //add'l methods

    public String depositFunds (double depositAmount){
        this.balance += depositAmount;
        return "$" + depositAmount + "was deposited to " + this.number;

    }

    public String withdrawFunds (double withdrawAmount){
        if (withdrawAmount < this.balance){
            this.balance -= withdrawAmount;
            return "$" + withdrawAmount + "was deposited to " + this.number;
        }
        return "Transaction Error: Insufficient funds";

    }


}
