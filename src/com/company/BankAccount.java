package com.company;

public class BankAccount {
    double balance;

    public double getAmount() {
        return balance;
    }

    public void deposit(double sum) {
        balance += sum;
    }

    public void withDraw(int sum) throws LimitException {
        if (sum > balance) {
            throw new LimitException("Ваш баланс ", balance);
        }
        balance -= sum;
        System.out.println("Снятие наличных " + sum);


    }
}