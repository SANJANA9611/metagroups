package Basic;

import org.testng.annotations.Test;

public class groups {
	@Test(groups= {"sanity"})
	public void test1()
	{
		System.out.println("sanity process");
	}
	@Test(groups= {"sanity,regression"})
	public void test2()
	{
		System.out.println("sanity,regression process");
	}
	@Test(groups= {"regression"})
	public void test3()
	{
		System.out.println("regression process");
	}

}
