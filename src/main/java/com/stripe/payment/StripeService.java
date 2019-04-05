package com.stripe.payment;

import java.util.HashMap;
import java.util.Map;

import com.stripe.Stripe;
import com.stripe.model.Charge;

public class StripeService {
	
	public StripeService() {
		Stripe.apiKey = "sk_test_XowSg8EJpSvSOfD8ko3Tnog9";
		System.out.println(Stripe.apiKey);
	}

	public Charge chargeCreditCard(ChargeRequest chargeRequest) throws Exception {
		System.out.println("in chargecreditcard");
		Map<String, Object> chargeParams = new HashMap<String, Object>();
		System.out.println("after map ");
		
		double amount = chargeRequest.getAmount();
		System.out.println(amount);
		String token = chargeRequest.getStripeToken();
		System.out.println(token);
		chargeParams.put("amount",amount);
		System.out.println("put amount");
		chargeParams.put("currency", "USD");
		chargeParams.put("source", token);
		Charge charge = Charge.create(chargeParams);
		System.out.println(charge);
		return charge;
	}
}
//
// private String secretKey = "sk_test_XowSg8EJpSvSOfD8ko3Tnog9";
//
// public void init() {
//
// Stripe.apiKey = "sk_test_XowSg8EJpSvSOfD8ko3Tnog9";
//
// }
//
// public Charge charge() throws StripeException {
//
// Map<String, Object> chargeParams = new HashMap<>();
//
// chargeParams.put("Amount", 12);
// chargeParams.put("EmailId", "vivek@gmail.com");
// chargeParams.put("Token", "jagfuaihdfakuhdfu");
// /*
// * chargeParams.put("Amount", chargeRequest.getAmount());
// * chargeParams.put("Email_Id", chargeRequest.getStripeEmail());
// * chargeParams.put("Token", chargeRequest.getStripeToken());
// */
// System.out.println(secretKey);
// System.out.println(chargeParams);
// return Charge.create(chargeParams);
// }
