package day3_WebElements_Intro;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utilitites.WebDriverFactory;

public class VerifyUrlChanged {
    public static void main(String[] args) {
        WebDriver driver= WebDriverFactory.getDriver("chrome");
        driver.get("http://practice.cybertekschool.com/forgot_password");

        WebElement emailInput=driver.findElement(By.name("email"));
        emailInput.sendKeys("email@hotmail.com");

        WebElement retrievePasswordButton=driver.findElement(By.id("form_submit"));
        retrievePasswordButton.click();

        String expectedResult="http://practice.cybertekschool.com/email_sent";
        String actualResult=driver.getCurrentUrl();

        if(expectedResult.equals(actualResult)){
            System.out.println("PASS");
        }else{
            System.out.println("FAIL");
            System.out.println("actualResult = " + actualResult);
            System.out.println("expectedResult = " + expectedResult);
        }

        driver.quit();
    }
}
