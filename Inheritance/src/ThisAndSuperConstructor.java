public class ThisAndSuperConstructor {
    public static void main(String[] args) {
        Carr c= new Carr();
    }
}

class Vehicle{
    Vehicle(){
        System.out.println("1. From Vehicle");
    }
    Vehicle(String vehicleType){
        System.out.println("From Vehicle "+ vehicleType);
    }
}

class Carr extends Vehicle{
    Carr(){
        this("Audi");
        System.out.println("2. From carr");
    }

    Carr(String carName){
       this(10);
        System.out.println("3. From car"+ carName);
    }
    Carr(int speed){
        super("Sedan");
        System.out.println("From car speed");
    }
}