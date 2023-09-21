package seleniumframework;

public class BaseClass {

		public void startReporting() {
			System.out.println("Report genearate and print process started");
		}
		
		public void stopReporting() {
			System.out.println("Report process stopped");
		}
		
		public void launchBrowser(String browser) {
			System.out.println(browser+"is lanched");
		}
		public void closeBrowser() {
			System.out.println("browser is closed");
		}
		public void lanuchApplication(String URL) {
			System.out.println("Application is launched with "+ URL);
		}
		
}
