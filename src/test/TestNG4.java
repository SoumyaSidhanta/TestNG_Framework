package test;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class TestNG4 {

	@BeforeClass
	public void Bc() {
		System.out.println("Executing before any method or test in the class");
	}
	
	@AfterClass
	public void Ac() {
		System.out.println("Executing after all method or test in the class");
	}
	//suppose login module for loan (HOME)
	//Dummy Test cases 
	@Test
	public void WebLoginHome() {
		System.out.println("Selenium Code!! for homeloan");
	}
	
	@Test(enabled = false) //skip if any test having error
	public void MobileLoginHome() {
		System.out.println("Appium Code!! for homeloan");
	}
	
	@BeforeMethod
	public void Bm() {
		System.out.println("Run before each methodin that specific class");
	}
	
	@AfterMethod
	public void  Am() {
		System.out.println("run after each method in that specific class");
	}
	
	@Test
	public void ApiLoginHome() {
		System.out.println("Rest API Code!! for homeloan");
	}
	
	@BeforeSuite
	public void BeforeSut() {
		System.out.println("At the Top");
	}
}
