package TestNGTests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DependencyExample {

	
	@Test
	public void serverStartedOk() {  
		
		System.out.println("Login Passed");
		Assert.assertEquals(false, true);
		
	}
	
	
	
	@Test(dependsOnMethods = { "serverStartedOk" }, alwaysRun =true)
	public void ProductTest() {
		
		
		System.out.println("Product test case");
		
	}

}
