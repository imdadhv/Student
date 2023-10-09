package com.example.demo.dp;

import com.example.demo.service.PaymentService;
import com.example.demo.service.impl.GoldenPay;

public class FactoryMethod {
    public static PaymentService paymentService() {
        return new GoldenPay();
    }

}
