import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter initial balance for Bank account: ");
        double initialBalance = scanner.nextDouble();
        Bank bank = new Bank(initialBalance);

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
                double topUpAmount = scanner.nextDouble();
                bank.topUp(topUpAmount);
            } else if (choice == 3){
                System.out.print("Enter withdrawal amount: ");
                double withdrawalAmount = scanner.nextDouble();
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