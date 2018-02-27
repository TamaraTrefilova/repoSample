package TestFrameWork_Test;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ClassTest1 {

	
	
	@Test
	public void testPrint1() {
		System.out.println("Method testPrint1 from ClassTest1");
	}
	
	@Test
	public void testPrint2() {
		System.out.println("Method testPrint2 from ClassTest1");
	}
	
	@BeforeSuite
	public void printBeforeSuit() {
		System.out.println("Run before suite");
	}
	
	@Test (groups= {"Smoke"})
	public void testPrint3() {
		System.out.println("Method testPrint3 from ClassTest1");
	}
	
	@Test
	public void AutoPrint1() {
		System.out.println("Method AutoPrint1 from ClassTest1");
	}
	
	@BeforeTest
	public void printHelloWord() {
		System.out.println("Run Before test");
	}
	
}
