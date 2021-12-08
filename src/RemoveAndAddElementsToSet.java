import java.util.*;

public class RemoveAndAddElementsToSet {
    public static void main(String[] args) {
        ArrayList<String> listOfCities= new ArrayList<>(Arrays.asList("Chicago", "LA", "NY", "Boston", "Dallas"));
        System.out.println("Cities in list:" + listOfCities);

        // LinkedHashSet implenmentation of the Set interface
        // stores the elements in inseertion order

        Set<String> linkedSetOfCities= new LinkedHashSet<>(listOfCities);
        System.out.println("Cities in hashSet"+ listOfCities);

        Set<String> hasSetOfCities= new HashSet<>(listOfCities);
        System.out.println("Cities in hashSet"+ hasSetOfCities);

        Set<String> treeSetOfCities= new TreeSet<>(listOfCities);
        System.out.println("Cities in hashSet"+ treeSetOfCities);

        List<Integer> numbers=List.of(10,99, 67, 44, 55, 78, 78, 44);
        System.out.println("Given numbers unordered"+ numbers);
        Set<Integer> setNumbers =new TreeSet<>(numbers);
        System.out.println("Number in Tree Set"+ setNumbers);

    }

}
