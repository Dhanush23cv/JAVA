
import bank.*;

import java.util.Scanner;

public class BankApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        account account = null;

        while (true) {
            System.out.println("\nBank Application Menu:");
            System.out.println("1. Create Savings Account");
            System.out.println("2. Create Checking Account");
            System.out.println("3. Deposit Money");
            System.out.println("4. Withdraw Money");
            System.out.println("5. Check Balance");
            System.out.println("6. Display Account Details");
            System.out.println("7. Calculate Interest (Savings Account)");
            System.out.println("8. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    account = createSavingsAccount(scanner);
                    break;
                case 2:
                    account = createCheckingAccount(scanner);
                    break;
                case 3:
                    if (account != null) {
                        System.out.print("Enter amount to deposit: ");
                        double depositAmount = scanner.nextDouble();
                        account.deposit(depositAmount);
                    } else {
                        System.out.println("No account found. Create an account first.");
                    }
                    break;
                case 4:
                    if (account != null) {
                        System.out.print("Enter amount to withdraw: ");
                        double withdrawAmount = scanner.nextDouble();
                        account.withdraw(withdrawAmount);
                    } else {
                        System.out.println("No account found. Create an account first.");
                    }
                    break;
                case 5:
                    if (account != null) {
                        System.out.println("Current Balance: " + account.getBalance());
                    } else {
                        System.out.println("No account found. Create an account first.");
                    }
                    break;
                case 6:
                    if (account != null) {
                        account.displayAccountDetails();
                    } else {
                        System.out.println("No account found. Create an account first.");
                    }
                    break;
                case 7:
                    if (account instanceof SavingsAccount) {
                        ((SavingsAccount) account).calculateInterest();
                    } else {
                        System.out.println("No savings account found.");
                    }
                    break;
                case 8:
                    System.out.println("Exiting the application.");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }
        }
    }

    private static SavingsAccount createSavingsAccount(Scanner scanner) {
        System.out.print("Enter account number: ");
        String accountNumber = scanner.next();
        System.out.print("Enter customer name: ");
        String customerName = scanner.next();
        System.out.print("Enter initial balance: ");
        double balance = scanner.nextDouble();
        System.out.print("Enter interest rate: ");
        double interestRate = scanner.nextDouble();
        System.out.print("Enter minimum balance: ");
        double minimumBalance = scanner.nextDouble();
        return new SavingsAccount(accountNumber, customerName, balance, interestRate, minimumBalance);
    }

    private static CheckingAccount createCheckingAccount(Scanner scanner) {
        System.out.print("Enter account number: ");
        String accountNumber = scanner.next();
        System.out.print("Enter customer name: ");
        String customerName = scanner.next();
        System.out.print("Enter initial balance: ");
        double balance = scanner.nextDouble();
        System.out.print("Enter minimum balance: ");
        double minimumBalance = scanner.nextDouble();
        System.out.print("Enter fee: ");
        double fee = scanner.nextDouble();
        return new CheckingAccount(accountNumber, customerName, balance, minimumBalance, fee);
    }
}
