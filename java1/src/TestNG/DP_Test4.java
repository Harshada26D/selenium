package TestNG;

import org.testng.annotations.Test;
import org.testng.annotations.DataProvider;

public class DP_Test4 {
  
	@DataProvider
	  public Object[][] FBLogin() {
	    return new Object[][] {
	      new Object[] { "harshdhanwate@gmail.com", "harsh2696@#*" },
	      new Object[] { "harsh26@gmail.com", "12354" },
	      new Object[] { "harshdhanwat@gmail.com", "ha2696@#*" },
	      new Object[] { "harsh@gmail.com", "harsh96@#*" },
	      new Object[] { "hdhanwate@gmail.com", "harshd2696@#*" },
	      new Object[] { "harshd@gmail.com", "h2696@#*" },
	      new Object[] { "harshDhanwate@gmail.com", "harshD2696@#*" },
	      new Object[] { "Harshdhanwate@gmail.com", "har2696@#*" },
	    } ;
 
	    
	}
}