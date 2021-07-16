package com.company;

public class Main {

    public static void main(String[] args) throws LimitException {
        BankAccount balanceKg = new BankAccount();
        balanceKg.deposit(20000);
        while (true){
            try {
                System.out.println("Исходящее сальдо  " + balanceKg.getAmount());
                balanceKg.withDraw(6000);
                System.out.println();
            } catch (LimitException e) {
                System.err.println(e.getMessage());
                balanceKg.withDraw((int) balanceKg.getAmount());
                System.out.println("Остаток  " + balanceKg.getAmount());
                break;
            } 
        }
    }
}