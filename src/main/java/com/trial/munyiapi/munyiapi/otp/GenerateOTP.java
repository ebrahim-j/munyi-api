package com.trial.munyiapi.munyiapi.otp;

import java.util.concurrent.ThreadLocalRandom;

public class GenerateOTP {

	public static int genOtp() {
		int randomNum = ThreadLocalRandom.current().nextInt(1000, 10000);
		return randomNum;
	}
}
