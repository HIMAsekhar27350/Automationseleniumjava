package TestNG;

import org.testng.annotations.*;

public class annotation {

    @BeforeSuite
    public void BeforeSuite(){
        System.out.println("BeforeSuite");
    }
    @AfterSuite
    public void AfterSuite(){
        System.out.println("AfterSuite");
    }
    @BeforeClass
    public void BeforeClass(){
        System.out.println("BeforeClass");
    }
    @AfterClass
    public void AfterClass(){
        System.out.println("AfterClass");
    }
    @BeforeMethod
    public void BeforeMethod(){
        System.out.println("BeforeMethod");
    }
    @AfterMethod
    public void AfterMethod(){
        System.out.println("AfterMethod");
    }
    @BeforeTest
    public void BeforeTest(){
        System.out.println("BeforeTest");
    }
    @AfterTest
    public void AfterTest(){
        System.out.println("AfterTest");
    }
    @Test
    public void Test(){
        System.out.println("Test");
    }
}
