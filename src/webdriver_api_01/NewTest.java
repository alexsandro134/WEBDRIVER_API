package webdriver_api_01;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class NewTest {
  @Test
  public void f() {
	  System.out.println("Test");
  }
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("Bf Method");
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("Af Method");
  }

  @BeforeClass
  public void beforeClass() {
	  System.out.println("Bf class");
  }

  @AfterClass
  public void afterClass() {
	  System.out.println("Af class");
  }

  @BeforeTest
  public void beforeTest() {
	  System.out.println("Bf Test");
  }

  @AfterTest
  public void afterTest() {
	  System.out.println("Af Test");
  }

  @BeforeSuite
  public void beforeSuite() {
	  System.out.println("Bf suite");
  }

  @AfterSuite
  public void afterSuite() {
	  System.out.println("Af suite");
  }

}
