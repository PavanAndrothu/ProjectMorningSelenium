package SeleniumWebActions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RadioButtonElement {

	public static void main(String[] args) {
		
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().deleteAllCookies();
		
		driver.get("https://www.ironspider.ca/forms/checkradio.htm");
		
		WebElement radio1 = driver.findElement(By.xpath("//*[@id=\"Content\"]/div[1]/blockquote[2]/form/input[3]"));
		
		
		
		radio1.click();
		
		driver.close();
		
		System.out.println("completed");

	}

}
