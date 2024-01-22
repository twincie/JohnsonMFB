import java.math.BigDecimal;

class JohnsonMFB extends Bank {
    //constructor calling the superclass
    public JohnsonMFB(){
        super();
        setFees(5);
    }
    //implementation of the deposit method with charges on the transaction
    @Override
    public void topUp(BigDecimal amount){
        //  compareTo returns -1(less than), 0(Equal), 1(greater than) according to values
        if(amount.compareTo(BigDecimal.valueOf(50)) >= 0){
            balance = balance.add(amount.subtract(fees));
            bankAccountBalance = bankAccountBalance.add(fees);
            System.out.println("Topup Successful.");
            if(fees.compareTo(BigDecimal.ZERO)>0){
                System.out.println("Transaction Fee of "+fees+" currency Charged");
            } else{
                System.out.println("Free Transaction");
            }
            System.out.println("Current Balance: " +balance);
        } else {
            System.out.println("Invalid amount for topup!!");
        }
    }
    // implementation of the withdrawal method with charges on the transaction.
    @Override
    public void withdraw(BigDecimal amount){
        if (amount.compareTo(BigDecimal.ZERO) > 0 && (amount.add(fees)).compareTo(balance) <= 0 ){
            balance = balance.subtract(amount.add(fees));
            bankAccountBalance = bankAccountBalance.add(fees);
            System.out.println("Withdrawal Successful");
            if(fees.compareTo(BigDecimal.ZERO)>0){
                System.out.println("Transaction Fee of "+fees+" currency Charged");
            } else{
                System.out.println("Free Transaction");
            }
            System.out.println("Current Balance: " +balance);
        } else if(amount.compareTo(balance) >= 0){
            System.out.println("Insufficient funds!!");
        } else {
            System.out.println("Invalid Withdrawal amount!!");
        }
    }
}
