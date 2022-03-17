package com.solid;

public class Gpay implements UpiPayment, CashBackManager {
    @Override
    public void getCashBackAsCreditBalance() {
        System.out.println("cash back received to your bank account");
    }

    @Override
    public void payMoney() {
        System.out.println("Paid money to Pulkit");
    }

    @Override
    public void getScratchMethod() {
        System.out.println("You got a scratch card worth of 50 rs");
    }
}
