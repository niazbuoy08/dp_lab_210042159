import java.util.Scanner;

public class Main {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        CommandInvoker invoker = new CommandInvoker();
        BankAccount account = null;

        while (true) {
            showMenu();
            int choice = getUserInput();

            switch (choice) {
                case 1:
                    account = createAccount();
                    invoker.executeCommand(new CreateAccountCommand(account));
                    break;
                case 2:
                    if (account != null) {
                        depositMoney(account, invoker);
                    } else {
                        System.out.println("No account created. Please create an account first.");
                    }
                    break;
                case 3:
                    if (account != null) {
                        withdrawMoney(account, invoker);
                    } else {
                        System.out.println("No account created. Please create an account first.");
                    }
                    break;
                case 4:
                    showBalance(account);
                    break;
                case 5:
                    showTransactionHistory(account);
                    break;
                case 6:
                    System.out.println("Exiting...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    private static void showMenu() {
        System.out.println("\nChoose an option:");
        System.out.println("1. Create Account");
        System.out.println("2. Deposit");
        System.out.println("3. Withdraw");
        System.out.println("4. Show Balance");
        System.out.println("5. Show Transaction History");
        System.out.println("6. Exit");
    }

    private static int getUserInput() {
        while (true) {
            try {
                return scanner.nextInt();
            } catch (Exception e) {
                System.out.println("Invalid input. Please enter a valid number.");
                scanner.next();
            }
        }
    }

    private static BankAccount createAccount() {
        System.out.print("Enter account ID: ");
        String accountId = scanner.next();
        System.out.print("Enter initial deposit: ");
        double initialDeposit = scanner.nextDouble();
        return new BankAccount(accountId, initialDeposit);
    }

    private static void depositMoney(BankAccount account, CommandInvoker invoker) {
        System.out.print("Enter deposit amount: ");
        double depositAmount = scanner.nextDouble();
        invoker.executeCommand(new DepositCommand(account, depositAmount));
    }

    private static void withdrawMoney(BankAccount account, CommandInvoker invoker) {
        System.out.print("Enter withdrawal amount: ");
        double withdrawalAmount = scanner.nextDouble();
        invoker.executeCommand(new WithdrawCommand(account, withdrawalAmount));
    }

    private static void showBalance(BankAccount account) {
        if (account != null) {
            System.out.println("Balance: " + account.getBalance());
        } else {
            System.out.println("No account created.");
        }
    }

    private static void showTransactionHistory(BankAccount account) {
        if (account != null) {
            System.out.println("Transaction History:");
            account.getTransactionHistory().forEach(System.out::println);
        } else {
            System.out.println("No account created.");
        }
    }
}

