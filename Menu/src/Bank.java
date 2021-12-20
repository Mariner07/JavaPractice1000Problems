public class Bank {

    String branchAddress;
    String accNumber;
    String accName;
    String typeOfAccount;
    double balance;

    public void withdraw(int amount){
        balance=balance-amount;
    }

    public void checkBalance(){
        System.out.println(balance);
    }
}
