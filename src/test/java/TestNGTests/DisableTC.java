package TestNGTests;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

//@Ignore
public class DisableTC {

	@BeforeClass
	public void beforeClass() {
		System.out.println("clciking on product");
	}
	//@Test(enabled=false)
	@Test
	public void test() {
		System.out.println("Test1");
	}
	
	//@Ignore
	@Test
	public void test2() {
		System.out.println("Test2");
	}
	
	@Test
	public void test3() {
		System.out.println("Test3");
	}
}
