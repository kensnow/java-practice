package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here

        BankAccount kensAccount = new BankAccount("123456", 1500000, "Ken", "k@k.com", "234-567-2345");


        System.out.println(kensAccount.getEmail());
        System.out.println(kensAccount.getName());
        System.out.println(kensAccount.getBalance());
        kensAccount.depositFunds(1000000);
        kensAccount.withdrawFunds(50000);
        kensAccount.withdrawFunds(545);
        kensAccount.withdrawFunds(100000000);

        BankAccount testAccount = new BankAccount();

        System.out.println(testAccount.getEmail());
        System.out.println(testAccount.getName());
        System.out.println(testAccount.getBalance());

        VIPBankAccount vipKen = new VIPBankAccount();

        vipKen.setCreditLimit(6969696);

        System.out.println(vipKen.getEmail());
        System.out.println(vipKen.getName());
        System.out.println(vipKen.getBalance());
        System.out.println(vipKen.getCreditLimit());

        VIPBankAccount vipTest = new VIPBankAccount("BobTest", 1000020, 500000);
        System.out.println(vipTest.getCreditLimit());
        System.out.println(vipTest.getEmail());
        System.out.println(vipTest.getId());
    }
}
