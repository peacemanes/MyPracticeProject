package day7_Types_Of_Elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import utilitites.WebDriverFactory;

public class DisabledElementTest {

    @Test
    public void Test1(){
        WebDriver driver= WebDriverFactory.getDriver("chrome");
        driver.get("http://practice.cybertekschool.com/radio_buttons");
        WebElement greenRadiobutton=driver.findElement(By.id("green"));

        greenRadiobutton.isEnabled();

        System.out.println("Is element enabled :"+greenRadiobutton.isDisplayed());

        Assert.assertFalse(greenRadiobutton.isEnabled(),"Verify that green button is disabled");

        greenRadiobutton.click();
    }

    @Test
    public void Test2(){
        WebDriver driver= WebDriverFactory.getDriver("chrome");
        driver.get("http://practice.cybertekschool.com/dynamic_controls");

        WebElement enabledButton=driver.findElement(By.cssSelector("[id='input-example']>input"));
       // WebElement enabledButton2=driver.findElement(By.cssSelector("#input-example>input"));
       // WebElement enabledButton3=driver.findElement(By.cssSelector("(//input)[2]"));
       // WebElement enabledButton4=driver.findElement(By.cssSelector("[type=text]"));

        System.out.println("Is button enabled: "+enabledButton.isEnabled());
        enabledButton.sendKeys("Mike Smith");




    }
}
