abstract public class Bank {
    //attributes
    protected double balance;
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
    public abstract void topUp(double amount);

    // withdrawing money from account
    public abstract void withdraw(double amount);
}
