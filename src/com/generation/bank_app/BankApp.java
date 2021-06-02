package com.generation.bank_app;

public class BankApp {

    public static void main (String[] args) {
        BankAccount customerAcct = new BankAccount(50.00, 100.00);
        System.out.println(customerAcct.getCheckingBalance());
        System.out.println(customerAcct.getSavingsBalance());
        customerAcct.withdrawalAmt(10.00, 20.00);
        System.out.println(customerAcct.getCheckingBalance());
        System.out.println(customerAcct.getSavingsBalance());
    }





}
