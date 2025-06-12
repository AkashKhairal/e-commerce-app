package com.akash.ecommerce.email;

import lombok.Getter;

public enum EmailTemplates {

    PAYMENT_CONFIRMATION("payment-confirmation.html", "Payment Successfully processed. Thank you for your order!"),
    ORDER_CONFIRMATION("order-confirmation.html", "Order Confirmation - Your order has been placed successfully!");


    @Getter
    private String template;
    @Getter
    private String subject;

    EmailTemplates(String subject, String template) {
        this.subject = subject;
        this.template = template;
    }
}
