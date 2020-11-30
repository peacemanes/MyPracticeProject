package day8_TypesOfElements_2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
import utilitites.WebDriverFactory;

import java.util.List;

public class NoSelectDropdown {
    @Test
    public void Test1(){
        WebDriver driver=WebDriverFactory.getDriver("chrome");
        driver.get("http://practice.cybertekschool.com/dropdown");
        WebElement dropdownelement=driver.findElement(By.id("dropdownMenuLink"));

       //gives UnexpectedTagNameException error
        // Select dropdownbutton=new Select(dropdownelement);

        dropdownelement.click();

        List<WebElement> list=driver.findElements(By.className("dropdown-item"));
        System.out.println("Number of links :"+list.size());

        System.out.println(list.get(0).getText());

        for (WebElement webElement : list) {
            System.out.println(webElement.getText());

        }

       // driver.findElement(By.linkText("Yahoo")).click();  Yahoo icin
        list.get(3).click();
    }
}
