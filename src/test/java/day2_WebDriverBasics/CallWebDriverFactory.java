package day2_WebDriverBasics;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import utilitites.WebDriverFactory;

public class CallWebDriverFactory {
    public static void main(String[] args) {


    WebDriver driver= WebDriverFactory.getDriver("chrome");
    driver.get("http://www.google.com");
}
}