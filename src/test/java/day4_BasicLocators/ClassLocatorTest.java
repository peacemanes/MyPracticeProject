package day4_BasicLocators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utilitites.WebDriverFactory;

public class ClassLocatorTest {
    public static void main(String[] args) {
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.get("http://practice.cybertekschool.com/sign_up");
        WebElement homeLink=driver.findElement(By.className("nav-link"));
        homeLink.click();
        driver.get("http://practice.cybertekschool.com/multiple_buttons");
        WebElement multiplebut=driver.findElement(By.tagName("h3"));
        String title=multiplebut.getText();
        System.out.println(title);
       // System.out.println(driver.findElement(By.tagName("h3")).getText());

    }
}
