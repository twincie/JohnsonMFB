import java.math.BigDecimal;

abstract public class Bank {
    //attributes
    protected BigDecimal balance;
    protected BigDecimal bankAccountBalance;

    // constructor
    public Bank(){
        this.bankAccountBalance = BigDecimal.ZERO;
        this.balance = BigDecimal.ZERO;
    }

    //methods
    // check account balance
    public BigDecimal getBalance(){
        return balance;
    }

    public BigDecimal getBankAccountBalance(){
        return bankAccountBalance;
    }

    // adding money to account
    public abstract void topUp(BigDecimal amount);

    // withdrawing money from account
    public abstract void withdraw(BigDecimal amount);
}
