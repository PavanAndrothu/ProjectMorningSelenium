package SeleniumWebActions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import seleniumframework.WebDriverClass;

public class DropdownandCalender {

	public static void main(String[] args) {
//      1. Launch the Application and get driver
        WebDriver driver = new WebDriverClass().launchApplicationAndGetDriver("Chrome", "https://demoqa.com/automation-practice-form");
       
//    2. Locate the dob element
        WebElement dob = driver.findElement(By.id("dateOfBirthInput"));

//    3.click on dob and open calender
        dob.click();
        
//    4. select the month as january
        WebElement month = driver.findElement(By.xpath("//select[contains(@class,'month')]"));
        Select selectMonth = new Select(month);
        selectMonth.selectByVisibleText("January");
        
//    5. select the year as 2020
        WebElement year = driver.findElement(By.xpath("//select[contains(@class,'year')]"));
        Select selectYear = new Select(year);
        selectYear.selectByVisibleText("2020");
        
//      6. Select date as '1st January'
      WebElement date = driver.findElement(Date("January","1"));
      date.click();
     
//      7. Close browser window
   //   driver.quit();

	}
    public static By Date(String month, String date) {
        return By.xpath("//div[contains(@aria-label,'"+month+"') and text()='"+date+"']");
    }
}
