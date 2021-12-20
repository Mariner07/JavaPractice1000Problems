class Bank{
    //instance variable belongs to the object
    //every object will have its copy of instance variable
    int balance;
    String accName;

    //static variable belongs to the class
    //ther is only one copy of static variable
    static int numOfAcc;

    public void displayBalance(){
        System.out.println(balance);
    }

    public void displayCusInfo(){
        System.out.println(balance);
        System.out.println(numOfAcc);
    }

}

public class StaticKeyword {
    public static void main(String[] args) {
        Bank b1= new Bank();
        Bank b2 = new Bank();

        b1.balance=20;
        b2.balance=50;

        //static varibale is instantiated only once
        b1.numOfAcc=1;
        b2.numOfAcc=2;

        b1.displayCusInfo();

    }
}
