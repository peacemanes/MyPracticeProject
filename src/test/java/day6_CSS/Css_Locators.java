package day6_CSS;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utilitites.WebDriverFactory;

public class Css_Locators {
    public static void main(String[] args) {
        WebDriver driver= WebDriverFactory.getDriver("chrome");
        driver.get("http://practice.cybertekschool.com/multiple_buttons");

        //WebElement DontClickButton=driver.findElement(By.cssSelector("button#disappearing_button"));
        WebElement DontClickButton=driver.findElement(By.cssSelector("#disappearing_button"));

        String text=DontClickButton.getText();
        System.out.println("text = " + text);

        WebElement homelink=driver.findElement(By.cssSelector("a.nav-link"));
       // WebElement homelink=driver.findElement(By.cssSelector(".nav-link"));

        WebElement generalmodel=driver.findElement(By.cssSelector("button[id='disappearing_button']"));

        WebElement generalmodel2=driver.findElement(By.cssSelector(" [onclick='button1()']"));

        WebElement startingwith=driver.findElement(By.cssSelector("button[id^='button_']"));

        WebElement contains=driver.findElement(By.cssSelector("button[id*='ring_b']"));

        WebElement index=driver.findElement(By.cssSelector("button[onclick^='button']:nth-of-type(3)"));

        WebElement decesandant=driver.findElement(By.cssSelector("nav.navbar.navbar-expand-sm.bg-light a"));

        WebElement followingsibling=driver.findElement(By.cssSelector("h3~p"));







    }
}
