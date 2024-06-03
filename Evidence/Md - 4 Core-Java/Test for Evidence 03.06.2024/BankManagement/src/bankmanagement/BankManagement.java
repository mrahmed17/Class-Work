
package bankmanagement;

public class BankManagement {

    public static void main(String[] args) {
       
        SavingsAccount savingsAccount = new SavingsAccount("SA123", 1000.0, 0.02);
        CheckingAccount checkingAccount = new CheckingAccount("CA456", 2000.0, 500.0, 5.0);

        savingsAccount.deposit(200.0);
        savingsAccount.withdraw(150.0);
        System.out.println("Interest earned: $" + savingsAccount.calculateInterest());

        checkingAccount.deposit(300.0);
        checkingAccount.withdraw(100.0);
        checkingAccount.withdraw(600.0);
        
    }
    
}
