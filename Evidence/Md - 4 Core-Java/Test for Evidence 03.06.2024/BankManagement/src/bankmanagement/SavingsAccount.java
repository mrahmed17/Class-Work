
package bankmanagement;

class SavingsAccount extends BankAccount {
    private double interestRate;

    public SavingsAccount(String accountNumber, double balance, double interestRate) {
        super(accountNumber, balance);
        this.interestRate = interestRate;
    }

    @Override
    public void deposit(double amount) {
        setBalance(getBalance() + amount);
        System.out.println("Deposit of $" + amount + " successful. Current balance: $" + getBalance());
    }

    @Override
    public void withdraw(double amount) {
        if (getBalance() >= amount) {
            setBalance(getBalance() - amount);
            System.out.println("Withdrawal of $" + amount + " successful. Current balance: $" + getBalance());
        } else {
            System.out.println("Insufficient funds. Withdrawal failed.");
        }
    }

    public double calculateInterest() {
        return getBalance() * interestRate;
    }
}

