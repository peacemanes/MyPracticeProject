package day5_XPath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utilitites.WebDriverFactory;

public class AmazonSearchNumbers {
    public static void main(String[] args) {
        WebDriver driver= WebDriverFactory.getDriver("chrome");
        driver.get("https://www.amazon.com/");

        WebElement searchbox=driver.findElement(By.id("twotabsearchtextbox"));
        searchbox.sendKeys("Selenium");
        WebElement searchbutton=driver.findElement(By.xpath("//input[@value='Go'][@tabindex='0']"));
        searchbutton.click();

       //may not be realiable
       // WebElement text=driver.findElement(By.xpath("//span[text()='1-48 of 258 results for']"));
        //WebElement text=driver.findElement(By.xpath("//span[contains(text(),'results')]"));
        WebElement text=driver.findElement(By.xpath("//span[contains(text(),'results for')]"));

        System.out.println(text.getText());

        WebElement parentindex=driver.findElement(By.xpath("//*[@*='button2()']/../button[5]"));
        WebElement parentindex2=driver.findElement(By.xpath("//*[@*='button2()']/../p"));



    }
}
