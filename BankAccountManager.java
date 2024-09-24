 class BankAccount {
    private String accountType;
    protected double balance;
    protected StringBuilder transactionHistory;

     public BankAccount(String accountType, double initialDeposit) {
        this.accountType = accountType;
        this.balance = initialDeposit;
        this.transactionHistory = new StringBuilder();
        transactionHistory.append("Initial deposit: ").append(initialDeposit).append("\n");
    }

     public void deposit(double amount) {
        balance += amount;
        transactionHistory.append("Deposited: ").append(amount).append("\n");
    }

     public void withdraw(double amount) throws Exception {
        if (balance - amount < 0) {
            throw new Exception("Insufficient balance for withdrawal!");
        }
        balance -= amount;
        transactionHistory.append("Withdrew: ").append(amount).append("\n");
    }

     public double getBalance() {
        return balance;
    }

     public String getTransactionHistory() {
        return transactionHistory.toString();
    }
}

 class SavingsAccount extends BankAccount {
    private static final double MINIMUM_BALANCE = 1000;

    public SavingsAccount(double initialDeposit) {
        super("Savings", initialDeposit);
    }

     @Override
    public void withdraw(double amount) throws Exception {
        if (balance - amount < MINIMUM_BALANCE) {
            throw new Exception("Cannot withdraw, balance cannot fall below " + MINIMUM_BALANCE + " units.");
        }
        super.withdraw(amount); // Use super to call the parent class method
    }
}
 class CurrentAccount extends BankAccount {
    public CurrentAccount(double initialDeposit) {
        super("Current", initialDeposit);
    }
    @Override
    public void withdraw(double amount) throws Exception {
        if (balance - amount < 0) {
            throw new Exception("Cannot withdraw, insufficient balance.");
        }
        super.withdraw(amount);
    }
}

 public class BankAccountManager {
    public static void main(String[] args) {
        try {
             SavingsAccount savings = new SavingsAccount(5000);
            System.out.println("Account Type: Savings");
            System.out.println("Initial Deposit: " + savings.getBalance());

             savings.withdraw(2000);
            System.out.println("Transaction Successful. New Balance: " + savings.getBalance());

             System.out.println("Transaction History: \n" + savings.getTransactionHistory());

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
