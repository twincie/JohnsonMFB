import java.math.BigDecimal;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        landingMenu();
        int option = scanner.nextInt();
        mainSwitch(option);
    }

    // this is the prompt page that comes when user first runs application
    static void landingMenu(){
        System.out.println("\n-------HOME PROMPT-------");
        System.out.println("Welcome to the Global Bank");
        System.out.println("-------------------------");
        System.out.println("\n Choose an option:");
        System.out.println("1. Johnson MicroFinance Bank");
        System.out.println("2. Oyebode Microfinance Bank");
        System.out.println("3. Exit");
        System.out.print("Choice: ");
    }
    //
    static void bankingMenu(){
        System.out.println("\n Choose an option:");
        System.out.println("1. Check Bank Account Balance");
        System.out.println("2. Check Balance");
        System.out.println("3. TopUp");
        System.out.println("4. Withdrawal");
        System.out.println("5. Exit");
        System.out.println("6. Back");
        System.out.print("Choice: ");
    }
    // Banking options for JohnsonMFB
    static void johnsonMFB(){
        Scanner scanner = new Scanner(System.in);
        JohnsonMFB bank = new JohnsonMFB();
        System.out.println("\n-Welcome to JohnsonMFB-");
        System.out.println("**Note** bank transaction charges is " +bank.GetBankFees());

        while (true){
            bankingMenu();
            int choice = scanner.nextInt();
            if (choice == 1){
                System.out.println("Bank Account balance: "+ bank.getBankAccountBalance());
            } else if (choice == 2){
                System.out.println("Your Account balance: "+ bank.getBalance());
            } else if (choice == 3){
                System.out.println("Top-up amount should be from 50 and above.");
                System.out.print("Enter top-up amount: ");
                BigDecimal topUpAmount = scanner.nextBigDecimal();
                bank.topUp(topUpAmount);
            } else if (choice == 4){
                System.out.print("Enter withdrawal amount: ");
                BigDecimal withdrawalAmount = scanner.nextBigDecimal();
                bank.withdraw(withdrawalAmount);
            } else if (choice == 5){
                System.out.println("Exiting.....");
                System.exit(0);
            } else if (choice == 6){
                landingMenu();
                int option = scanner.nextInt();
                mainSwitch(option);
            } else{
                System.out.println("Invalid Option. Please try again.");
            }
        }
    }
    //Banking options for OyebodeMFB
    static void oyebodeMFB(){
        Scanner scanner = new Scanner(System.in);
        OyebodeMFB bank1 = new OyebodeMFB();
        System.out.println("\n-Welcome to OyebodeMFB-");
        System.out.println("**Note** bank transaction charges is " +bank1.GetBankFees());

        while (true){
            bankingMenu();
            int choice = scanner.nextInt();
            if (choice == 1){
                System.out.println("Bank Account balance: "+ bank1.getBankAccountBalance());
            } else if (choice == 2){
                System.out.println("Your Account balance: "+ bank1.getBalance());
            } else if (choice == 3){
                System.out.print("Enter top-up amount: ");
                BigDecimal topUpAmount = scanner.nextBigDecimal();
                bank1.topUp(topUpAmount);
            } else if (choice == 4){
                System.out.print("Enter withdrawal amount: ");
                BigDecimal withdrawalAmount = scanner.nextBigDecimal();
                bank1.withdraw(withdrawalAmount);
            } else if (choice == 5){
                System.out.println("Exiting.....");
                System.exit(0);
            } else if (choice == 6){
                landingMenu();
                int option = scanner.nextInt();
                mainSwitch(option);
            } else {
                System.out.println("Invalid Option. Please try again.");
            }
        }
    }
    // main Switch statement that helps prompt move from choosing bank type to the bank options.
    static void mainSwitch(int option){
        switch (option){
            case 1:
                johnsonMFB();
                break;
            case 2:
                oyebodeMFB();
                break;
            case 3:
                System.out.println("Exiting.....");
                System.exit(0);
            default:
                System.out.println("Invalid Option. Please try again.");
        }
    }
}