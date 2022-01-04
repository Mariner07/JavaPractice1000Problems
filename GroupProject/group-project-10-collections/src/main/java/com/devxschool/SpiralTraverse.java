package com.devxschool;

import java.util.*;

public class SpiralTraverse {
    int nur;

    //Write a function that takes in a two dimensional array and returns a one dimensional ArrayList of all the array's element in spiral order.

    //Spiral order start at the top lef corner of the two dimensional array, goes to the right, and proceeds
    //in a spiral pattern all the way until every element has been visited
    public static void main(String[] args) {
        SpiralTraverse sp = new SpiralTraverse();

        int[][] array = {{1, 2, 3, 4}, {12, 13, 14, 5}, {11, 16, 15, 6}, {10, 9, 8, 7}};
        System.out.println(sp.spiralTraverse(array));
    }

    public List<Integer> spiralTraverse(int[][] array) {
        List<Integer> result= new ArrayList<>();


        return null;
    }
}

