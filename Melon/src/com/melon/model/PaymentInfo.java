package com.melon.model;

public class PaymentInfo {

	
	private String paymentMethod;
	private String paymentDetails;
	
	
	
	public PaymentInfo() {
		
	}



	public PaymentInfo(String paymentMethod, String paymentDetails) {
		
		this.paymentMethod = paymentMethod;
		this.paymentDetails = paymentDetails;
	}



	public String getPaymentMethod() {
		return paymentMethod;
	}



	public void setPaymentMethod(String paymentMethod) {
		this.paymentMethod = paymentMethod;
	}



	public String getPaymentDetails() {
		return paymentDetails;
	}



	public void setPaymentDetails(String paymentDetails) {
		this.paymentDetails = paymentDetails;
	}
	
	
	
}
