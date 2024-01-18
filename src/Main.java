import java.math.BigDecimal;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Welcome to JohnsonMFB ");
        BankAccount bank = new BankAccount();

        while (true){
            System.out.println("\n Choose an option:");
            System.out.println("1. Check Balance");
            System.out.println("2. TopUp");
            System.out.println("3. Withdrawal");
            System.out.println("4. Exit");
            System.out.print("Choice: ");

            int choice = scanner.nextInt();

            if (choice == 1){
                System.out.println("Account balance: "+ bank.getBalance());
            } else if (choice == 2){
                System.out.print("Enter top-up amount: ");
                BigDecimal topUpAmount = scanner.nextBigDecimal();
                bank.topUp(topUpAmount);
            } else if (choice == 3){
                System.out.print("Enter withdrawal amount: ");
                BigDecimal withdrawalAmount = scanner.nextBigDecimal();
                bank.withdraw(withdrawalAmount);
            } else if (choice == 4){
                System.out.println("Exiting.....");
                System.exit(0);
            } else{
                System.out.println("Invalid Option. Please try again.");
            }

        }

    }
}