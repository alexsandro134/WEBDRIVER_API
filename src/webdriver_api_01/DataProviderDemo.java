package webdriver_api_01;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderDemo {
	@Test(dataProvider = "dp")
	public void f(Integer n, String s) {
		System.out.println(n);
		System.out.println(s);
	}

	@DataProvider(name = "TestDataProvider")
	public Object[][] dp() {
		return new Object[][] { 
				new Object[] { 1, "a" },
				new Object[] { 2, "b" }, };
	}
}
