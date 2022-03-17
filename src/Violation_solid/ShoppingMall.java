package Violation_solid;

//------------------------Dependency Inversion --------------------------------------------
public class ShoppingMall {

    private CreditCard creditCard;

    //Here CreditCard class is tightly coupled with the Shopping Mall class
    //hence it violates the Dependency Inversion principle
    public ShoppingMall(CreditCard creditCard) {
        this.creditCard = creditCard;
    }

    public void doPurchase(long amount) {
        creditCard.doTransaction(amount);
    }

    class CreditCard {
        public void doTransaction(long amount) {
            System.out.println("You have done a transaction of :" + amount + "using Credit Card");
        }
    }
}
