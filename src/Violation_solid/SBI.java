package Violation_solid;

public class SBI extends Bank {
    public void PassBook() {
        System.out.println("SBI provides you Passbook");
    }

    public void debitCard() {
        System.out.println("SBI provides you debit card");
    }

    public void checkbook() {
        System.out.println("SBI provides you checkbook");
    }
//         public void creditCard(){
//
//         }
    //although SBI class extends the Bank class but we do not have a feature of Credit Card
    //in SBI so class SBI can not be replaced by class Bank
    //hence it violates the liskov substitution principle
}
