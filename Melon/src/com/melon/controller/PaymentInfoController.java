package com.melon.controller;

import com.melon.model.PaymentInfo;
import com.melon.model.User;
import java.util.HashMap;
import com.melon.controller.UserController;

public class PaymentInfoController {

	User user = null;
	
	UserController us = new UserController();
	private HashMap<String,PaymentInfo> paymentInfomap = new HashMap<>();
	
	//간편결제 등록
    public boolean registerPayment(User user, PaymentInfo paymentinfo) {
    	
    	if(us.login(user.getId(), user.getPassword())) {
    		paymentInfomap.put(user.getId(), paymentinfo);
    		return true;
    	}
    
    	return false;
    }
    
    
   //내가 등록 한 간편결제 등록 보여주기 
    public PaymentInfo getPaymentInfo (User user) {
    	if(us.login(this.user.getId(), this.user.getPassword())) {
    	return paymentInfomap.get(user.getId());
    	
    	}
    return null;
    }

    
  //내가 등록 한 간편결제 방법 수정하기  
    public boolean updatePaymentMethod(User user,String newMethod,String newDetails) {
    	
    	if(us.login(user.getId(), user.getPassword())) {
    		paymentInfomap.get(user.getId()).setPaymentMethod(newMethod);
    		paymentInfomap.get(user.getId()).setPaymentDetails(newDetails);
    		
    		return true;
    	} 
    	
    return false;
   }
    
    //내가 등록 한 간편결제 방법에서 디테일 수정하기 
    public boolean updatePaymentDetails(User user,String paymentMethod,String newDetails) {
    	if(us.login(user.getId(), user.getPassword()) && paymentInfomap.get(user.getId()).getPaymentMethod().equals(paymentMethod)) {
    		paymentInfomap.get(user.getId()).setPaymentDetails(newDetails);
    		return true;
    		
    	
    } return false;
    
   }
  //내가 등록 한 간편결제 삭제하기
    public void deletePaymentInfo(User user ) {
    	if(us.login(this.user.getId(), this.user.getPassword())) {
    		paymentInfomap.remove(user.getId()) = null;
    		
    	}
    	return;
    }
    
    
    
    
    
   
}