package day8_TypesOfElements_2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import utilitites.WebDriverFactory;

public class DisplayedDemo {

    @Test
    public void Test1() throws InterruptedException {
        WebDriver driver= WebDriverFactory.getDriver("chrome");
        driver.get("http://practice.cybertekschool.com/dynamic_loading/1");

        WebElement username=driver.findElement(By.id("username"));

        System.out.println(username.isDisplayed());

        Assert.assertFalse(username.isDisplayed(),"verify that username is not displayed");

        WebElement startButton=driver.findElement(By.cssSelector("#start>button"));
        //WebElement startbutton=driver.findElement(By.xpath("//*[text()='Start']"));//
        startButton.click();
        Thread.sleep(5000);

        System.out.println(username.isDisplayed());





    }

}
