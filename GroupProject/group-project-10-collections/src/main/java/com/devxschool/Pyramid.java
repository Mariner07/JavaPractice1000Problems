package com.devxschool;

import java.util.ArrayList;
import java.util.List;

public class Pyramid {

    public static void main(String[] args) {
        /**
         * Write a java function that returns lines of stars
         * so that when it is printed out, it displays a Pyramid
         *
         * ex: This list of stars will return a pyramid once it is print out line by line
         * [         * ,         * * ,        * * * ,       * * * * ,      * * * * * ,     * * * * * * ,    * * * * * * * ,   * * * * * * * * ,  * * * * * * * * * , * * * * * * * * * * ]
         *
         * output:
         *          *
         *         * *
         *        * * *
         *       * * * *
         *      * * * * *
         *     * * * * * *
         *    * * * * * * *
         *   * * * * * * * *
         *  * * * * * * * * *
         * * * * * * * * * * *
         *
         */

        printStars(10).forEach(System.out::println);
    }

    public static List<String> printStars(int n) {
        //TODO implement this method
//        int spaces=10;
//        String temp="";
        List<String> star= new ArrayList<>();
        for(int i=0; i<n; i++){
            String temp="";
            for(int j=0; j<n; j++) {
                temp+=" ";
            }
            for(int s=0; s<=i; s++){
                temp+="* ";
            }
            star.add(temp);
//            System.out.println("");
        }
        return star;
    }
}