package TestNGTests;

import org.testng.annotations.Test;

public class GroupingExample {
	
	@Test(groups = {"Regression","Smoke"})
	public void test() {
		System.out.println("Test1");
	}
	
	@Test(groups = {"Smoke"})
	public void test_2() {
		System.out.println("Test2");
	}
	
	
	@Test(groups = {"Regression"})
	public void test_3() {
		System.out.println("Test3");
	}
	
	@Test(groups = {"Regression"})
	public void test_4() {
		System.out.println("Test4");
	}

}
