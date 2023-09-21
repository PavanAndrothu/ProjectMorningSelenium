package seleniumframework;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestNGTestClass extends TestNGBaseClass {

		@Test
		public void testCase1() {
			System.out.println("Test Case 1 is Executed");
		}
		
		@Test
		public void testCase2() {
			System.out.println("Test Case 2 is Executed");
		}
		
		@Test(dataProvider = "testCase3data")
		public void testCase3(String username, String password, String role) {
			System.out.println("Test Case 3 is Executed with"+username+","+password+","+role);
		}

		
		@DataProvider(name = "testCase3data")
		public String [][] testdata(){
			String [][] data = {{ " User22", "Paass44", "QAE"},{ " User8", "Paass554", "QAE5"}};
			return data;
		}
}
