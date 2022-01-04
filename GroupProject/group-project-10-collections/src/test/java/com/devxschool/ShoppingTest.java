package com.devxschool;

import org.junit.Test;

import java.util.*;

import static java.util.Arrays.asList;
import static org.junit.Assert.assertEquals;

public class ShoppingTest {

    Shopping shopping = new Shopping();

    @Test
    public void createCartTest1() {
        String input = "Apple\nNo\nPear\nNo\nApple\nYes";
        Scanner scanner = new Scanner(input);
        List<String> actual = shopping.createCart(scanner);
        List<String> expected = asList("apple: 2", "pear: 1");
        assertEquals("Creating 2 apples and 1 pear", expected, actual);
    }
    @Test
    public void createCartTest2() {
        String input = "Apple\nYes";
        Scanner scanner = new Scanner(input);
        List<String> actual = shopping.createCart(scanner);
        List<String> expected = asList("apple: 1");
        assertEquals("Creating 1 apple", expected, actual);
    }
    @Test
    public void createCartTest3() {
        String input = "Apple\nNO\nPear\nNO\nApple\nNO\nPear\nYES";
        Scanner scanner = new Scanner(input);
        List<String> actual = shopping.createCart(scanner);
        List<String> expected = asList("apple: 2", "pear: 2");
        assertEquals("Creating 2 apples and 2 pear", expected, actual);
    }
    @Test
    public void createCartTest4() {
        String input = "A\nno\nB\nno\nC\nno\nD\nyes";
        Scanner scanner = new Scanner(input);
        List<String> actual = shopping.createCart(scanner);
        List<String> expected = asList("a: 1", "b: 1", "c: 1", "d: 1");
        assertEquals("Creating A: 1, B: 1, C: 1, D: 1", expected, actual);
    }
}