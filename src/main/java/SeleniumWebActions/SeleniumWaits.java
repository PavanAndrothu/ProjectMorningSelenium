package SeleniumWebActions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import seleniumframework.WebDriverClass;

public class SeleniumWaits {

	public static void main(String[] args) {
//      1. Launch the Application and get driver
      WebDriver driver = new WebDriverClass().launchApplicationAndGetDriver("Chrome","https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
     
      // Java Wait
//      Thread.sleep(5000);
     
      //Implicit Wait (Selenium)
//      driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
     
      //Explicit Wait (Selenium)
//      WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30) );
//      wait.until(ExpectedConditions.numberOfElementsToBeMoreThan(By.name("username"), 0));
     
      //Fluent Wait
      Wait<WebDriver> wait = new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(30))
              .pollingEvery(Duration.ofSeconds(5));
      wait.until(ExpectedConditions.numberOfElementsToBeMoreThan(By.name("username"), 0));

//      2. Locate the elements
      WebElement username = driver.findElement(By.name("username"));
      WebElement password = driver.findElement(By.name("password"));
      WebElement loginButton = driver.findElement(By.xpath("//button[@type='submit']"));

//      3. Login into application
      username.sendKeys("Admin");
      password.sendKeys("admin123");
      loginButton.click();
     
//      4. Get element Text

      WebElement link = driver.findElement(By.linkText("OrangeHRM, Inc"));
      System.out.println(link.getText());

     // System.out.println("done");
//      5. Close browser window
      driver.quit();
	}

}
