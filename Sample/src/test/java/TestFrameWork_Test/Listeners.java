package TestFrameWork_Test;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.google.common.io.Files;

import TestFrameWork_Lib.GetScreenshote;

public class Listeners  implements ITestListener{
	WebDriver driver;
	public void onTestStart(ITestResult result) {
		// TODO Auto-generated method stub
		
	}
// Executes only when test successfully ran, after every test
	public void onTestSuccess(ITestResult result) {
		// TODO Auto-generated method stub
		System.out.println("____________________________________________________________________________");
		System.out.println("Test success");
	}

	// Executes only when test fails
	public void onTestFailure(ITestResult result) {
		//screenshot code
		//print response when API is failed
		 try {
	           GetScreenshote.capture(result.getName());
	        } catch (IOException e) {
	            // TODO Auto-generated catch block
	            e.printStackTrace();
	        }
		
	}

	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
		
	}

	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub
		
	}

}
