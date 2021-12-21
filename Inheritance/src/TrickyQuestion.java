class Car{
    static int count;
    int c;

    Car(){
        count++;
        c=count;
    }
    public void displayC(){
        System.out.println(c);
    }
}

public class TrickyQuestion {
    public static void main(String[] args) {
        Car c1= new Car();

        Car c3= new Car();
        Car c2= new Car();
//        Car c4= new Car();

        c1.displayC();
        c2.displayC();
        c3.displayC();
//        int i=1;
//        int result=0;
//
//        result=i++ +7;
//        //System.out.println(i);
//        System.out.println(result);


    }
}

