package com.devxschool;

import org.junit.Test;

import java.util.List;

import static java.util.Arrays.asList;
import static org.junit.Assert.assertEquals;

public class PyramidTest {

    @Test
    public void printStarsTest1() {
        List<String> actual = Pyramid.printStars(10);
        List<String> expected = asList(
                "         * ",
                "        * * ",
                "       * * * ",
                "      * * * * ",
                "     * * * * * ",
                "    * * * * * * ",
                "   * * * * * * * ",
                "  * * * * * * * * ",
                " * * * * * * * * * ",
                "* * * * * * * * * * ");
        assertEquals("Printing out a pyramid with 10 lines of stars",
                expected, actual);
    }

    @Test
    public void printStarsTest2() {
        List<String> actual = Pyramid.printStars(5);
        List<String> expected = asList(
                "    * ",
                "   * * ",
                "  * * * ",
                " * * * * ",
                "* * * * * ");
        assertEquals("Printing out a pyramid with 5 lines of stars",
                expected, actual);
    }

    @Test
    public void printStarsTest3() {
        List<String> actual = Pyramid.printStars(1);
        List<String> expected = asList(
                "* ");
        assertEquals("Printing out a pyramid with 1 lines of stars",
                expected, actual);
    }
}
