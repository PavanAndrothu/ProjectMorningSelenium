package seleniumframework;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;

public class TestNGBaseClass {

		@BeforeSuite
		public void startReporting() {
			System.out.println("Report genearate and print process started");
		}
		@AfterSuite
		public void stopReporting() {
			System.out.println("Report process stopped");
		}
		
		
		public void launchBrowser(String browser) {
			System.out.println(browser+"is lanched");
		}
		
		@AfterMethod
		public void closeBrowser() {
			System.out.println("browser is closed");
		}
		public void lanuchApplication(String URL) {
			System.out.println("Application is launched with "+ URL);
		}

		@BeforeMethod
		@Parameters({"browser", "url1"})
		public void setupApplication(String browser, String URL) {
		 launchBrowser(browser);
		 lanuchApplication(URL);
	 }
}
