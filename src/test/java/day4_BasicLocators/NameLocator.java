package day4_BasicLocators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utilitites.WebDriverFactory;

public class NameLocator {
    public static void main(String[] args) {
        WebDriver driver= WebDriverFactory.getDriver("chrome");
        driver.get("http://practice.cybertekschool.com/sign_up");
        WebElement fullName=driver.findElement(By.name("full_name"));
        fullName.sendKeys("Mike Myers");
        WebElement emailInput=driver.findElement(By.name("email"));
        emailInput.sendKeys("mikesmith@cybertekschool.com");
        WebElement signupbutton=driver.findElement(By.name("wooden_spoon"));
        signupbutton.click();

        WebElement messageElement=driver.findElement(By.name("signup_message"));
        String actualMessage= messageElement.getText();
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
