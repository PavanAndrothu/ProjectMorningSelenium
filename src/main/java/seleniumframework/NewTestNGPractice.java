package seleniumframework;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class NewTestNGPractice {
	
	
	@Test
	public void TestGoogle() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		driver.findElement(By.name("q")).sendKeys("instagram", Keys.ENTER);
		System.out.println(driver.getTitle());
		Thread.sleep(5000);
		System.out.println("this was done");
		driver.quit();
	}
	
	@Test
	public void Testfacebook() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://ui.freecrm.com/");
		driver.findElement(By.name("email")).sendKeys("pavantesting99", Keys.ENTER);
		System.out.println(driver.getTitle());
		Thread.sleep(5000);
		System.out.println("this was done22");
		driver.quit();
	}

}
