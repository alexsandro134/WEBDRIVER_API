package webdriver_api;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class HVN_01_TAILT {

	WebDriver driver;

	@BeforeClass
	public void beforeClass() {
		// System.setProperty("webdriver.chrome.driver",
		// ".\\driver\\chromedriver.exe");
		// driver = new ChromeDriver();

		System.setProperty("webdriver.ie.driver",
				".\\driver\\IEDriverServer.exe");
		driver = new InternetExplorerDriver();
		
	}

	@Test
	public void TC_01_ABC() {
		driver.get("http://tinhte.vn");
	}

	@Test
	public void TC_02_ACB() {
		System.out.println("Test hook");
	}

	@AfterClass
	public void afterClass() {
		driver.quit();
	}

}
