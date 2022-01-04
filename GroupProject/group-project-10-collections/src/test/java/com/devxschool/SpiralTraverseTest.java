package com.devxschool;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

public class SpiralTraverseTest {
    SpiralTraverse sp = new SpiralTraverse();

    @Test
    public void testCase1() {
        int[][] input =
                new int[][]{
                        {1, 2, 3, 4},
                        {12, 13, 14, 5},
                        {11, 16, 15, 6},
                        {10, 9, 8, 7},
                };
        List<Integer> expected = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16);
        List<Integer> actual = sp.spiralTraverse(input);
        Assert.assertEquals("Spiral Traverse Assertion Error TC1", expected, actual);
    }


    @Test
    public void testCase2() {
        int[][] input = new int[][]{
                {27, 12, 35, 26},
                {25, 21, 94, 11},
                {19, 96, 43, 56},
                {55, 36, 10, 18},
                {96, 83, 31, 94},
                {93, 11, 90, 16}};

        List<Integer> expected = Arrays.asList(27, 12, 35, 26, 11, 56, 18, 94, 16, 90, 11, 93, 96, 55, 19, 25, 21, 94, 43, 10, 31, 83, 36, 96);

        List<Integer> actual = sp.spiralTraverse(input);
        Assert.assertEquals("Spiral Traverse Assertion Error TC2", expected, actual);
    }

    @Test
    public void testCase3() {
        int[][] input = new int[][]{
                {1, 2, 3, 4},
                {10, 11, 12, 5},
                {9, 8, 7, 6}};

        List<Integer> expected = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12);

        List<Integer> actual = sp.spiralTraverse(input);
        Assert.assertEquals("Spiral Traverse Assertion Error TC3", expected, actual);
    }

    @Test
    public void testCase4() {
        int[][] input = new int[][]{
                {4, 2, 3, 6, 7, 8, 1, 9, 5, 10},
                {12, 19, 15, 16, 20, 18, 13, 17, 11, 14}};

        List<Integer> expected = Arrays.asList(4, 2, 3, 6, 7, 8, 1, 9, 5, 10, 14, 11, 17, 13, 18, 20, 16, 15, 19, 12);

        List<Integer> actual = sp.spiralTraverse(input);
        Assert.assertEquals("Spiral Traverse Assertion Error TC4", expected, actual);
    }


    @Test
    public void testCase5() {
        int[][] input = new int[][]{
                {1, 2, 3},
                {8, 9, 4},
                {7, 6, 5}};

        List<Integer> expected = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);

        List<Integer> actual = sp.spiralTraverse(input);
        Assert.assertEquals("Spiral Traverse Assertion Error TC5", expected, actual);
    }


}
