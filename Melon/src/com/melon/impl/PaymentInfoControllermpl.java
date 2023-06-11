package com.melon.impl;
import com.melon.model.PaymentInfo;
import com.melon.model.User;
public interface PaymentInfoControllermpl {
	
	//간편결제 등록
    public boolean registerPayment(User user, PaymentInfo paymentinfo);
    
    //내가 등록 한 간편결제 등록 보여주기 
    public PaymentInfo getPaymentInfo (User user);

    //내가 등록 한 간편결제 방법 수정하기  
    public boolean updatePaymentMethod(User user,String newMethod,String newDetails);
    
    //내가 등록 한 간편결제 방법에서 디테일 수정하기 
    public boolean updatePaymentDetails(User user,String paymentMethod,String newDetails);
    
    //내가 등록 한 간편결제 삭제하기
    public void deletePaymentInfo(User user);
}
