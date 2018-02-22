

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class PrepWork {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:/Drivers/chromedriver_win32/chromedriver.exe");
		ChromeOptions chromeOptions = new ChromeOptions();
		chromeOptions.addArguments("--start-maximized");
		WebDriver driver = new ChromeDriver(chromeOptions);
		driver.get("https://www.expedia.com/");
		WebElement homeLink = driver.findElement(By.id("primary-header-home"));
		homeLink.click();
		System.out.println(driver.getTitle());
		driver.getTitle();
		
	}

}
