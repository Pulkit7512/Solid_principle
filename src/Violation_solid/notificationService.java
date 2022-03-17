package Violation_solid;

//------------------------------------OPEN / CLOSED---------------------------------------------------
public class notificationService {
    public void sendOtp(String Medium) {
        if (Medium.equals("email")) {
            //write email related logic
           System.out.println("notify via mail");
        }
        if (Medium.equals("mobile")) {
            //write message related logic
            System.out.println("notify via mobile");
        }
    }
}
//if we want to add a new feature in notification services to send otp via whatsapp
//we have to modify in the notification services class
//hence it violates open/closed principle
