package com.it;


import org.testng.annotations.*;

public class MyTest {

    @BeforeSuite
    public void setUpSuite() {
        System.out.println("BeforeSuite");

    }

    @AfterSuite
    public void tearDownSuite() {
        System.out.println("AfterSuite");

    }

    @BeforeGroups
    public void setUpGroups() {
        System.out.println("BeforeGroups");

    }

    @AfterGroups
    public void tearDownGroups() {
        System.out.println("AfterGroups");

    }

    @BeforeTest
    public void setUpTest() {
        System.out.println("BeforeTest");

    }

    @AfterTest
    public void tearDownTest() {
        System.out.println("AfterTest");

    }

    @BeforeClass
    public void setUpClass() {
        System.out.println("BeforeClass");

    }

    @AfterClass
    public void tearDownClass() {
        System.out.println("AfterClass");

    }

    @BeforeMethod
    public void setUpBeforeMethod() {
        System.out.println("BeforeMethod");
    }

    @AfterMethod
    public void tearDownAfterMethod() {
        System.out.println("AfterMethod");
    }

    @Test
    public void test1() {
        System.out.println("test1");
    }

    @Test
    public void test2() {
        System.out.println("test2");
    }

    @Test
    public void test3() {
        System.out.println("test3");
    }
}
