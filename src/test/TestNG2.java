package test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestNG2 {
	
	@Parameters({"URL","APIkey/username"})
	@Test
	public void test2(String urlName, String key) { 
		System.out.println("Test2");
		System.out.println(urlName);
		System.out.println(key);
	}
	
	//Before Test annotation use before any Testcase like cleaning database recored and re-inputing fresh data.
	@BeforeTest 
	public void preTestExecution() {
		System.out.println("Cleaning Everything before running any testcases!!");
	}
}
