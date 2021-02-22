package com.techelevator;

public class CheckingAccount extends BankAccount {

    public CheckingAccount(String accountHolder, String accountNumber, int balance) {
        super (accountHolder, accountNumber, balance);
    }

    public CheckingAccount(String accountHolder, String accountNumber) {
        super (accountHolder, accountNumber);
    }

    @Override
    public int withdraw(int amountToWithdraw) {

        if (getBalance () - amountToWithdraw >= 0) {
            // Withdraw the $$
            super.withdraw (amountToWithdraw);

            // allow the withdraw if the balance isn't going to go below -$100
            // if the balance is below 0, assess $10 charge

        } else if ((getBalance () - amountToWithdraw >= -100) && (getBalance () - amountToWithdraw < 0)) {
            super.withdraw (amountToWithdraw + 10);
        }


        return getBalance ();
    }


}

