package day10_Syncronization;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utilitites.WebDriverFactory;

public class File_Upload {
    WebDriver driver;

    @BeforeMethod
    public void setUpMethod() {
        driver = WebDriverFactory.getDriver("chrome");

        driver.manage().window().maximize();
    }

    @AfterMethod
    public void tearDownMethod() throws InterruptedException {
        Thread.sleep(2000);
        driver.quit();
    }
    @Test
    public void FileUploadTest(){
        driver.get("http://practice.cybertekschool.com/upload");
        driver.findElement(By.name("file")).sendKeys("\"C:\\Users\\hbayg\\Desktop\\test.txt\"");
      driver.findElement(By.id("file-submit")).click();

      // String actualfilename=driver.findElement(By.id("uploaded-files")).getText();
      //  Assert.assertEquals(actualfilename,"file.txt","verify the file name");



    }
}
