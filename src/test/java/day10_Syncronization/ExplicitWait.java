package day10_Syncronization;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utilitites.WebDriverFactory;

import java.util.concurrent.TimeUnit;

public class ExplicitWait {
    WebDriver driver;

    @BeforeMethod
    public void setUpMethod() {
        driver = WebDriverFactory.getDriver("chrome");

        driver.manage().window().maximize();
    }

    @AfterMethod
    public void tearDownMethod() throws InterruptedException {
        Thread.sleep(2000);
        driver.quit();
    }

    @Test
    public void Test1() {
        driver.get("http://practice.cybertekschool.com/dynamic_loading/1");
        driver.findElement(By.tagName("button")).click();

        WebElement username=driver.findElement(By.id("username"));

        WebDriverWait wait=new WebDriverWait(driver,10);
        wait.until(ExpectedConditions.visibilityOf(username));
        username.sendKeys("mike smith");




    }
    @Test
    public void Test2() {
        driver.get("http://practice.cybertekschool.com/dynamic_controls");
        driver.findElement(By.xpath("//button[contains(text(),'Enable')]")).click();

        WebDriverWait wait=new WebDriverWait(driver,30);


        WebElement input=driver.findElement(By.cssSelector("input[type=text]"));
        wait.until(ExpectedConditions.elementToBeClickable(input));

        input.sendKeys("asaasasas");



    }
}