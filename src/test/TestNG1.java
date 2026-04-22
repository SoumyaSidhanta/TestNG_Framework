package test;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class TestNG1 {

	/*@AfterTest annotation is used to mark a method that should be executed after all the test methods 
		belonging to the classes inside a specific <test> tag in the testng.xml file have run.
	
	->Cleanup Tasks: It is primarily used for post-test cleanup operations, such as:
		Closing browser instances (e.g., in Selenium).
		Closing database connections.
		Generating output reports or deleting temporary files (like cookies).
	 */
	
	@AfterTest
	public void lastExc() {
		System.out.println("Exceuted in Last!!");
	}
	
	@AfterSuite
	public void AfterSut() {
		System.out.println("At the bottom");
	}
	
	@Test(groups = "Smoke")
	public void demo() {
		System.out.println("Rohit");
	}
	
	@Test
	public void test1() {
		System.out.println("Test1");
	}

} 
