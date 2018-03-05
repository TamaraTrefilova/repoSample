package TestFrameWork_Test;

import org.testng.annotations.BeforeClass;

import org.testng.annotations.BeforeSuite;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ClassTest1 {

	@Test(enabled = false)
	public void testPrint1() {
		System.out.println("Method testPrint1 from ClassTest1");
	}

	@Test(dataProvider = "getData")
	public void testForDataProvider(String userName, String name) {
		System.out.println("Method testDataProvider from ClassTest1");
		System.out.println(userName);
		System.out.println(name);
	}

	@Parameters({ "Family", "Animals" })
	@Test
	public void testPrint(String family, String animals) {
		System.out.println("Method testPrintParameters from XML for ClassTest1");
		System.out.println(family);
		System.out.println(animals);
	}

	@BeforeSuite
	public void printBeforeSuit() {
		System.out.println("Run before suite");
	}

	@Test(timeOut = 1000)
	public void testPrint3() {
		System.out.println("Method testPrint3 from ClassTest1");
	}

	@Test(dependsOnMethods = { "testPrint3" })
	public void AutoPrint1() {
		System.out.println("Method AutoPrint1 from ClassTest1");
	}

	@DataProvider
	public Object[][] getData() {
		int lines = 30;
		Object[][] data = new Object[lines][2];
		for (int i = 0; i < lines; i++) {
			data[i][0] = i + " username";
			data[i][1] = i + " name";
		}
		return data;
	}

	@BeforeClass
	public void printHelloWord() {
		System.out.println("Run Before ClassTest1");
	}

}
