package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        BankAccount kenAccount = new BankAccount("12412414", 45000000, "Ken Snow", "6038095039", "ken@ken.com" );
//old way without constructor
//        kenAccount.setAccountNumber("132934234");
//        kenAccount.setBalance(1000000);
//        kenAccount.setAccountOwnerName("Ken Snow");
//        kenAccount.setPhoneNumber("6038092565");
//        kenAccount.setEmail("kensnow@ksnow.com");


        kenAccount.depositFunds(5000);
        kenAccount.withdrawFunds(1000);


        System.out.println(kenAccount.getNumber());
        System.out.println(kenAccount.getOwnerName());
        System.out.println(kenAccount.getBalance());
        System.out.println(kenAccount.getEmail());
        System.out.println(kenAccount.getPhoneNumber());
    }
}
