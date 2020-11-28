package day5_XPath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utilitites.WebDriverFactory;

public class XPathTest {
    public static void main(String[] args) {
        WebDriver driver=WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.get("http://practice.cybertekschool.com/multiple_buttons");
        WebElement button1=driver.findElement(By.xpath("//button[@*='button1()']"));
       // WebElement button1=driver.findElement(By.xpath("//button[@onclick='button1()']"));
       // WebElement button1=driver.findElement(By.xpath("//*[@*='button1()']]"));
       // WebElement button1=driver.findElement(By.xpath("//*[@onclick='button1()']"));

        //WebElement text=driver.findElement(By.xpath("//*[text()='Multiple buttons']"));
       WebElement text=driver.findElement(By.xpath("//h3[text()='Multiple buttons']"));
        //WebElement text=driver.findElement(By.xpath("//h3[.='Multiple buttons']"));
       // WebElement text=driver.findElement(By.xpath("//*[.='Multiple buttons']"));

        WebElement signuptext=driver.findElement(By.xpath("//*[.='Sign Up Page']"));

        WebElement containstext=driver.findElement(By.xpath("//*[contains(text(),'ton 1')]"));

        WebElement dynamicid=driver.findElement(By.xpath("//button[starts-with(@id,'button')]"));

        WebElement endswithalternative=driver.findElement(By.xpath("//button[contains(@id,'_button')][1]"));

        //      //h3/..  for parent




    }
}
