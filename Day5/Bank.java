/*Create a BankAccount class with private fields for account holder's name, account number, and balance. Implement methods
to deposit and withdraw money with proper validation (e.g., no overdraft, positive amounts only). Provide getters and setters
for the account holder's name and account number, but encapsulate the balance to be modified only through deposit and withdraw methods.
Include a method to display account details.*/

class BankAccount {
    // Private fields
    private String accountHolderName;
    private String accountNumber;
    private double balance;

    // Constructor
    public BankAccount(String accountHolderName, String accountNumber, double initialBalance) {
        this.accountHolderName = accountHolderName;
        this.accountNumber = accountNumber;
        if (initialBalance >= 0) {
            this.balance = initialBalance;
        } else {
            this.balance = 0;
            System.out.println("Initial balance cannot be negative. Setting balance to 0.");
        }
    }

    // Getters and Setters for name and account number
    public String getAccountHolderName() {
        return accountHolderName;
    }

    public void setAccountHolderName(String accountHolderName) {
        this.accountHolderName = accountHolderName;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    // Deposit method
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount);
        } else {
            System.out.println("Deposit amount must be positive.");
        }
    }

    // Withdraw method
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        } else if (amount > balance) {
            System.out.println("Insufficient balance. Withdrawal denied.");
        } else {
            System.out.println("Withdrawal amount must be positive.");
        }
    }

    // Display account details
    public void displayAccountDetails() {
        System.out.println("Account Holder: " + accountHolderName);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: " + balance);
    }
}

// Demo class
public class BankDemo {
    public static void main(String[] args) {
        BankAccount account = new BankAccount("Bhanu", "123456789", 5000);

        account.displayAccountDetails();
        account.deposit(1500);
        account.withdraw(2000);
        account.withdraw(6000); // overdraft attempt
        account.displayAccountDetails();
    }
}
