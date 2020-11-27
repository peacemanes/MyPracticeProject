package day4_BasicLocators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utilitites.WebDriverFactory;

public class TagnameTest {
    public static void main(String[] args) {
        WebDriver driver= WebDriverFactory.getDriver("chrome");
        driver.get("http://practice.cybertekschool.com/sign_up");

        WebElement fullName=driver.findElement(By.tagName("input"));
        fullName.sendKeys("Mike Myers with tagname");
        WebElement emailInput=driver.findElement(By.name("email"));
        emailInput.sendKeys("mikesmith@cybertekschool.com");
        WebElement signupbutton=driver.findElement(By.tagName("button"));
        signupbutton.click();

        WebElement messageElement=driver.findElement(By.tagName("h3"));
        String actualMessage= messageElement.getText();
        System.out.println(driver.findElement(By.tagName("h3")).getText());
        String expectedmessage="Thank you for signing up. Click the button below to return to the home page.";

        if(actualMessage.equals(expectedmessage)){
            System.out.println("Pass");
        }else{
            System.out.println("Fail");
            System.out.println("actualMessage = " + actualMessage);
            System.out.println("expectednmessage = " + expectedmessage);
        }

        driver.quit();
    }
}
