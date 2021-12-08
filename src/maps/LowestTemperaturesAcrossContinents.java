package maps;

import java.util.HashMap;
import java.util.Map;

public class LowestTemperaturesAcrossContinents {
    public static void main(String[] args) {
        Map<String, Float> temperatureMap = new HashMap<>();

        temperatureMap.put("North America", -81.4F);
        temperatureMap.put("South America", -27F);
        temperatureMap.put("Australia", -128F);
        temperatureMap.put("Europe", -72.6F);
        temperatureMap.put("Asia", -90F);
        temperatureMap.put("Africa", -11F);
        temperatureMap.put("Australia", -20F);

        System.out.println(temperatureMap);

        //containsKey(Object key) returns true if contains key

        boolean hasKey4= temperatureMap.containsKey("Asia");
        System.out.println(hasKey4);

    }
}
