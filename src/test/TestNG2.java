package test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNG2 {
	
	@Test
	public void test2() {
		System.out.println("Test2");
	}
	
	//Before Test annotation use before any Testcase like cleaning database recored and re-inputing fresh data.
	@BeforeTest 
	public void preTestExecution() {
		System.out.println("Cleaning Everything before running any testcases!!");
	}
}
