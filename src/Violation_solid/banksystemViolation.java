package Violation_solid;

//--------------------------------------------------------------------------------------------------

// if we want to add a new feature in notification services to send otp via whatsapp
//we have to modify in the notification services class
//hence it violates the open /closed principle
//---------------------------------------------------------------------------------------------------------

//----------------------------------------------------------------------------------------------

//----------------------------------------------------------------------------------------------

public class banksystemViolation {
    public static void main(String[] args) {
        paytm payment= new paytm();
        payment.payMoney();
        SBI account= new SBI();
        account.PassBook();
    }
}
