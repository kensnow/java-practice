package com.company;

public class VIPBankAccount extends BankAccount {

    private double creditLimit;

    //need to build a constructor to make sure all params make it to super class

    public VIPBankAccount(){
        this("696969", 0, "Billy blow", "bb@bk.com", "293-239-2392", 100000);

    }

    public VIPBankAccount(String name, double balance, double creditLimit){
        this("77769777", balance, name, "vip@vipbank.com", "620-565-5984", creditLimit);
    }


    public VIPBankAccount(String id, double balance, String name, String email, String phone, double creditLimit){
        super(id, balance, name, email, phone);
        this.creditLimit = creditLimit;
    }

    public void setCreditLimit(double amount){
        this.creditLimit = amount;
    }

    public void increaseCreditLimit(double amount){
        this.creditLimit += amount;
    }

    public double getCreditLimit(){
        return this.creditLimit;
    }


}
