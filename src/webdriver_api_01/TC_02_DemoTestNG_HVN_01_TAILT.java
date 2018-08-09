package webdriver_api_01;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TC_02_DemoTestNG_HVN_01_TAILT {

	WebDriver driver;

	@BeforeTest
	public void beforeTest() {
		System.out.println("Bf Test HVN_01");
	}

	@BeforeClass
	public void beforeClass() {
		System.setProperty("webdriver.chrome.driver",
				".\\driver\\chromedriver.exe");
		driver = new ChromeDriver();

		// System.setProperty("webdriver.ie.driver",
		// ".\\driver\\IEDriverServer.exe");
		// driver = new InternetExplorerDriver();

	}

	@Test
	public void TC_01_ABC() {
		// driver.get("http://tinhte.vn");
		driver.navigate().to("http://live.guru99.com");
		// driver.get("http://live.guru99.com/");
		System.out.println(driver
				.findElements(By.xpath("//a[text()='My Account']")).get(1)
				.getLocation());
	}

	@Test
	public void TC_02_ACB() {
		System.out.println("Test hook");

		WebElement element = driver.findElement(By.xpath(""));
		Select select = new Select(element);
		Assert.assertFalse(select.isMultiple());
	}

	@AfterClass
	public void afterClass() {
		driver.quit();
	}

}
