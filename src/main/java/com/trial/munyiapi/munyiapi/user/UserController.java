package com.trial.munyiapi.munyiapi.user;

import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.trial.munyiapi.munyiapi.DummyData;
import com.trial.munyiapi.munyiapi.otp.GenerateOTP;
import com.trial.munyiapi.munyiapi.twilio.SmsSender;

@RestController
@RequestMapping("/api/v0")
public class UserController {

	@Autowired
	DummyData dummy_data;
	@Autowired
	SmsSender sms_sender;

	@Cacheable("users")
	@GetMapping()
	public User getData(@RequestParam(value = "num") String num) throws Exception {
		
		num = num.replace(" ", "+");
		HashMap<String, String> user_data = dummy_data.getDummy_data().get(num);
		
		if (user_data != null) {
//		HashMap<String, String> data = user_data.get();
		String fname = user_data.get("first_name");
		String lname = user_data.get("last_name");
		
		int otp = GenerateOTP.genOtp();
//		SmsSender.send_otp(fname, Integer.toString(otp), num);
		System.out.println(String.format("Made request for %s", fname));
		return new User(fname, lname, num, otp);
		}
		else {
		  System.out.println("Bad request");
			return new User("User not found", "User not found", "User not found", 0);
		}

	}

}