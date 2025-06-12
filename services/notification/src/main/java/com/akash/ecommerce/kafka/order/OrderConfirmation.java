package com.akash.ecommerce.kafka.order;

import com.akash.ecommerce.kafka.payment.PaymentMethod;

import java.math.BigDecimal;
import java.util.List;

public record OrderConfirmation(
        String orderReference,
        BigDecimal totalPrice,
        PaymentMethod paymentMethod,
        Customer customer,
        List<Product> products
) {
}
