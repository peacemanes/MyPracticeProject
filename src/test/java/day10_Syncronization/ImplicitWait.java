package day10_Syncronization;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utilitites.WebDriverFactory;

import java.util.concurrent.TimeUnit;

public class ImplicitWait {
    WebDriver driver;
    @BeforeMethod
    public void setUpMethod(){
        driver= WebDriverFactory.getDriver("chrome");
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        driver.manage().window().maximize();
    }
    @AfterMethod
    public void tearDownMethod() throws InterruptedException {
        Thread.sleep(2000);
        driver.quit();
    }
    @Test
    public void Test1(){
        driver.get("http://practice.cybertekschool.com/dynamic_loading/4");

       String message=driver.findElement(By.id("finish")).getText();
        System.out.println(message);

    }
    @Test
    public void Test2(){
        driver.get("http://practice.cybertekschool.com/dynamic_loading/3");

        driver.findElement(By.id("username"));


    }
}
