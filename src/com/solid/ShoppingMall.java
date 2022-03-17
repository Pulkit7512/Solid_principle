package com.solid;
//---------------------dependency Inversion------------------------
public class ShoppingMall {

    private BankCard bankCard;

    public ShoppingMall(BankCard bankCard) {
        this.bankCard = bankCard;
    }

    //instead of tightly coupling credit card or debit card we use bank card which is implemented by
//both credit and debit card.
    void doPurchase(long amount) {
        bankCard.doTransaction(amount);
    }
}
