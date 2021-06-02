package com.generation.bank_app;

public class BankAccount {
    private final double checkingOpeningDeposit;
    private final double savingsOpeningDeposit;
    private double checkingBalance = 0.00;
    private double savingsBalance = 0.00;


    public BankAccount(double checkingOpeningDeposit, double savingsOpeningDeposit) {
        this.checkingOpeningDeposit = checkingOpeningDeposit;
        this.savingsOpeningDeposit = savingsOpeningDeposit;
        checkingBalance += checkingOpeningDeposit;
        savingsBalance += savingsOpeningDeposit;
    }


    public double getCheckingBalance() {
        return checkingBalance;

    }

    public double getSavingsBalance() {
        return savingsBalance;

    }

    public void withdrawalAmt(double amountWithdrawnChecking, double amountWithdrawnSavings) {
        checkingBalance -= amountWithdrawnChecking;
        savingsBalance -= amountWithdrawnSavings;

    }


}