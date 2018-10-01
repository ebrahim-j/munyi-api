package com.trial.munyiapi.munyiapi.twilio;

import org.springframework.context.annotation.Configuration;

//Install the Java helper library from twilio.com/docs/libraries/java
import com.twilio.Twilio;
import com.twilio.rest.api.v2010.account.Message;
import com.twilio.type.PhoneNumber;

@Configuration
public class SmsSender {
 // Find your Account Sid and Auth Token at twilio.com/console
 public static final String ACCOUNT_SID =
         "";
 public static final String AUTH_TOKEN =
         "";

 public static void send_otp(String name, String otp, String num) {
     Twilio.init(ACCOUNT_SID, AUTH_TOKEN);

     Message message = Message
             .creator(new PhoneNumber(num), // to
                     new PhoneNumber("+32460205473"), // from
                     String.format("Hi %s! Your FTTH verification code is: %s", name, otp))
             .create();

     System.out.println(message.getSid());
     System.out.println("\nMessage sent!\n");
 }
}

