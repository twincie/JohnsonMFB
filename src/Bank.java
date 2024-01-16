public class Bank {
    //attributes
    private double balance;
    // constructor
    public Bank(){
        this.balance = 0;
    }
    public Bank(double initialBalance){
        this.balance = initialBalance;
    }

    //methods
    // check account balance
    public double getBalance(){
        return balance;
    }
    // adding money to account
    public void topUp(double amount){
        if(amount > 0){
            balance += amount;
            System.out.println("Topup Successful: Current Balance: "+ balance);
        } else{
            System.out.println("Invalid amount for topup!!");
        }
    }
    // withdrawing money from account
    public void withdraw(double amount){
        if (amount > 0 && amount <= balance ){
            balance -= amount;
            System.out.println("Withdrawal Successful: Current Balance: "+ balance);
        } else if(amount == 0 || amount >= balance){
            System.out.println("Insuficient funds!!");
        } else {
            System.out.println("Invalid Withdrawal amount!!");
        }
    }
}
