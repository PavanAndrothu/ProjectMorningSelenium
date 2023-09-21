package SeleniumWebActions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import seleniumframework.WebDriverClass;

public class TextElement {

	public static void main(String[] args) {
//      1. Launch the Application and get driver
        WebDriver driver = new WebDriverClass().launchApplicationAndGetDriver("Chrome", "https://demoqa.com/automation-practice-form");
       
//    2. Locate the page header
        WebElement header = driver.findElement(By.xpath("//div[@class='main-header']"));
       
//    3. Verify header text in the application
        String expectedHeader = "Practice Form";
        String actualHeader = header.getText();
       
        if(actualHeader.equals(expectedHeader))
            System.out.println("Header is valid");
        else
            System.out.println("Header is not valid");
       
//    4. Close the browser window
        driver.quit();


	}

}
