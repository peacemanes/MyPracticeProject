package day1_Basic_Navigation;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import static com.sun.org.apache.xml.internal.serialize.LineSeparator.Web;

public class Basic_Navigation {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
       // WebDriver driver=new ChromeDriver();
        WebDriver driver=new ChromeDriver();
        driver.get("http://practice.cybertekschool.com/");
        System.out.println(driver.getTitle());
        driver.quit();

    }
}
