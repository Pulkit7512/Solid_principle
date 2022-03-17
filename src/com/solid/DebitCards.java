package com.solid;

public class DebitCards implements BankCard {
    @Override
    public void doTransaction(long amount) {
        System.out.println("You have done a transaction of :" + amount + "using Debit Card  ");
    }
}
