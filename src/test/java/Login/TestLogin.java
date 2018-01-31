package Login;

import org.testng.annotations.Test;

public class TestLogin {
	
	@Test(priority = 1)
	void ValidUser()
	{
		System.out.println("hello from TestLogin ");
	}
	
	
	@Test(priority = 2)
	void InValidUser()
	{
		System.out.println("I'm invalid user for TestLogin ");
	}	

}
