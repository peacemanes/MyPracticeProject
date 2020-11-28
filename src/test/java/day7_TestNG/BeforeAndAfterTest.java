package day7_TestNG;

import org.testng.annotations.*;

public class BeforeAndAfterTest {
    @Test
    public void Test1(){
        System.out.println("This is Test1");
    }
    @Ignore
    @Test
    public void Test2(){
        System.out.println("This is Test2");
    }
    @Test
    public void Test3(){
        System.out.println("This is Test3");
    }

    @BeforeMethod
    public void BeforeMethod(){
        System.out.println("BEFORE METHOD");
        System.out.println("OPENING THE BROWSER");
    }
    @AfterMethod
    public void AfterMethod(){
        System.out.println("CLOSE BROWSER");
        System.out.println("AFTER METHOD");
    }
    @BeforeClass
    public  void BeforeClass(){
        System.out.println("BEFORE CLASS CODE");
    }
    @AfterClass
    public  void AfterClass(){
        System.out.println("AFTER CLASS CODE");
        System.out.println("REPORTING");
    }
}
