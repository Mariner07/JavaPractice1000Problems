package maps;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapIntro1 {

    /*
    Map is an object that maps keys to values;
    is a collection of attribute-value pairs.
    it is not considered to be true collection, because it has its own implementation
    HashMap and LinkedHashMap allow null values and keys
    TreeMap does not allow null values and keys?
    HashMap is not ordered,
    LinkedHashMap follows insertion order
    TreeMap is sorted by the keys
    */

    public static void main(String[] args) {
        String ssnElena= "011-10-1011";
        String nameElena="Elena Sova";

        ArrayList<String> infoElena = new ArrayList<>();
        infoElena.add(ssnElena);
        infoElena.add(nameElena);

        int indexOfSSN= infoElena.indexOf("011-10-1011");
        System.out.println("Here is the name associated with this SSN:"+ infoElena.get(indexOfSSN+1));


        Map<String, String> map = new HashMap<>();
        Map<String, List<String>> students1 = new HashMap<>();
        Map<List<Integer>, List<String>> students2 = new HashMap<>();

        //.put() method is used to insert key-value pair into a map collection
        //similar to .add() method from Collections
        map.put("012-12-1221", "Karishma Chintala");

        //get(Object key) method returns the value for the key
        String name= map.get("012-12-1221");
        System.out.println(name);
        Map<String,String> map1= new HashMap<>();
    }


}
