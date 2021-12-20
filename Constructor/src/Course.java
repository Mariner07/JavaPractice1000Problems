class CourseT{
    static String name;
    int year;

    public void displayCusInfo(){
        System.out.println(name);
        System.out.println(year);
    }
}
public class Course {
    public static void main(String[] args) {
        CourseT director1= new CourseT();
        CourseT director2= new CourseT();
        CourseT director3= new CourseT();
        CourseT director4= new CourseT();

        director1.name="Torobek";
        director1.year= 2000;

        director2.name="Burul";
        director2.year=2005;

        director3.name="Nurzhan";
        director3.year=2019;

        director4.name="Meerim";
        director4.year=2021;

        director1.displayCusInfo();
        director2.displayCusInfo();
        director3.displayCusInfo();
        director4.displayCusInfo();


    }
}
