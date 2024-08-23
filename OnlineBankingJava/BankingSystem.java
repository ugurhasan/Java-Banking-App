import java.util.Scanner;

public class BankingSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Create a new bank account
        // We have to insert 3 information to create Bank account
        System.out.print("Enter account holder's name: "); // Name of card owner
        String name = scanner.nextLine();                   
        System.out.print("Enter account number: ");        // Account number 
        String accountNumber = scanner.nextLine();         // 
        System.out.print("Enter initial balance: ");       // Initial Balance of your account
        double initialBalance = scanner.nextDouble();

        BankAccount account = new BankAccount(name, accountNumber, initialBalance);

        // Menu for banking operations
        while (true) {
            System.out.println("\nBanking System Menu:");
            System.out.println("1. View Balance"); // Click 1 to view balance.
            System.out.println("2. Deposit Money"); // Click 2 to deposit money from your account.
            System.out.println("3. Withdraw Money"); // Click 3 to withdraw money from your account.
            System.out.println("4. View your account name");
            System.out.println("5. View your account number");
            System.out.println("6. Exit"); // Click 4 if you want to exit..
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Current balance: " + account.getBalance());
                    break;
                case 2:
                    System.out.print("Enter amount to deposit: ");
                    double depositAmount = scanner.nextDouble();
                    account.deposit(depositAmount);
                    break;
                case 3:
                    System.out.print("Enter amount to withdraw: ");
                    double withdrawAmount = scanner.nextDouble();
                    account.withdraw(withdrawAmount);
                    break;
                case 4:
                    System.out.println("Your account name is "+ name);  
                    break;
                case 5:   
                    System.out.println("here is your account number: "+accountNumber);
                    break;      
                case 6:
                    System.out.println("Exiting...");
                    scanner.close();
                    System.exit(0);
                    break;    
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}

// This is simple Java program by Ughur Hasan.