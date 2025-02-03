import java.util.Scanner;

public class SimpleBankingApplication1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double balance = 0.0;
        boolean running = true;

        System.out.println("Welcome to the Simple Banking Application!");

        while (running) {
            System.out.println("\nPlease choose an option:");
            System.out.println("1. Check Balance");
            System.out.println("2. Deposit Money");
            System.out.println("3. Withdraw Money");
            System.out.println("4. Exit");
            System.out.print("Your choice: ");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    // Check balance
                    System.out.printf("Your current balance is: $%.2f%n", balance);
                    break;
                case 2:
                    // Deposit money
                    System.out.print("Enter the amount to deposit: ");
                    double depositAmount = scanner.nextDouble();
                    if (depositAmount > 0) {
                        balance += depositAmount;
                        System.out.printf("$%.2f deposited successfully!%n", depositAmount);
                    } else {
                        System.out.println("Invalid deposit amount. Please try again.");
                    }
                    break;
                case 3:
                    // Withdraw money
                    System.out.print("Enter the amount to withdraw: ");
                    double withdrawAmount = scanner.nextDouble();
                    if (withdrawAmount > 0 && withdrawAmount <= balance) {
                        balance -= withdrawAmount;
                        System.out.printf("$%.2f withdrawn successfully!%n", withdrawAmount);
                    } else if (withdrawAmount > balance) {
                        System.out.println("Insufficient balance. Please try again.");
                    } else {
                        System.out.println("Invalid withdrawal amount. Please try again.");
                    }
                    break;
                case 4:
                    // Exit
                    System.out.println("Thank you for using the Simple Banking Application. Goodbye!");
                    running = false;
                    break;
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }

        scanner.close();
    }
}
