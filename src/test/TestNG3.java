package test;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestNG3 {
	
	
	//suppose login module for loan (CAR)
	//Dummy Test cases 
	@Test
	public void WebLoginCar() {
		System.out.println("Selenium Code!! for car loan");
	}
	
	@Test(dataProvider = "getData")
	public void MobileLoginCar(String userName, String password) 
	{
		System.out.println("Appium Code!! for login car loan dataprovider");
		System.out.println(userName);
		System.out.println(password);
	}
	
//	@Test(timeOut = 4000)
//	public void MobileSigninCar() {
//		System.out.println("Appium Code!! for signin car loan ");
//	}
//	
//	@Test(groups = {"Smoke"})
//	public void MobileSignoutCar() {
//		System.out.println("Appium Code!! for signout car loan ");
//	}
//	
//	@Test(dependsOnMethods = {"WebLoginCar","MobileSignoutCar"})
//	public void ApiLoginCar() {
//		System.out.println("Rest API Code!! for car loan ");
//	}
	
	
	/*DataProvider Annotation
	 * 
	 * */
	
	@DataProvider
	public Object[][] getData() {
		
		//suppose i have multiple test or data need to provide into my filed
		//1st P.- combination of user-name and password having (Good Credit Score)
		//2nd P.- user-name and password having (Avg. Credit Score)
		//3rd P.- user-name and password having (Fraud Credidential)
		
		// So, i have 3 combination having 2 values in each 
		
		Object[][] data = new Object[3][2]; 
		
		//1st set
		data[0][0]="FisrtSetUsername";
		data[0][1]="firstpassword";
		
		//2nd set 
		data[1][0]="SecondSetUsername";
		data[1][1]="secondPassword";
		
		//3rd set 
		data[2][0]="ThridSetUsername";
		data[2][1]="thirdPassword";
		
		return data;
		
		
	}
	

}
