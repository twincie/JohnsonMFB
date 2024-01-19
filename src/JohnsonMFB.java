import java.math.BigDecimal;

class JohnsonMFB extends Bank {
    //constructor calling the superclass
    public JohnsonMFB(){
        super();
        setFees(5);
    }
    //implementation of the deposit method
    @Override
    public void topUp(BigDecimal amount){
        //  compareTo returns -1(less than), 0(Equal), 1(greater than) according to values
        if(amount.compareTo(BigDecimal.valueOf(50)) >= 0){
            balance = balance.add(amount.subtract(fees));
            bankAccountBalance = bankAccountBalance.add(fees);
            System.out.println("Topup Successful.\nTransaction Fee Charged.\nCurrent Balance: "+ balance);
//            chargeFees();
        } else {
            System.out.println("Invalid amount for topup!!");
        }
    }

    @Override
    public void withdraw(BigDecimal amount){
        if (amount.compareTo(BigDecimal.ZERO) > 0 && (amount.add(fees)).compareTo(balance) <= 0 ){
            balance = balance.subtract(amount.add(fees));
            bankAccountBalance = bankAccountBalance.add(fees);
            System.out.println("Withdrawal Successful.\nTransaction Fee Charged.\nCurrent Balance: "+ balance);
        } else if(amount.compareTo(balance) >= 0){
            System.out.println("Insufficient funds!!");
        } else {
            System.out.println("Invalid Withdrawal amount!!");
        }
    }
}
