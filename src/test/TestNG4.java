package test;

import org.testng.annotations.Test;

public class TestNG4 {

	//suppose login module for loan (HOME)
	//Dummy Test cases 
	@Test
	public void WebLoginHome() {
		System.out.println("Selenium Code!! for homeloan");
	}
	
	@Test
	public void MobileLoginHome() {
		System.out.println("Appium Code!! for homeloan");
	}
	
	@Test
	public void ApiLoginHome() {
		System.out.println("Rest API Code!! for homeloan");
	}
}
