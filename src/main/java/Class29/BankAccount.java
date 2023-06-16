package Class29;

public class BankAccount {

    double balance;

    public BankAccount(double balance){
        this.balance=balance;
    }

   public void withDraw(double amountToWithdraw){
        if(amountToWithdraw>balance){
           throw new InsufficientBalance("Not possible insufficient balance");
        }

        balance=balance-amountToWithdraw;
    }

}
