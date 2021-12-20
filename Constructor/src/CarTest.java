class Car {

    Car(){
        System.out.println("3");
    }

    Car(String name){
        System.out.println(name);
    }


    Car(int name){
        System.out.println(name);
    }
}

public class CarTest{
    public static void main(String[] args) {
        Car c=new Car(2);
        //System.out.println(c);
    }
}
