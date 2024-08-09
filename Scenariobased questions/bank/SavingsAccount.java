package bank;

public class SavingsAccount extends account implements InterestBearing {
    private double interestRate;
    private double minimumBalance;

    public SavingsAccount(String accountNumber, String customerName, double balance, double interestRate, double minimumBalance) {
        super(accountNumber, customerName, balance, "Savings");
        this.interestRate = interestRate;
        this.minimumBalance = minimumBalance;
    }

    public void calculateInterest() {
        if (balance >= minimumBalance) {
            double interest = balance * interestRate / 100;
            balance += interest;
            System.out.println("Interest added: " + interest);
        } else {
            System.out.println("Balance is below minimum. No interest added.");
        }
    }

    @Override
    public void withdraw(double amount) {
        if (balance - amount >= minimumBalance) {
            super.withdraw(amount);
        } else {
            System.out.println("Cannot withdraw. Balance would fall below the minimum required.");
        }
    }

    @Override
    public void displayAccountDetails() {
        super.displayAccountDetails();
        System.out.println("Interest Rate: " + interestRate + "%");
        System.out.println("Minimum Balance: " + minimumBalance);
    }
}
