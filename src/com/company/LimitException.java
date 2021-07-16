package com.company;

public class LimitException extends Throwable {
    double remainingAmount;

    LimitException(String message, double remainingAmount) {
        super(message);
        this.remainingAmount = remainingAmount;
    }

    public double getRemainingAmount() {
        return remainingAmount;
    }
}