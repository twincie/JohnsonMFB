import java.math.BigDecimal;

abstract public class Bank {
    //attributes
    protected BigDecimal balance;
    protected BigDecimal bankAccountBalance;

    protected BigDecimal fees;

    // constructor
    public Bank(){
        this.bankAccountBalance = BigDecimal.ZERO;
        this.balance = BigDecimal.ZERO;
        this.fees = BigDecimal.ZERO;
    }

    //methods
    // check account balance
    public BigDecimal getBalance(){
        return balance;
    }

    public BigDecimal getBankAccountBalance(){
        return bankAccountBalance;
    }

    public void setFees(int fees){
        this.fees = BigDecimal.valueOf(fees);
    }
    public BigDecimal GetBankFees() { return fees; }

    // adding money to account
    public abstract void topUp(BigDecimal amount);

    // withdrawing money from account
    public abstract void withdraw(BigDecimal amount);
}
