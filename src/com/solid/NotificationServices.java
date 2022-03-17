package com.solid;
//------------------------------------OPEN / CLOSED-----------------------------------------------------------------
//suppose we have to add feature of sending notification using mobile,email and whatsapp
//instead of modifying in the notification interface we will implement it
//which follows the principle of open for extension closed for modification


public interface NotificationServices {
    public void sendOtp(String Medium);

    public void sendTransactionReport(String medium);
}
