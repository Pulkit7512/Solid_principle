package com.solid;



public class BankSystem {
    public static void main(String[] args) {
        BankCard bankcard = new DebitCards();
        ShoppingMall shoppingMall = new ShoppingMall(bankcard);
        shoppingMall.doPurchase(5000);
        MySbi sbi = new MySbi();
        sbi.debitCard();
        sbi.creditCard();
    }
}
