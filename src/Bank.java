import java.math.BigDecimal;

abstract public class Bank {
    //attributes
    protected BigDecimal balance;
    // constructor
    public Bank(){
        this.balance = BigDecimal.ZERO;
    }

    //methods
    // check account balance
    public BigDecimal getBalance(){
        return balance;
    }

    // adding money to account
    public abstract void topUp(BigDecimal amount);

    // withdrawing money from account
    public abstract void withdraw(BigDecimal amount);
}
