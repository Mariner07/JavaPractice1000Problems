package maps;

import java.util.HashMap;
import java.util.Map;

public class IslesInStore {
    public static void main(String[] args) {
        Map<Byte, String> isleMap= new HashMap<>();

        isleMap.put((byte)1, "Pharmacy");
        isleMap.put((byte)2, "Pharmacy");
        isleMap.put((byte)3, "Fruits");
        isleMap.put((byte)4, "Veggies");
        isleMap.put((byte)5, "Home goods");
        isleMap.put((byte)6, "electronics");
        isleMap.put((byte)7, "Bakery");
        isleMap.put((byte)8, "Kids Depo");
        System.out.println(isleMap);

        for( int i=1; i<=isleMap.size(); i++) {
            System.out.println("This depo is " + isleMap.get((byte)i));
        }
    }

}
