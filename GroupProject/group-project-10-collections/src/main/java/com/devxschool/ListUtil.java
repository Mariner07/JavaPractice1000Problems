package com.devxschool;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

import static java.util.Arrays.asList;

public class ListUtil {

    public static void main(String[] args) {
        /**
         * Write a function that returns a boolean if find keywords and then remove them
         */

        ListUtil listUtil = new ListUtil();
        List<String> wordList = new ArrayList<>(asList("hi","hey","hi","yo"));

        boolean found = listUtil.removeAll(wordList,"hi");
        System.out.println("Found: " + found);
        System.out.println("Updated List: " + wordList);
    }


    public boolean removeAll(List<String> wordList, String targetWord){
        //TODO implement this method
        boolean hasWord = false;

        for(int i = 0; i<wordList.size(); i++){
            if(wordList.get(i).equals(targetWord)){
                wordList.remove(i);
                hasWord = true;
            }
        }
        return hasWord;
    }
}

