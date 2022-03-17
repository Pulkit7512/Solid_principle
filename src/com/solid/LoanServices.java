package com.solid;

//here Bank Services has given only one responsibility so that it has
//only reason to change
// we have not added loan services or notification services  to it.
//we must create other interfaces to do so
public interface LoanServices {
    public void getLoanServiceInfo(String loanType);
}
