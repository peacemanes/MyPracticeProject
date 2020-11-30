package day9_PopUps_Tabs_Frame;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utilitites.WebDriverFactory;

public class PopUps_and_Alerts {
    WebDriver driver;
    @BeforeMethod
            public void setUpMethod(){
        driver= WebDriverFactory.getDriver("chrome");

    }
    @AfterMethod
            public void tearDownMethod() throws InterruptedException {
        Thread.sleep(3000);
        driver.quit();


    }
    @Test
    public void htmlPopUp(){
        driver.get("https://www.primefaces.org/showcase/ui/overlay/confirmDialog.xhtml");

        driver.findElement(By.xpath("//*[text()='Destroy the World']")).click();
        driver.findElement(By.xpath("//*[text()='No']")).click();

   }
   @Test
    public void Alerts() throws InterruptedException {
        driver.get("http://practice.cybertekschool.com/javascript_alerts");
        driver.findElement(By.xpath("//button[1]")).click();

       Alert alert=driver.switchTo().alert();
       Thread.sleep(2000);
       alert.accept();
       Thread.sleep(2000);
       driver.findElement(By.xpath("//button[2]")).click();
       Thread.sleep(2000);
       alert.dismiss();
       Thread.sleep(2000);

       driver.findElement(By.xpath("//button[3]")).click();
       Thread.sleep(2000);
       alert.sendKeys("Mike");
       Thread.sleep(2000);
       alert.accept();
   }
}
