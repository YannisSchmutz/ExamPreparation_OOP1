package interfaces2;

public class BankAccountMeasurer implements Measurer {

    @Override
    public double measure(Object obj){
        BankAccount bankAcc = (BankAccount) obj;
        return bankAcc.getBalance();
    }

}
