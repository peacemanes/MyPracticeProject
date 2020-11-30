package day10_Syncronization;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utilitites.WebDriverFactory;

public class ThreadSleep {
    WebDriver driver;
    @BeforeMethod
    public void setUpMethod(){
        driver= WebDriverFactory.getDriver("chrome");

    }
    @AfterMethod
    public void tearDownMethod() throws InterruptedException {
        Thread.sleep(2000);
        driver.quit();


    }
    @Test
    public void Test1() throws InterruptedException {
        driver.get("http://practice.cybertekschool.com/dynamic_loading/3");
        Thread.sleep(7000);
        driver.findElement(By.id("username")).sendKeys("Mikesmith");


    }
}
