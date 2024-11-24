import java.util.Scanner;

class BankAccount {
    private String accName;
    protected Double balance;
    protected StringBuilder tr_History;

    public BankAccount(String accName, double initialDeposit) {
        this.accName = accName;
        this.balance = initialDeposit;
        this.tr_History = new StringBuilder();
        tr_History.append("Account Created With Initial Balance Of ").append(initialDeposit).append("\n");
    }

    public void deposit(double amt) {
        if (amt <= 0) {
            System.err.println("Amount Should be Positive..... ");
            return;
        }
        balance += amt;
        tr_History.append("Deposited: ").append(amt).append(" Current Balance: ").append(balance).append("\n");
        System.out.println("Deposit Successful. Balance: " + balance);
    }

    public void withdraw(double amt) throws Exception {
        if (amt <= 0) {
            throw new Exception("Amount Should be Positive..... ");
        }
        if (balance < amt) {
            throw new Exception("Insufficient Balance To Make a Payment!");
        }
        balance -= amt;
        tr_History.append("Withdrawn: ").append(amt).append(" Current Balance: ").append(balance).append("\n");
        System.out.println("Withdrawal Successful. Balance: " + balance);
    }

    public void viewTransactionHistory() {
        System.out.println("---------Transaction History---------");
        System.out.println(tr_History);
    }

    public double getBalance() {
        return balance;
    }
}

class SavingsAccount extends BankAccount {
    private static final double MINIMUM_BALANCE = 2000;

    public SavingsAccount(String accName, double initialDeposit) {
        super(accName, initialDeposit);
        if (initialDeposit < MINIMUM_BALANCE) {
            throw new IllegalArgumentException("Initial Deposit must be at least " + MINIMUM_BALANCE);
        }
    }

    @Override
    public void withdraw(double amt) throws Exception {
        if (balance - amt < MINIMUM_BALANCE) {
            throw new Exception("Withdrawal Denied. Balance cannot drop below " + MINIMUM_BALANCE);
        }
        super.withdraw(amt);
    }
}

class CurrentAccount extends BankAccount {
    public CurrentAccount(String accName, double initialDeposit) {
        super(accName, initialDeposit);
    }

    @Override
    public void withdraw(double amt) throws Exception {
        if (balance - amt < 0) {
            throw new Exception("Withdrawal Denied. INSUFFICIENT BALANCE.");
        }
        super.withdraw(amt);
    }
}

public class Main5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BankAccount account = null;

        System.out.println("------Bank Account Manager--------");
        System.out.println("Enter Account Type (Savings/Current):");
        String accType = sc.nextLine();

        System.out.println("Enter Account Holder Name:");
        String name = sc.nextLine();

        System.out.println("Enter Initial Deposit:");
        double initialDeposit = sc.nextDouble();

        try {
            if (accType.equalsIgnoreCase("Savings")) {
                account = new SavingsAccount(name, initialDeposit);
            } else if (accType.equalsIgnoreCase("Current")) {
                account = new CurrentAccount(name, initialDeposit);
            } else {
                System.out.println("Invalid Account Type!!");
                return;
            }
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
            return;
        }

        while (true) {
            System.out.println("\n--- Menu ---");
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. View Transaction History");
            System.out.println("4. Exit");
            System.out.print("Choose an action: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter amount to deposit: ");
                    double depositAmount = sc.nextDouble();
                    account.deposit(depositAmount);
                    break;
                case 2:
                    System.out.print("Enter amount to withdraw: ");
                    double withdrawAmount = sc.nextDouble();
                    try {
                        account.withdraw(withdrawAmount);
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 3:
                    account.viewTransactionHistory();
                    break;
                case 4:
                    System.out.println("Thank you for using Bank Account Manager!");
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
