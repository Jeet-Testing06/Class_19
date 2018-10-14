package org.testing.assertions;

public class Assertion_E {
	
	public static void assert1(String exp, String act) {
		
		if (exp.equals(act))
		{
			System.out.println("Matches");
		}
		
		else
			System.out.println("Not Matches");
		
	}
	
	

}
