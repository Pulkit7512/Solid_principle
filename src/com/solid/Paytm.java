package com.solid;

public class Paytm implements UpiPayment {
    @Override
    public void payMoney() {
        System.out.println("Paid money to Pulkit");
    }

    @Override
    public void getScratchMethod() {
        System.out.println("You got a scratch card worth of 50 rs");
    }
}
