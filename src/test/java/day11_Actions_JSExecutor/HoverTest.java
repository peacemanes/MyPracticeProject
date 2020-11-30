package day11_Actions_JSExecutor;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utilitites.WebDriverFactory;

public class HoverTest {
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
    public void Hover() throws InterruptedException {
        driver.get("http://practice.cybertekschool.com/hovers");
        Actions actions = new Actions(driver);

        WebElement img = driver.findElement(By.tagName("img"));
        Thread.sleep(2000);
        actions.moveToElement(img).perform();

        WebElement text = driver.findElement(By.xpath("//h5[.='name: user1']"));
        Assert.assertTrue(text.isDisplayed());

        Assert.assertTrue(driver.findElement(By.linkText("View profile")).isDisplayed());
    }
    @Test
    public void Hover2() throws InterruptedException {
        driver.get("http://practice.cybertekschool.com/hovers");

        for (int i=0;i<4;i++) {
            String imgxpath="(//img)[" + "]";
            System.out.println("After combining string"+imgxpath);
            String firstname="mike";
            String secondname="smith";
            String fullname=firstname+secondname;


            WebElement img= driver.findElement(By.xpath(imgxpath));
            Actions actions = new Actions(driver);
            Thread.sleep(1000);
            actions.moveToElement(img).perform();

            String textxpath="//h5[.='name: user1']";
            System.out.println("textxpath = " + textxpath);

            WebElement text=driver.findElement(By.xpath(textxpath));
            Assert.assertTrue(text.isDisplayed());

        }









    }
    @Test
    public void StaleTest(){
        driver.get("http://www.google.com");
        WebElement input=driver.findElement(By.name("q"));
        input.sendKeys("Selenium"+ Keys.ENTER);

        WebElement results=driver.findElement(By.id("resultStats"));
        Assert.assertTrue(results.isDisplayed());
        driver.navigate().back();
        input=driver.findElement(By.name("q"));
        input.sendKeys("java", Keys.ENTER);
    }






}