package TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class NewTest 
{
	public WebDriver driver;
	
	@Test
  public void harshada() 
  {
	System.out.println("hi i am harshada");
	  driver= new ChromeDriver();
	  driver.get("https://www.facebook.com");
  }
}
