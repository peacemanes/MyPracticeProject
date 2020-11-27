package day4_BasicLocators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utilitites.WebDriverFactory;

public class LinkAndPartialLinkTest {
    public static void main(String[] args) {
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.get("http://practice.cybertekschool.com/dynamic_loading");
        WebElement linktext=driver.findElement(By.linkText("Example 3: Element on page that is hidden and become visible after 5 seconds"));
       // linktext.click();
        //driver.findElement(By.linkText("Home")).click();
        WebElement partialLink=driver.findElement(By.partialLinkText("Example 6"));
        partialLink.click();


    }
}
