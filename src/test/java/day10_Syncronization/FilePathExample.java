package day10_Syncronization;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class FilePathExample {
    WebDriver driver;

    @Test
    public void Test() {
        System.out.println(System.getProperty("os.name"));
        System.out.println(System.getProperty("user.dir"));

        String projectPath = System.getProperty("user.dir");
        String relativePath = "src\\test\\resources\\testfile.txt";
        String filePath = projectPath + "\\" + relativePath;
        System.out.println(filePath);

    }

    @Test

        public void FileUploadTest () {
            driver.get("http://practice.cybertekschool.com/upload");
            String projectPath = System.getProperty("user.dir");
            String relativePath = "src\\test\\resources\\testfile.txt";
            String filePath = projectPath + "\\" + relativePath;
            driver.findElement(By.name("file")).sendKeys(filePath);
            driver.findElement(By.id("file-submit")).click();

            // String actualfilename=driver.findElement(By.id("uploaded-files")).getText();
            //  Assert.assertEquals(actualfilename,"testfile.txt","verify the file name");


        }
    }
