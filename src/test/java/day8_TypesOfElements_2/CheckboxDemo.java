package day8_TypesOfElements_2;

import groovyjarjarantlr.actions.cpp.ActionLexer;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import utilitites.WebDriverFactory;

public class CheckboxDemo {

    @Test
            public void Test1(){

    WebDriver driver= WebDriverFactory.getDriver("chrome");
    driver.get("http://practice.cybertekschool.com/checkboxes");

    //WebDriver checkboxbuton2=driver.findElement(By.cssSelector("#checkboxes>input:nth-of-type(2)"));
    WebElement checkboxbuton1=driver.findElement(By.xpath("//input[1]"));
    WebElement checkboxbuton2=driver.findElement(By.xpath("//input[2]"));

        System.out.println("checkboxbuton1.isSelected() = " + checkboxbuton1.isSelected());
        System.out.println("checkboxbuton2.isSelected() = " + checkboxbuton2.isSelected());


        Assert.assertFalse(checkboxbuton1.isSelected(),"verify checkbox1 is not selected");
        Assert.assertTrue(checkboxbuton2.isSelected(),"verify checkbox1 is selected");

        checkboxbuton1.click();

        Assert.assertTrue(checkboxbuton1.isSelected(),"verify checkbox1 is selected");
        Assert.assertTrue(checkboxbuton2.isSelected(),"verify checkbox1 is selected");

    driver.quit();
    }

}
