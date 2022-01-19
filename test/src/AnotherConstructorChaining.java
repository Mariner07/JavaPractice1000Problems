class Parent {
    Parent() {
        System.out.println("1");
    }

    Parent(int x) {
        this("Ali", "Khan");
        System.out.println("2");
    }

    Parent(String name, String lastName){
        this();
        System.out.println("3");
    }
}


class Child extends Parent {
    Child() {
        super(1);
        //by default the default constructor of Parent class is invoked
        System.out.println("4");
    }

    Child(int x) {
        super("Ali", "Khan"); // default constructor of Parent class is invoked
        System.out.println("5");
    }
    Child(String name, String lastName){

        System.out.println("6");
    }
}
public class AnotherConstructorChaining {
    public static void main(String arg[]) {
//        Child obj1 = new Child();
        Child obj2 = new Child(10);
    }
}


