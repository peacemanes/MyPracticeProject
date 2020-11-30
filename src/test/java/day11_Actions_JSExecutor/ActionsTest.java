package day11_Actions_JSExecutor;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utilitites.WebDriverFactory;

public class ActionsTest {
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
    public void Hover() throws InterruptedException {
        driver.get("http://practice.cybertekschool.com/hovers");
                Actions actions=new Actions(driver);

        WebElement img=driver.findElement(By.tagName("img"));
        Thread.sleep(2000);
        actions.moveToElement(img).perform();

        Assert.assertTrue(driver.findElement(By.linkText("View profile")).isDisplayed());
    }
    @Test
    public void DragAndDrop() {
        driver.get("https://demos.telerik.com/kendo-ui/dragdrop/index");
        Actions actions=new Actions(driver);

        WebElement source=driver.findElement(By.id("draggable"));

        WebElement target=driver.findElement(By.id("droptarget"));

        actions.pause(1000);

        driver.findElement(By.xpath("//button[.='Accept Cookies']")).click();

        actions.dragAndDrop(source,target).perform();


    }
    @Test
    public void DragAndDropChaining() {
        driver.get("https://demos.telerik.com/kendo-ui/dragdrop/index");
        Actions actions=new Actions(driver);

        WebElement source=driver.findElement(By.id("draggable"));

        WebElement target=driver.findElement(By.id("droptarget"));

        actions.pause(1000);

        driver.findElement(By.xpath("//button[.='Accept Cookies']")).click();

        //if you do chain action build method need to be added
        actions.moveToElement(source).clickAndHold().moveToElement(target).pause(2000).release().build().perform();


    }
}
