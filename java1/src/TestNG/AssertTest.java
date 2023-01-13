package TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class AssertTest {
	public WebDriver driver;
	public SoftAssert sassert;

	
  @Test(priority=1)
  public void openBrowser()
  {
	  driver= new ChromeDriver();
	  driver.get("https://www.utkarshaaacademy.com");
	  System.out.println("first test pass");
	  
  }
  @Test(priority=2)
  public void checkTitle()
  {
	  	String Expected_title= "Utkarshaa academy";
	  	String Actual_title=driver.getTitle();
	  	Assert.assertEquals(Expected_title, Actual_title);
	  	
	  	 sassert = new SoftAssert();
		 sassert.assertEquals(Actual_title, Expected_title);
	  	
	  	System.out.println("Second test pass");
	  	sassert.assertAll();
	  	
  }
  @Test(priority=3)
  public void checkLogo()
  {
	  WebElement UT_Logo= driver.findElement(By.xpath("//div[@class='av-column-2 my-auto']//img[@class='custom-logo']"));
	  Assert.assertEquals(UT_Logo.isDisplayed(), true);
	  String Logo_Px=UT_Logo.getCssValue("max_width");
	  System.out.println(UT_Logo.getCssValue("max_width"));
	  Assert.assertEquals(Logo_Px, "140px");
	  System.out.println("Third Test Pass");
	  
  }
}
