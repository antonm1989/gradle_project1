package com.it;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class MyTest1 {
    @DataProvider(name = "Name")
    public static Object[][] Name() {
        return new Object[][]{{1, 1, 2}, {2, 2, 4}, {3, 3, 6}};
    }

    @Test(dataProvider = "Name")
    public void test1(int a, int b, int c) {
        Assert.assertEquals(a + b, c, "ddgfgdfgdf");
    }

    @Test(invocationTimeOut = 1000)
    public void test2() {
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertEquals(2 + 3, 4);
        softAssert.assertEquals(3 + 3, 6);
        softAssert.assertEquals(2 + 2, 7);
        softAssert.assertEquals(4 + 4, 8);
        softAssert.assertAll();
        try {
            Thread.sleep(1500);
        } catch (InterruptedException e) {
            //fff
        }
    }

    @Test(dependsOnMethods = {"test1,test2"}, alwaysRun = true)
    public void test3() {
        System.out.println("test3");
    }

    @Test(invocationCount = 100)
    public void test4() {
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertEquals(2 + 3, 4);
        softAssert.assertEquals(3 + 3, 6);
        softAssert.assertEquals(2 + 2, 7);
        softAssert.assertEquals(4 + 4, 8);
        softAssert.assertAll();

    }
    @Test(threadPoolSize = 10,invocationCount = 100)
    public void test5() {
        System.out.println("ddd");
        System.out.println(Thread.currentThread().getName());
    }
}
