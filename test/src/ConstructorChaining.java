class Student {
    private String name;
    private int age;

    public Student() {
        this("Shreya"); //calling one-argument constructor of same class
        System.out.println("1");
    }

    public Student(String name) {
        this.name = name;
        System.out.println("2");
    }

    public Student(String name, int age) {
        this();
        this.name = name;
        this.age = age;
        System.out.println("3");
    }
}

class MedicalStudent extends Student {
    public MedicalStudent() {
        System.out.println("4");
    }

    public MedicalStudent(String name) {
        super(name); //calling one argument constructor of the base class
        System.out.println("5");
    }

    public MedicalStudent(String name, int age) {
        super(name, age);
        System.out.println("6");
    }
}
public class ConstructorChaining {
    public static void main(String args[]) {
////         Testing constructor chaining in Java
//        MedicalStudent sub0=new MedicalStudent();
//        //calling default constructor
//        MedicalStudent sub = new MedicalStudent("Priya");
        //caliing one-argument constructor
        MedicalStudent sub1 = new MedicalStudent("Deepak", 23);
//        //caliing two-argument constructor
    }
}

