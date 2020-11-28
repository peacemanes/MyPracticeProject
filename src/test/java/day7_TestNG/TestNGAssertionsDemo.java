package day7_TestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestNGAssertionsDemo {
    @Test
    public void Test1(){
        System.out.println("First Assertion");
        Assert.assertEquals(1,1);

        System.out.println("Second Assertion");
        Assert.assertEquals("title","title");
        System.out.println("After second assertion");
    }

    @Test
    public void Test2(){

        String ActualTitle="Cybertek";
        String ExpectedTitleBeginnning="C";
        System.out.println("first assertion");
        Assert.assertTrue(ActualTitle.startsWith(ExpectedTitleBeginnning),"Verify title starts with C");

        Assert.assertTrue("email@gmail".contains("@"),"verify  @ in email");
    }

    @Test
    public void Test3() {

        Assert.assertNotEquals("one", "two");
        String actualMail = "";
    }
        @Test
        public void Test4(){

            Assert.assertFalse(1<0);



        }
}
