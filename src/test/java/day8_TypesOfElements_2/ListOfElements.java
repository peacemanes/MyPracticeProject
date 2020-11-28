package day8_TypesOfElements_2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import utilitites.WebDriverFactory;

import java.util.List;

public class ListOfElements {

    @Test
    public void Test1() {
        WebDriver driver= WebDriverFactory.getDriver("chrome");
        driver.get("http://practice.cybertekschool.com/multiple_buttons");

       List<WebElement> buttons=driver.findElements(By.tagName("button"));
        System.out.println("buttons.size() = " + buttons.size());
        Assert.assertEquals(buttons.size(),6,"verify we go 6 buttons");

        for (WebElement button : buttons) {

            System.out.println(button.getText());
            
        }
        // this never gives NOsuchelement exception
        List<WebElement> buttons1=driver.findElements(By.tagName("sadasdasd"));
        System.out.println("button1.size() = " + buttons.size());




    }
    @Test
    public void Test2() {
        WebDriver driver= WebDriverFactory.getDriver("chrome");
        driver.get("http://practice.cybertekschool.com/multiple_buttons");


        // this never gives NOsuchelement exception
        List<WebElement> buttons=driver.findElements(By.tagName("sadasdasd"));
        System.out.println("button.size() = " + buttons.size());




    }
}
