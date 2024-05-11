package bankaccountstatement;

import bankaccount.CheckingAccount;
import bankaccount.SavingsAccount;

public class BankAccountStatement {

    public static void main(String[] args) {

        SavingsAccount savings = new SavingsAccount(1000, 0.02);
        CheckingAccount checking = new CheckingAccount(2000, 1000, 5);

        savings.deposit(500);
        savings.withdraw(200);
        System.out.println("Savings interest: " + savings.calculateInterest());

        checking.deposit(1000);
        checking.withdraw(1500);
        System.out.println("Checking balance: " + checking.balance);
    }
}
