package day12_WebTables;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utilitites.WebDriverFactory;

import java.util.List;

public class WebTabeExamples {
    WebDriver driver;

    @BeforeMethod
    public void setUpMethod() {
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.get("http://practice.cybertekschool.com/tables");
    }

    @AfterMethod
    public void tearDownMethod() throws InterruptedException {
        Thread.sleep(2000);
        driver.quit();
    }

    @Test
    public void printTable() {
        WebElement table = driver.findElement(By.id("table1"));
        String wholeTable = table.getText();
        System.out.println(wholeTable);

        Assert.assertTrue(wholeTable.contains("jsmith@gmail.com"), "verify that jsmith@gmail.com is in the table");

    }

    @Test
    public void getAllHeaders() {
        List<WebElement> headers=driver.findElements(By.xpath("//table[@id='table1']//th"));
        System.out.println("Number of Columns "+headers.size());
        for (WebElement header : headers) {
            System.out.println(header.getText());
        }
       List<WebElement>allRowsWithoutHeader=driver.findElements(By.xpath("//table[@id='table1']/tbody/tr"));
        System.out.println("allRowsWithoutHeader = " + allRowsWithoutHeader.size());
        List<WebElement>allRowsWithHeader=driver.findElements(By.xpath("//table[@id='table1']//tr"));

        System.out.println("allRowsWithHeader = " + allRowsWithHeader.size());
    }
    @Test
    public void getRow(){
        //WebElement secondRow=driver.findElement(By.xpath("//table[@id='table1']/tbody/tr[2]"));
       // System.out.println(secondRow.getText());
        List<WebElement>allRows=driver.findElements(By.xpath("//table[@id='table1']/tbody/tr"));
        for (int i = 1; i <= allRows.size() ; i++) {
            String rowXpath = "//table[@id='table1']/tbody/tr[" + i + "]";
            System.out.println("rowXpath = " + rowXpath);
            WebElement singleRow=driver.findElement(By.xpath(rowXpath));
            driver.findElement(By.xpath(rowXpath));
            System.out.println(singleRow.getText());
        }
    }
    @Test
    public void getAllCellInRow(){
       List<WebElement> allCellsInOneRow=driver.findElements(By.xpath("//table[@id='table1']/tbody/tr[2]/td"));
        for (WebElement cell:allCellsInOneRow) {
            System.out.println(cell.getText());



        }
    }
    @Test
    public void getSingleCellByIndex(){
        WebElement singleCell=driver.findElement(By.xpath("//table[@id='table1']/tbody/tr[3]/td[2]"));
        System.out.println(singleCell.getText());
    }
    @Test
    public void numberOfRows(){
        int rowNumber=getNumberOfRows();
        int columnNumber=getNumberOfColumns();
    }
    private int getNumberOfRows(){
        List<WebElement> allRows=driver.findElements(By.xpath("//table[@id='table1']/tbody/tr"));
        return allRows.size();
    }
    private int getNumberOfColumns(){
        List<WebElement> allColumns=driver.findElements(By.xpath("//table[@id='table1']//th"));
        return allColumns.size();
    }
    @Test
    public void printAllCellByIndex(){
        int rowNumber=getNumberOfRows();
        int columnNumber=getNumberOfColumns();

        for (int i = 1; i <=rowNumber;i++) {
            for (int j = 1; j <=columnNumber ; j++) {

                String xpath="//table[@id='table1']/tbody/tr["+i+"]/td["+j+"]";
                System.out.println(xpath);

                WebElement singleCell=driver.findElement(By.xpath(xpath));
                System.out.println(singleCell.getText());


            }
            
        }

    }
    @Test
    public void getSpecificCellByIndex(){
        int r=2;
        int c=3;

        String xpath="//table[@id='table1']/tbody/tr["+r+"]/td["+c+"]";

        WebElement singleCell=driver.findElement(By.xpath(xpath));
        System.out.println(singleCell.getText());

    }
    //Homework:Create a methid that accept accepts row and column number,and returns the cell as webelement
@Test
    public void getCellAnotherRelationInSameRow(){
        String firstName="Tim";
        String xpath="//table[@id='table1']//td[.='"+firstName+"']/../td[3]";
        WebElement email=driver.findElement(By.xpath(xpath));
    System.out.println(email.getText());

}


    //table[@id='table1']//td[.='Tim']/../td
}










