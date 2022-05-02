package com.dvimer.designpatterns.behhavioral.command;

import lombok.Data;

@Data
public class BankAccount {
    private int balance;
    private int overdraftLimit = -500;

    public boolean deposit(int amount) {
        balance += amount;
        System.out.println("Deposited:" + amount + ", balance:" + balance);
        return true;
    }

    public boolean withdraw(int amount) {
        if (balance - amount >= overdraftLimit) {
            balance -= amount;
            System.out.println("Withdraw:" + amount + ", balance:" + balance);
            return true;
        }
        return false;
    }
}
