package com.solid;

public class MyPnb implements Bank, CheckBook {
    @Override
    public void passBook() {
        System.out.println("PNB provides you Passbook");
    }

    @Override
    public void debitCard() {
        System.out.println("PNB provides you Debit card");
    }

    @Override
    public void checkBook() {
        System.out.println("PNB provides you Check Book");
    }
}
