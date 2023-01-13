package TestNG;

import org.testng.annotations.Test;
import org.testng.annotations.DataProvider;

public class DP_test1 {
  @Test(dataProvider = "dp")
  public void add(Integer n, Integer s)
  {
	  Integer sum = n+s ;
	  System.out.println("Addition = "+sum);
  }
  
  @Test(dataProvider = "dp")
  public void diff(Integer n, Integer s)
  {
	  Integer Diff = n-s ;
	  System.out.println("Substraction = "+Diff);
  }

  @Test(dataProvider = "dp")
  public void Multi(Integer n, Integer s)
  {
	  Integer multi = n*s ;
	  System.out.println("Multiplication = "+multi);
  }
  
  @Test(dataProvider = "dp")
  public void div(Integer n, Integer s)
  {
	  Integer div = n/s ;
	  System.out.println("Division = "+div);
  }
  
  @DataProvider
  public Object[][] dp() {
    return new Object[][] {
      new Object[] { 1, 2 },
      new Object[] { 2, 3 },
      new Object[] { 4, 3 },
      new Object[] { 5, 4 },
      new Object[] { 82, 10 },
      new Object[] { 41, 31 },
      new Object[] { 24, 36 },
      new Object[] { 84, 38 },
    };
  }
}
