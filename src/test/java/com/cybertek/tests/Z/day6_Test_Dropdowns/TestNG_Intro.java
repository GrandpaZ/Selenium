package com.cybertek.tests.Z.day6_Test_Dropdowns;

import org.testng.annotations.*;

public class TestNG_Intro {

    @BeforeClass
    public void setupClass(){
        System.out.println("------------->Before Class is running....");
    }
    @AfterClass
    public void tearDownClass(){
        System.out.println("------------->After Class is running....");
    }



    @BeforeMethod
    public void setupMethod(){
        System.out.println("------------->Before method is running....");
    }
    @AfterMethod
    public void teardownMethod(){
        System.out.println("------------->After method is running....");
    }



    @Test
    public void test1(){
        System.out.println("Running for test 1 ....");
    }
    @Test
    public void test2(){
        System.out.println("Running for test 2 ....");

    }

}
