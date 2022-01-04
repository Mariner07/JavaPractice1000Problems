package com.devxschool;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static java.util.Arrays.asList;
import static org.junit.Assert.*;

public class ListUtilTest {

    ListUtil listUtil = new ListUtil();

    @Test
    public void removeAllTestFound1(){
        List<String> wordList = new ArrayList<>(asList("hi","hey","hi","yo"));
        boolean found = listUtil.removeAll(wordList,"hi");
        assertTrue(found);
    }

    @Test
    public void removeAllTestFound2(){
        List<String> wordList = new ArrayList<>(asList("hi","hey","hi","yo"));
        boolean found = listUtil.removeAll(wordList,"hu");
        assertFalse(found);
    }

    @Test
    public void removeAllTestFound3(){
        List<String> wordList = Collections.EMPTY_LIST;
        boolean found = listUtil.removeAll(wordList,"hu");
        assertFalse(found);
    }

    @Test
    public void removeAllKeywordTest1(){
        List<String> wordList = new ArrayList<>(asList("hi","hey","hi","yo"));
        listUtil.removeAll(wordList,"hi");
        assertEquals("Testing size once it was removed", 2, wordList.size());
    }

    @Test
    public void removeAllKeywordTest2(){
        List<String> wordList = new ArrayList<>(asList("hi","hey","hi","yo"));
        listUtil.removeAll(wordList,"hi");
        List<String> expected = asList("hey","yo");
        assertEquals("Removing hi keyword from a list", expected, wordList);
    }

    @Test
    public void removeAllKeywordTest3(){
        List<String> wordList = new ArrayList<>(asList("a","b","c","d"));
        listUtil.removeAll(wordList,"a");
        List<String> expected = asList("b","c","d");
        assertEquals("Removing hi keyword from a list", expected, wordList);
    }

    @Test
    public void removeAllKeywordTest4(){
        List<String> wordList = Collections.EMPTY_LIST;
        listUtil.removeAll(wordList,"a");
        List<String> expected = Collections.EMPTY_LIST;
        assertEquals("Removing hi keyword from a list", expected, wordList);
    }
}