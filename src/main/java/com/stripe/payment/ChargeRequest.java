package com.stripe.payment;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties
public class ChargeRequest {

	private double amount;
	private String stripeEmail;
	private String stripeToken;
	
	public ChargeRequest() {
		super();
		
	}
	
	public ChargeRequest(double amount, String stripeEmail, String stripeToken) {
		super();
		this.amount = amount;
		this.stripeEmail = stripeEmail;
		this.stripeToken = stripeToken;
	}
	
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	public String getStripeEmail() {
		return stripeEmail;
	}
	public void setStripeEmail(String stripeEmail) {
		this.stripeEmail = stripeEmail;
	}
	public String getStripeToken() {
		return stripeToken;
	}
	public void setStripeToken(String stripeToken) {
		this.stripeToken = stripeToken;
	}
	@Override
	public String toString() {
		return "ChargeRequest [amount=" + amount + ", stripeEmail=" + stripeEmail + ", stripeToken=" + stripeToken
				+ "]";
	}

}