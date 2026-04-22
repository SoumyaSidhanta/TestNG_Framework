package test;

import org.testng.annotations.Test;

public class TestNG3 {
	
	
	//suppose login module for loan (CAR)
	//Dummy Test cases 
	@Test
	public void WebLoginCar() {
		System.out.println("Selenium Code!! for car loan");
	}
	
	@Test
	public void MobileLoginCar() {
		System.out.println("Appium Code!! for login car loan ");
	}
	
	@Test
	public void MobileSigninCar() {
		System.out.println("Appium Code!! for signin car loan ");
	}
	
	@Test(groups = "Smoke")
	public void MobileSignoutCar() {
		System.out.println("Appium Code!! for signout car loan ");
	}
	
	@Test(groups = "Smoke")
	public void ApiLoginCar() {
		System.out.println("Rest API Code!! for car loan ");
	}
	

}
