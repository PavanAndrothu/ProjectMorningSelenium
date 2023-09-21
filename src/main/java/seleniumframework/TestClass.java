package seleniumframework;

public class TestClass extends BaseClass {
	
	public void testCase1() {
		System.out.println("Test Case 1 is Executed");
	}
	public void testCase2() {
		System.out.println("Test Case 2 is Executed");
	}
	public void testCase3(String username, String password, String role) {
		System.out.println("Test Case 3 is Executed with"+username+","+password+","+role);
	}
	
	
	public static void main(String[] args) {
		
		TestClass test = new TestClass();
		
		test.startReporting();
		test.launchBrowser("Chrome");
		test.lanuchApplication("www.google.com");
		test.testCase1();
		test.closeBrowser();
		
		
		test.launchBrowser("Chrome");
		test.lanuchApplication("www.google.com");
		test.testCase2();
		test.closeBrowser();
		
		test.startReporting();
		test.launchBrowser("Chrome");
		test.lanuchApplication("www.google.com");
		test.testCase3("ABC", "9490" , "hero");
		test.closeBrowser();
		
		
		test.launchBrowser("Chrome");
		test.lanuchApplication("www.google.com");
		test.testCase3("A333", "94JDY0" , "QA");
		test.closeBrowser();
		
		test.stopReporting();
	}

}
