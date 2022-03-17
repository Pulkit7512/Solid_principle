package com.solid;

//--------------------------------------Single Responsiblity--------------------------------------
public interface BankServices {
    public long deposit(long amount, String accountNo);

    public long withDraw(long amount, String accountNo);

}
//according to single responsibility a class should have only one reason to change