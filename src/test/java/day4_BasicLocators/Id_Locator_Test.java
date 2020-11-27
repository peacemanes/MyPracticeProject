package day4_BasicLocators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utilitites.WebDriverFactory;

public class Id_Locator_Test {
    public static void main(String[] args) {
        WebDriver driver= WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.get("http://practice.cybertekschool.com/multiple_buttons");

        WebElement DontClickButton=driver.findElement(By.id("disappearing_button"));
        DontClickButton.click();

      //  WebElement Button4=driver.findElement(By.id("old_button"));
      // Button4.click();  dynamic id

    }
}
