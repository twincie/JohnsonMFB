class BankAccount extends Bank {

    //constructor calling the superclass
    public BankAccount(double initialBalance){
        super(initialBalance);
    }
    //implementation of the deposit method
    @Override
    public void topUp(double amount){
        if(amount > 0){
            balance += amount;
            System.out.println("Topup Successful: Current Balance: "+ balance);
        } else{
            System.out.println("Invalid amount for topup!!");
        }
    }

    @Override
    public void withdraw(double amount){
        if (amount > 0 && amount <= balance ){
            balance -= amount;
            System.out.println("Withdrawal Successful: Current Balance: "+ balance);
        } else if(amount >= balance){
            System.out.println("Insuficient funds!!");
        } else {
            System.out.println("Invalid Withdrawal amount!!");
        }
    }
}
