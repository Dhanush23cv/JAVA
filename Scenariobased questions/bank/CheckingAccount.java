package bank;

public class CheckingAccount extends account {
    private double minimumBalance;
    private double fee;

    public CheckingAccount(String accountNumber, String customerName, double balance, double minimumBalance, double fee) {
        super(accountNumber, customerName, balance, "Checking");
        this.minimumBalance = minimumBalance;
        this.fee = fee;
    }

    @Override
    public void withdraw(double amount) {
        if (balance - amount >= 0) {
            super.withdraw(amount);
            if (balance < minimumBalance) {
                balance -= fee;
                System.out.println("Fee charged: " + fee);
            }
        } else {
            System.out.println("Insufficient funds.");
        }
    }

    @Override
    public void displayAccountDetails() {
        super.displayAccountDetails();
        System.out.println("Minimum Balance: " + minimumBalance);
        System.out.println("Fee: " + fee);
    }
}
