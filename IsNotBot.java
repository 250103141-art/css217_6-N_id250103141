package com.ecommerce;

public class IsNotBot {

    public boolean isNotBot(String customerId, String productId, double amount) {
        System.out.println("[IsNotBot] Step 1: Evaluating order from customer: " + customerId);

        boolean notBot = customerId != null && !customerId.trim().isEmpty()
                && productId != null && !productId.trim().isEmpty()
                && amount > 0;

        System.out.println("[IsNotBot] Step 2: Order is " + (notBot ? "LEGITIMATE (not a bot)" : "NOT legitimate (bot/spam)"));
        return notBot;
    }
}
