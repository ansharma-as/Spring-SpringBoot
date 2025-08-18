package com.example.first_project;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Component;

@Component
@ConditionalOnProperty(name="payment.provider" , havingValue="razorpay")
public class RazorpayPaymentService implements PaymentService {
    @Override
    public String pay(){
        String payment = "RazorPay";
        System.out.println("hello" + payment);
        return payment;
    }
}
