package day9_PopUps_Tabs_Frame;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utilitites.WebDriverFactory;

import java.awt.dnd.DragSourceDragEvent;
import java.util.Set;

public class Multiple_Windows {
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
    public void switchWindowsTest(){
        driver.get("http://practice.cybertekschool.com/windows");

        System.out.println("Before clicking the link :"+driver.getTitle());
        driver.findElement(By.linkText("Click Here")).click();
        System.out.println("After clicking the link :"+driver.getTitle());
        //driver.switchTo().window();

        String currentWindowHandle=driver.getWindowHandle();
        System.out.println("currentWindowHandle = " + currentWindowHandle);

        Set<String> handles=driver.getWindowHandles();
        System.out.println(handles.size());

        for (String handle : handles) {
            if(!currentWindowHandle.equals(handle)){
                driver.switchTo().window(handle);
                System.out.println(handle);
            }

        }

        System.out.println("After switching "+driver.getTitle());
        System.out.println(driver.findElement(By.tagName("h3")).getText());

    }
    @Test
    public void moreThanTwoWindow(){
        driver.get("http://practice.cybertekschool.com/windows");
        String targetWindowTitle="New Window";
        driver.findElement(By.linkText("Click Here")).click();
        System.out.println(driver.getWindowHandles().size());

        Set<String> windoesHandles=driver.getWindowHandles();
        for (String handle : windoesHandles) {
            driver.switchTo().window(handle);
            if(driver.getTitle().equals(targetWindowTitle)){
                break;
            }

        }
        System.out.println("After loop title is "+driver.getTitle());




    }
}
