package TestFrameWork_Lib;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.Reporter;

import com.google.common.io.Files;

import TestFrameWork_Test.BaseTestClass;

public class GetScreenshote extends BaseTestClass {

	public static void capture(String screenshoteName) throws IOException {
		String timeStamp;
		File screenShotName;
		File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		//The below method will save the screen shot in d drive with name "screenshot.png"
		timeStamp = new SimpleDateFormat("yyyyMMdd_HHmmss").format(Calendar.getInstance().getTime()); 
		screenShotName = new File("C:\\work\\git\\TestScreenShots\\"+timeStamp+".png");
		Files.copy(scrFile, screenShotName);
		String filePath = screenShotName.toString();
		String path = "<img src=\"file://"+filePath+ "\" alt=\"\"/>";
		Reporter.log(path);
	}

}
