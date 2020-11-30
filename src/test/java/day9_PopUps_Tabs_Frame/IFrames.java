package day9_PopUps_Tabs_Frame;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utilitites.WebDriverFactory;

import java.security.PublicKey;

public class IFrames {
    WebDriver driver;
    @BeforeMethod
    public void setUpMethod(){
        driver= WebDriverFactory.getDriver("chrome");

    }
    @AfterMethod
    public void tearDownMethod() throws InterruptedException {
        Thread.sleep(3000);
        driver.quit();


    }
    @Test
    public void iFrames(){
        driver.get("http://practice.cybertekschool.com/frames");
        driver.findElement(By.id("tinymce")).sendKeys("HELLOOO");
        driver.switchTo().frame("mce_O_ifr");
        driver.findElement(By.id("tinymce")).clear();
        driver.findElement(By.id("tinymce")).sendKeys("we use name or Id");
        driver.switchTo().defaultContent();// 1

        driver.switchTo().frame(0);//  2
        driver.findElement(By.id("tinymce")).clear();
        driver.findElement(By.id("tinymce")).sendKeys("we use Index");

        driver.switchTo().parentFrame();// go back to first frame.only child

        WebElement frameElement=driver.findElement(By.tagName("iframe"));
        driver.switchTo().frame(frameElement);//3

        driver.findElement(By.id("tinymce")).sendKeys("we located WebElement");


    }
    @Test
    public void multipleFrames(){
        driver.get("http://practice.cybertekschool.com/nested_frames");

        driver.switchTo().frame("frame-top");
        driver.switchTo().frame("frame-middle");
        System.out.println(driver.findElement(By.id("content")).getText());

        driver.switchTo().parentFrame();

        driver.switchTo().frame(2);

        System.out.println(driver.findElement(By.tagName("body")).getText());

        driver.switchTo().defaultContent();

        driver.switchTo().frame(1);
        System.out.println(driver.findElement(By.tagName("body")).getText());

    }


}
