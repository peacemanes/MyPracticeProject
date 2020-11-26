package day2_WebDriverBasics;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverBasics {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("http://practice.cybertekschool.com/");
        driver.navigate().to("http://www.amazon.com");
        driver.navigate().back();
        String title=driver.getTitle();
        System.out.println("Title "+title);
        String currentUrl=driver.getCurrentUrl();
        System.out.println("currentUrl = " + currentUrl);
        String pageSource=driver.getPageSource();
        System.out.println("pageSource = " + pageSource);
        System.out.println();
        driver.quit();


    }
}
