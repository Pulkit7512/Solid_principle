package com.solid;

public class MySbi implements Bank, CreditCard {

    @Override
    public void passBook() {
        System.out.println("SBI provides you Passbook");
    }

    @Override
    public void debitCard() {
        System.out.println("SBI provides you Debit card");
    }

    @Override
    public void creditCard() {
        System.out.println("SBI provides you Credit card");
    }
}
