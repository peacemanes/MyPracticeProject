package day8_TypesOfElements_2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import utilitites.WebDriverFactory;

public class AttributeTest {

    @Test
            public void Test1(){
        WebDriver driver= WebDriverFactory.getDriver("chrome");
        driver.get("http://practice.cybertekschool.com/radio_buttons");

        WebElement bluebutton1=driver.findElement(By.id("blue"));

        System.out.println(bluebutton1.getAttribute("name"));
        System.out.println(bluebutton1.getAttribute("id"));
        System.out.println(bluebutton1.getAttribute("type"));
        System.out.println(bluebutton1.getAttribute("href"));
        System.out.println(bluebutton1.getAttribute("checked"));
        System.out.println(bluebutton1.getAttribute("outerHTML"));
        System.out.println(bluebutton1.getAttribute("innerHTML"));// about type smt in input box


    }

}
