package com.dvimer.designpatterns.behhavioral.command;

public class CommandDemo {
    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount();

        new BankAccountCommand(
                bankAccount,
                BankAccountCommand.Action.DEPOSIT,
                1000)
                .call();

        new BankAccountCommand(
                bankAccount,
                BankAccountCommand.Action.WITHDRAW,
                100)
                .call();

    }
}
