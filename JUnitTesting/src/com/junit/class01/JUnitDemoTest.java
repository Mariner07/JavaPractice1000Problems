package com.junit.class01;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class JUnitDemoTest {
    @Before
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
    @After
    public void cleanUp(){
        System.out.println("finish");
    }
}
