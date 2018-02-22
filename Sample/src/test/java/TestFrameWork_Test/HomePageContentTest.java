package TestFrameWork_Test;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import TestFrameWork_Lib.HomePage;

public class HomePageContentTest extends BaseTestClass {
	HomePage home;

	@BeforeTest
	public void beforeTestDo() {
		home = new HomePage(driver);
	}

	
	@Test
	public void links() {
		Assert.assertTrue(home.homeLink.isDisplayed());
		Assert.assertTrue(home.vacationPackageLink.isDisplayed());		
	}

}
