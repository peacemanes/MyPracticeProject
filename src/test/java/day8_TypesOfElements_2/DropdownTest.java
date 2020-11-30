package day8_TypesOfElements_2;


import org.openqa.selenium.support.ui.Select;

import org.apache.tools.ant.types.selectors.MappingSelector;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import utilitites.WebDriverFactory;

import java.util.List;

public class DropdownTest {
    @Test
    public void Test1() {
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.get("http://practice.cybertekschool.com/dropdown");

        WebElement dropdownElement = driver.findElement(By.id("state"));
        Select stateList = new Select(dropdownElement);
        List<WebElement> options = stateList.getOptions();
        System.out.println(options.size());
        for (WebElement option : options) {
            System.out.println(option.getText());

        }
    }
        @Test
        public void Test2() throws InterruptedException {
            WebDriver driver= WebDriverFactory.getDriver("chrome");
            driver.get("http://practice.cybertekschool.com/dropdown");

            //WebElement dropdownElement=driver.findElement(By.id("state"));
           //Select stateList= new Select(dropdownElement);

          //  WebElement dropdownElement=driver.findElement(By.id("state"));
            Select stateList= new Select(driver.findElement(By.id("state")));

            String expectedOption="Select a State";
            String actualOption=stateList.getFirstSelectedOption().getText();


            Assert.assertEquals(actualOption,expectedOption,"verify that first selection is Select a state");

            Thread.sleep(2000);
            stateList.selectByVisibleText("Texas");
            actualOption=stateList.getFirstSelectedOption().getText();
            Assert.assertEquals(actualOption,"Texas");


            Thread.sleep(2000);
            stateList.selectByIndex(51);

            actualOption=stateList.getFirstSelectedOption().getText();
            Assert.assertEquals(actualOption,"Wyoming");
            System.out.println("actualOption = " + actualOption);

            Thread.sleep(2000);
            stateList.selectByValue("VA");
            actualOption=stateList.getFirstSelectedOption().getText();
            Assert.assertEquals(actualOption,"Virginia");







    }
}
