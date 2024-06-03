
package bankmanagement;

class CheckingAccount extends BankAccount {
    private double withdrawalLimit;
    private double withdrawalFee;

    public CheckingAccount(String accountNumber, double balance, double withdrawalLimit, double withdrawalFee) {
        super(accountNumber, balance);
        this.withdrawalLimit = withdrawalLimit;
        this.withdrawalFee = withdrawalFee;
    }

    @Override
    public void deposit(double amount) {
        setBalance(getBalance() + amount);
        System.out.println("Deposit of $" + amount + " successful. Current balance: $" + getBalance());
    }

    @Override
    public void withdraw(double amount) {
        if (getBalance() >= amount) {
            if (amount <= withdrawalLimit) {
                setBalance(getBalance() - amount);
                System.out.println("Withdrawal of $" + amount + " successful. Current balance: $" + getBalance());
            } else {
                setBalance(getBalance() - amount - withdrawalFee);
                System.out.println("Withdrawal of $" + amount + " successful (including fee). Current balance: $" + getBalance());
            }
        } else {
            System.out.println("Insufficient funds. Withdrawal failed.");
        }
    }
}