package com.snapdeal.GitProject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class GitDemo {
	
	WebDriver driver;
	
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("Before method");
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("after method");
  }

  @BeforeClass
  public void beforeClass() {
	  System.out.println("before class");
	  driver	=	new FirefoxDriver();
  }

  @AfterClass
  public void afterClass() {
	  System.out.println("after class");
	  driver.quit();
  }

  @BeforeTest
  public void beforeTest() {
	  System.out.println("before test");
  }

  @AfterTest
  public void afterTest() {
	  System.out.println("after test");
  }
  
  @Test
  public void testGitDemo()
  {
	  driver.get("www.snapdeal.com");
	  System.out.println(driver.getTitle());
  }

}
