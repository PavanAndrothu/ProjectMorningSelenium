package SeleniumWebActions;



import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import seleniumframework.WebDriverClass;

public class Dropdown_two {

	public static void main(String[] args) {
//      1. Launch the Application and get driver
		
        WebDriver driver = new WebDriverClass().launchApplicationAndGetDriver("Chrome","https://demoqa.com/automation-practice-form");
        
        
        WebElement dob = driver.findElement(By.xpath("//input[@id='dateOfBirthInput']"));
        
        JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView()", dob);
        
        dob.click();
        
        WebElement month = driver.findElement(By.xpath("//select[contains(@class,'month')]"));
        Select selectmonth = new Select(month);
        selectmonth.selectByVisibleText("January");
        
        
        WebElement year = driver.findElement(By.xpath("//select[contains(@class,'year')]"));
        Select selectyear = new Select(year);
        selectyear.selectByVisibleText("2021");
        
        WebElement date = driver.findElement(Date("June","28"));
        date.click();
        
        
        driver.close();
        System.out.println("completed");
        
	}

    public static By Date(String month, String date) {
        return By.xpath("//*[@id=\"dateOfBirth\"]/div[2]/div[2]/div/div/div[2]/div[2]/div[1]/div[6]");
    }
}
