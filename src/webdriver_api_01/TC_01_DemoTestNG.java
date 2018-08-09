package webdriver_api_01;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TC_01_DemoTestNG {

	// @BeforeTest
	// public void beforeTest() {
	// System.out.println("Bf Test DemoTestNG");
	// }

	@Parameters({ "browser", "username" })
	@BeforeClass
	public void beforeClass(String browserName, String username) {

		System.out.println(browserName);
		System.out.println(username);
		// WebDriver driver = ChromeDriver();
	}

	//  2 3  1 4
	 @Test()
	 public void f2() {
	 System.out.println("f2");
	 }

	 @Test
	 public void f3() {
	 System.out.println("f3");
	 }

	 @Test(dependsOnMethods = "f2")
	 public void f1() {
		 System.out.println("f1");
	 }
	 
	 @Test()
	 public void f4() {
		 System.out.println("f4");
	 }
	 
	// @Test
	// public void f4() {
	// System.out.println("f4");
	// }

	@AfterClass
	public void afterClass() {
	}

}
