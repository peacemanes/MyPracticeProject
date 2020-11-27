package day5_XPath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utilitites.WebDriverFactory;

public class AmazonTest {
    public static void main(String[] args) {
        WebDriver driver=WebDriverFactory.getDriver("chrome");
        driver.get("https://www.amazon.com");
        WebElement searchbox=driver.findElement(By.id("twotabsearchtextbox"));
        searchbox.sendKeys("Selenium");

        WebElement searchbutton=driver.findElement(By.xpath("//input[@tabindex='0'and@value='Go']"));
        searchbutton.click();
            // another page
        WebElement parenting=driver.findElement(By.xpath("(//p)[1]"));
        System.out.println(parenting.getText());

        WebElement parenting2DynamicLoading=driver.findElement(By.xpath("(//a[contains(text(),'Dynamic')])[3]"));

        //WebElement multiplexpathbutton2=driver.findElement(By.xpath("//button[@onclick='button2()'][@name='button2']"));
        WebElement multiplexpathbutton2=driver.findElement(By.xpath("//button[@onclick='button2()'and@name='button2']"));

       // WebElement multiplexpathwithor=driver.findElement(By.xpath("//button[@onclick='button2()'and@name='button2']"));

        WebElement parentdiv=driver.findElement(By.xpath("//button[@onclick='button2()']/parent::div"));
        //WebElement parentdiv=driver.findElement(By.xpath("//button[@onclick='button2()']/parent::*"));



    }

}
