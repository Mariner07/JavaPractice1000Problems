package maps;

import java.util.HashMap;
import java.util.Map;

public class CitiesAndZipCodes {
    public static void main(String[] args) {
        Map<Integer, String> citiesAndZipCodes= new HashMap<>();

        citiesAndZipCodes.put(60490, "Bolingbrook");
        citiesAndZipCodes.put(75004, "Paris");
        citiesAndZipCodes.put(69002, "Austin");
        citiesAndZipCodes.put(95400, "Washington");
        citiesAndZipCodes.put(72009, "Paris");

        System.out.println(citiesAndZipCodes);
        // only unique keys allowed. second one will overwrite the value of the 1st

        String cityName=citiesAndZipCodes.get(75004);
        System.out.println(cityName);

    }
}
