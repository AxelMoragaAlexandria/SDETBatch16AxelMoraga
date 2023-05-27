package Class23;

public class BankAccount {

 private String firstName;
    private String userName;
   private String password;

   private double accountBalance=120;

     BankAccount(String userName,String password){
        this.userName=userName;
        this.password=password;
    }

    String getFirstName(){
        return firstName;
    }

    public double getAccountBalance(String password){
         if(password.equals(this.password)){
             return accountBalance;
         }else{
             System.out.println("Wrong Password");
             return 0;
         }
    }

    public void setAccountBalance(double balance){
         accountBalance=balance;
    }

        void setPassword(String password){
         this.password=password;
        }
}

class BankTester{
    public static void main(String[] args) {
        BankAccount bankAcount=new BankAccount("AxelMoraga","123$%");
        System.out.println(bankAcount.getAccountBalance("123$%"));
        bankAcount.setAccountBalance(100000);
        System.out.println(bankAcount.getAccountBalance("123$%"));


    }
}
