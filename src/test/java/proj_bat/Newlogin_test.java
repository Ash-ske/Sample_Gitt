package proj_bat;

import org.testng.Assert;
import org.testng.annotations.Test;

import javaPack.App_Test;

public class Newlogin_test {
	@Test
	  public void testlogin1() 
	  {
		 App_Test obj=new App_Test();
		 Assert.assertEquals(0,obj.userLogin("abc","abc123"));
		 
	  }
	@Test
	  public void testlogin2() 
	  {
		  App_Test obj=new App_Test();
			 Assert.assertEquals(1,obj.userLogin("abc","abc@123"));
	  }
}
