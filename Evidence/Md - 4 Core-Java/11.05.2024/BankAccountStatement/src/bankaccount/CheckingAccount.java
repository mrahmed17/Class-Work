
package bankaccount;

public class CheckingAccount extends BankAccount{
    
  private double withdrawalLimit;
    private double withdrawalFee;

    public CheckingAccount(double initialBalance, double withdrawalLimit, double withdrawalFee) {
        super(initialBalance);
        this.withdrawalLimit = withdrawalLimit;
        this.withdrawalFee = withdrawalFee;
    }

    @Override
    public void deposit(double amount) {
        balance += amount;
    }

    @Override
    public void withdraw(double amount) {
        if (balance >= amount) {
            if (amount <= withdrawalLimit) {
                balance -= amount;
            } else {
                System.out.println("Exceeded withdrawal limit. Charged withdrawal fee.");
                balance -= (amount + withdrawalFee);
            }
        } else {
            System.out.println("Insufficient funds!");
        }
    }

    @Override
    public double calculateInterest() {
        return 0; // Checking accounts typically don't earn interest
    }
}
