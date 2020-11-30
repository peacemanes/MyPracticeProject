package day11_Actions_JSExecutor;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utilitites.WebDriverFactory;

public class JavascriptExecutor {
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
    public void Test1(){
        driver.get("http://practice.cybertekschool.com/");

        WebElement link=driver.findElement(By.linkText("Dropdown"));
        //link.click();


        JavascriptExecutor jse=(JavascriptExecutor)driver;
       // jse.executeScript("arguments[0].click(1)",link);
    }
    @Test
    public void Test2(){
        driver.get("http://practice.cybertekschool.com/dynamic_controls");

        WebElement inputbox=driver.findElement(By.cssSelector("input[type='text']"));
        //link.click();


        JavascriptExecutor jse=(JavascriptExecutor)driver;
       String str="Hello disabled inbox";
      // jse.executeScript("arguments[0].setAttribute('value','" +str+ "')",inputbox);

}
    @Test
    public void Scroll() throws InterruptedException {
        driver.get("http://practice.cybertekschool.com/infinite_scroll");

        JavascriptExecutor jse=(JavascriptExecutor)driver;


        for (int i = 0; i < 10; i++) {//scroll down
            Thread.sleep(500);
        //    jse.executeScript("window.scrollBy(0,250)");

        }
        for (int i = 0; i < 10; i++) {// scroll up
            Thread.sleep(500);
          //  jse.executeScript("window.scrollBy(0,-250)");

        }





    }



}