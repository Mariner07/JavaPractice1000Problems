public class Testet {
    public static void main(String[] args) {
        Bank tom= new Bank();
        Bank jerry = new Bank();

        tom.balance=1000;
        tom.accName="Tom";
        tom.typeOfAccount= "Savings";

        tom.checkBalance();
        jerry=tom;

        jerry.checkBalance();

        jerry.balance=5000;
        tom.checkBalance();

        jerry.checkBalance();






    }
}
