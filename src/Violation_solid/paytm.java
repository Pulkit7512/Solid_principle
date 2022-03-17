package Violation_solid;

public class paytm implements UPIPayment {
    public void payMoney() {
        System.out.println("Paid money to Pulkit");
    }

    public void getScratchMethod() {
        System.out.println("won a scratch card");
    }

    // here interface is not segregated which results in paytm implementing method it does not have
    //it violates the interface segregation principle
    public void getCashBackCreditBalance() {
        System.out.println("error!!! paytm does not give cashback in credit balance");
    }
}
