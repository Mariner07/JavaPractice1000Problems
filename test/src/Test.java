import java.util.ArrayList;
import java.util.List;

public class Test {
    int divisorSum(int n){
        List<Integer> result = new ArrayList<>();
        for(int i=1; i<=n/2; i++){
            if(n%i==0){
                result.add(i);
            }
        }
    int sum=0;
        for (int num: result
             ) {
            sum+=num;
        }
        return sum;
    }

    public static void main(String[] args) {
        Test t= new Test();
        System.out.println(t.divisorSum(10));
    }
}
