package TestFrameWork_Lib;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	
	
	@FindBy (id="primary-header-home")
	public WebElement homeLink;
	
	@FindBy (id="all-in-package-header-link")
	public WebElement vacationPackageLink;
	
	
	
	
	public HomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	

}
