package TestFrameWork_Test;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ClassTest2 {
	
	
	@BeforeClass
	public void printBeforeClass() {
		System.out.println("print before Class2");
	}
	
	@AfterClass
	public void printAfterClass() {
		System.out.println("print after Class2");
	}
	
	@BeforeMethod
	public void printBeforeMethod() {
		System.out.println("print before method in class2");
	}
	
	@AfterMethod
	public void printAfterMethod() {
		System.out.println("print after method in class2");
	}
	
	@Test(groups= {"Smoke"})
	public void AutoPrint1() {
		System.out.println("Method AutoPrint1 from ClassTest2");
	}
	
	@Test
	public void testPrint2() {
		System.out.println("Method testPrint2 from ClassTest2");
	}
	
	@Test(groups= {"Smoke"})
	public void AutoPrint3() {
		System.out.println("Method AutoPrint3 from ClassTest2");
	}
	
	@AfterTest
	public void printAfterTest() {
		System.out.println("I will print this after test");
	}
}
