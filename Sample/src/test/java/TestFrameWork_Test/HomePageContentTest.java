package TestFrameWork_Test;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import TestFrameWork_Lib.HomePage;


public class HomePageContentTest extends BaseTestClass {
	HomePage home;

	@BeforeTest
	public void beforeTestDo() {
		home = new HomePage(driver);
		System.out.println("Initialize driver before test");
	}
	
	@Test
	public void links() {
		Assert.assertTrue(home.homeLink.isDisplayed());
		Assert.assertTrue(home.vacationPackageLink.isDisplayed());		
	}

	
	
	@Test(groups= {"Smoke"})
	public void print() {
		System.out.println("This test from homePage class");	
	}
	
	@AfterTest
	public void printAfterTest() {
		System.out.println("I will print this after test");
	}
	

	@AfterSuite
	public void printBeforeSuit() {
		System.out.println("Run after suite");
	}
}
