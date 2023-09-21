package SeleniumWebActions;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import seleniumframework.WebDriverClass;

public class ScreenshotOfWindow {

	static WebDriver driver;
	
	public static void main(String[] args) throws IOException {
//      1. Launch the Application and get driver
      driver = new WebDriverClass().launchApplicationAndGetDriver("Chrome","https://www.sololearn.com/home");


//      2. Locate the element to upload button label
      WebElement logo = driver.findElement(By.xpath("//div[@class = 'sl-navbar__main-logo sl-navbar__main-logo--desktop']"));
      
      
//    3. Take window Screenshot
    takewindowscreenshot("ToolsQA_Window");
   
//    4. Take  Element Screenshot
    takeelementscreenshot(logo, "Logo");
   
//    5. Close the window
    driver.quit();
      

	}
	
	public static void takewindowscreenshot(String name) throws IOException {
		File screenshotFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		String path = System.getProperty("user.dir")+"\\Screen\\"+name+".png";
		FileUtils.copyFile(screenshotFile, new File(path));
	}
	public static void takeelementscreenshot(WebElement element ,String name) throws IOException {
        File screenshotFile = element.getScreenshotAs(OutputType.FILE);
        String path = System.getProperty("user.dir")+"\\Screen\\"+name+".png";
        FileUtils.copyFile(screenshotFile, new File(path));     
		}
}
