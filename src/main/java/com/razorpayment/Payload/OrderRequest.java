package com.razorpayment.Payload;

import lombok.Data;

@Data
public class OrderRequest {
    private long amount;
    private String currency;
}

