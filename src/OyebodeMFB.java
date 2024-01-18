import java.math.BigDecimal;

class OyebodeMFB extends Bank {
    //constructor calling the superclass
    public OyebodeMFB(){
        super();
    }
    //implementation of the deposit method
    @Override
    public void topUp(BigDecimal amount){
        //  compareTo returns -1(less than), 0(Equal), 1(greater than) according to values
        if(amount.compareTo(BigDecimal.ZERO) > 0){
            balance = balance.add(amount);
            System.out.println("Topup Successful: Current Balance: "+ balance);
        } else{
            System.out.println("Invalid amount for topup!!");
        }
    }

    @Override
    public void withdraw(BigDecimal amount){
        if (amount.compareTo(BigDecimal.ZERO) > 0 && amount.compareTo(balance) <= 0 ){
            balance = balance.subtract(amount);
            System.out.println("Withdrawal Successful: Current Balance: "+ balance);
        } else if(amount.compareTo(balance) >= 0){
            System.out.println("Insufficient funds!!");
        } else {
            System.out.println("Invalid Withdrawal amount!!");
        }
    }
}
