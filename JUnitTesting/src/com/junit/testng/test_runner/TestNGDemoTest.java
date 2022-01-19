package com.junit.testng.test_runner;


import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNGDemoTest {
    @BeforeMethod
    public void setUp(){
        System.out.println("before test");
    }

    @Test
    public void testCase1(){
        System.out.println("Checked!");
    }

    @Test
    public void testCase2() {
        System.out.println("Checked2!");
    }
    @AfterMethod
    public void cleanUp(){
        System.out.println("finish");
    }
}
