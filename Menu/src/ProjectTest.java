public class ProjectTest {

    public static void main(String[] args) {
        Project pr1=new Project();
        Project pr2 = new Project();

        pr1.date="12-20-2021";
        pr1.phoneNum=953892;
        pr1.numOfPeople=4;

        pr2=pr1;

        System.out.println(pr2.phoneNum);

        pr1.printInfo();
        pr2.phoneNum=123456;

        System.out.println(pr2.phoneNum);
        System.out.println(pr1.phoneNum);
        pr1.phoneNum=000001;
        System.out.println(pr2.phoneNum);
        System.out.println(pr1.phoneNum);

    }


}
