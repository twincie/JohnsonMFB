import java.math.BigDecimal;

class OyebodeMFB extends JohnsonMFB {
    //constructor calling the superclass
    public OyebodeMFB(){
        super();
        setFees(0);
    }
    //implementation of the deposit method
    @Override
    public void topUp(BigDecimal amount){
        super.topUp(amount);
    }

    @Override
    public void withdraw(BigDecimal amount){
        super.withdraw(amount);
    }
}
