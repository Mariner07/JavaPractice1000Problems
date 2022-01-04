package com.devxschool;

import java.util.TreeMap;

public class FirstAndLastVehicle {

    public static void main(String[] args) {
        /**
         * Create a map of cars, so they have orders
         * and print out first and last entry in the map
         * ex:
         * 5, "BMW"
         * 3, "Tesla"
         * 1, "Mercedes"
         * 4, "Audi"
         * 10, "Ford"
         *
         * print out:
         * 1, "Mercedes"
         * 10, "Ford"
         */

        //TODO write your code here
        FirstAndLastVehicle firstAndLastVehicle = new FirstAndLastVehicle();
        firstAndLastVehicle.print();
    }

    public void print() {
        //TODO implement this method
        TreeMap<Integer, String> vehicles = new TreeMap<>();

        vehicles.put(5, "BMW");
        vehicles.put(1, "Mercedes");
        vehicles.put(4,"Audi");
        vehicles.put(3, "Tesla");
        vehicles.put(10, "Ford");

        System.out.println(vehicles.firstEntry());
        System.out.println(vehicles.lastEntry());
    }
}
