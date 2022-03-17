package com.solid;
//whatsapp notification extends Notification services in case we want to sent notifications on whatsapp

public class WhatsappNotificationService implements NotificationServices {
    @Override
    public void sendOtp(String medium) {
        System.out.println("OTP sent to your whatsapp");
    }

    @Override
    public void sendTransactionReport(String medium) {
        System.out.println("Transaction report sent to your whatsapp");
    }
}
