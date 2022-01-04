package com.junit.class02;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

//Test cases for calculator
public class CalculatorTest {
    Calculator c;
    /*

     */
    @Before
    public void verifySetUp(){
        c = new Calculator();
    }
    @Test
    public void verifyPositiveEqualsNumber(){
        double actResult = c.div(10, 20);
        double expected = 2;
        //Assert.assertEquals(expected, actResult, 0);        //Deprecated - no use anymore
        //Better
        Assert.assertTrue("Expected was : "+ expected + " : Actual "+ actResult, actResult==expected);

//        if(actResult != expected){
//            System.out.println("Error! ");
//        }
    }
}
