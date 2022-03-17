package com.solid;
//mobile notification extends Notification services in case we want to sent notifications on mobile
public class MobileNotificationService implements NotificationServices {
    @Override
    public void sendOtp(String medium) {
        System.out.println("OTP sent to your mobile");
    }

    @Override
    public void sendTransactionReport(String medium) {
        System.out.println("Transaction report sent to your mobile");
    }
}
