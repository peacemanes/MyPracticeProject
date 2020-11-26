package day3_WebElements_Intro;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utilitites.WebDriverFactory;

public class ConfirmationMessage {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver= WebDriverFactory.getDriver("chrome");
        driver.get("http://practice.cybertekschool.com/forgot_password");

        WebElement inputEmail=driver.findElement(By.name("email"));

        String expectedEmail="test@gmail.com";

        inputEmail.sendKeys(expectedEmail);
        Thread.sleep(2000);

        //String actualEmail=inputEmail.getText();
        String actualEmail=inputEmail.getAttribute("value");

        if(actualEmail.equals(expectedEmail)){
            System.out.println("PASS");
        }else{
            System.out.println("Fail");
            System.out.println("actualEmail = " + actualEmail);
            System.out.println("expectedEmail = " + expectedEmail);
        }

        WebElement retrieveButton=driver.findElement(By.id("form_submit"));
        retrieveButton.click();
        String exepectedMessage="Your e-mail's been sent!";
        WebElement messageElement=driver.findElement(By.name("confirmation_message"));


        String actualMessage=messageElement.getText();

        if(actualMessage.equals(exepectedMessage)){
            System.out.println("Pass");
        }else{
            System.out.println("Fail");
            System.out.println("actualMessage = " + actualMessage);
            System.out.println("exepectedMessage = " + exepectedMessage);
        }


        driver.quit();
    }
}
