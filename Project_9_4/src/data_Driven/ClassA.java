// Data Driven Hard Coded

package data_Driven;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ClassA {
	
	@Test(dataProvider="data_1")
	public void tc(String Username, String Password)
	{
		
		System.out.println(Username);
		System.out.println(Password);
		
	}
	
	@DataProvider
	public Object[][] data_1()
	{
		
		Object[][] ob = new Object[2][2];
		ob[0][0] = "Hello";
		ob[0][1] = "How";
		ob[1][0] = "Are";
		ob[1][1] = "You";
		return ob;
		
	}
	

}
