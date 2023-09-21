package SeleniumWebActions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import seleniumframework.WebDriverClass;

public class WebTableElements {

	public static void main(String[] args) {
//      1. Launch the Application and get driver
        WebDriver driver = new WebDriverClass().launchApplicationAndGetDriver("Chrome","https://demoqa.com/webtables");
        
//         2. Get total rows
        List<WebElement> rows = driver.findElements(By.xpath("//div[@role = 'rowgroup']"));
        System.out.println("Total Rows: "+rows.size());
        
//         3. Get total Columns
        List<WebElement> columns = driver.findElements(By.xpath("//div[@role = 'columnheader']"));
        System.out.println("Total Rows: "+columns.size());
        
//         4. Get all the column headers
        System.out.println("column headers are :");
        for(int i = 0; i<columns.size();i++) {
        	columns.get(i).getText();
        }
        
//         5. Get all the data from web table
        List<WebElement> data = driver.findElements(By.xpath("//div[@role = 'gridcell']"));
        for(int i = 0; i<data.size();i++) {
        	data.get(i).getText();
        }
//         6. Get specific data from the webtable ( Ex: row 2 column 3)
        
//      6. Get specific data from the webtable (Ex: Row 2 column 3)
      WebElement spectificData = driver.findElement(Data(2,3));
      System.out.println("Row 2 column 3 Data is : "+spectificData.getText());
      
      
//         7. Close the browser
      driver.quit();
//         
       

	}
    public static By Data(int row, int column) {
        return By.xpath("//div[@class='rt-tbody']/child::div["+row+"][@role='rowgroup']//div["+column+"][@role='gridcell']");
    }
}
