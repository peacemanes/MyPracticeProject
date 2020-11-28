package day7_Types_Of_Elements;

import com.google.gson.internal.bind.util.ISO8601Utils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import utilitites.WebDriverFactory;

public class RadioButtonsTest {
    @Test
    public void Test1(){
        WebDriver driver=WebDriverFactory.getDriver("chrome");
        driver.get("http://practice.cybertekschool.com/radio_buttons");
        WebElement bluebutton=driver.findElement(By.id("blue"));
        WebElement redbutton=driver.findElement(By.id("red"));

        System.out.println("Is blue button selected :"+bluebutton.isSelected());
        System.out.println("Is red button selected :"+redbutton.isSelected());

        Assert.assertTrue(bluebutton.isSelected(),"Verify that blue button is selected");
        Assert.assertFalse(redbutton.isSelected(),"Verify that red button is not selected");


        redbutton.click();

        System.out.println("Is blue button selected :"+bluebutton.isSelected());
        System.out.println("Is red button selected :"+redbutton.isSelected());

        Assert.assertFalse(bluebutton.isSelected(),"Verify that blue button is not selected");
        Assert.assertTrue(redbutton.isSelected(),"Verify that red button is  selected");





        driver.quit();
    }

}
