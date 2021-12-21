public class CalculatorTest {
    public static void main(String[] args) {
        BasicCalculator basic=new BasicCalculator();
        AdvancedCalculator advance= new AdvancedCalculator();

        basic.sum(10,20);
        advance.sum(20, 40);
    }
}
