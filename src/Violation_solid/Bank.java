package Violation_solid;

//-----------------------------LISKOV SUBSTITUTION---------------------------------------------------------
public class Bank {
    public void PassBook() {
        System.out.println("bank should have passbook");
    }

    public void debitCard() {
        System.out.println("bank should have debit card");
    }

    public void checkbook() {
        System.out.println("bank should have checkbook");
    }

    public void creditCard() {
        System.out.println("bank should have creditcard");
    }
}
