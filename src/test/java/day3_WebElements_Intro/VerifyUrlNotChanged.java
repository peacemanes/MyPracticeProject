package day3_WebElements_Intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utilitites.WebDriverFactory;

public class VerifyUrlNotChanged {


    public static void main(String[] args) {
        WebDriver driver= WebDriverFactory.getDriver("Chrome");
        driver.get("http://practice.cybertekschool.com/forgot_password");
        //click on retrievepassword
        String expectedUrl=driver.getCurrentUrl();
        WebElement retrievePasswordButton= driver.findElement(By.id("form_submit"));
        retrievePasswordButton.click();
        String actualUrl=driver.getCurrentUrl();
        if(actualUrl.equals(expectedUrl)){
            System.out.println("PASS");
        } else{
            System.out.println("FAIL");
        }
        driver.quit();
    }
}
