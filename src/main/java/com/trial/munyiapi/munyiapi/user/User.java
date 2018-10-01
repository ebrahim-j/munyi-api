package com.trial.munyiapi.munyiapi.user;

public class User {
	private String firstname;
	private String lastname;
	private String number;
	private int otp;
	
	public User(String firstname, String lastname, String number, int otp) {
		
		this.firstname = firstname;
		this.lastname = lastname;
		this.number = number;
		this.otp = otp;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public int getOtp() {
		return otp;
	}

	public void setOtp(int otp) {
		this.otp = otp;
	}
	
}
