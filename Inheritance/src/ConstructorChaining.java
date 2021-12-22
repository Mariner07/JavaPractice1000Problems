public class ConstructorChaining {
    public static void main(String[] args) {
        HSBCBank hsbc = new HSBCBank();
        hsbc.printData();
    }
}

class Bank{
    int data;
    public void printData(){
        System.out.println(data);
    }
    Bank(){
        System.out.println("From Bank class");
    }
}

class HSBCBank extends Bank{
    HSBCBank(){
        System.out.println("From HSBC Bank class");
    }
}




