package TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class DP_Test3 {
  
	public WebDriver driver;
	
	  @Test(dataProvider = "FBLogin",dataProviderClass = DP_Test4.class)
	  public void FacebookLogin(String username, String password)
	  {
		 driver = new ChromeDriver();
		 driver.get("https://www.facebook.com");
		 WebElement Username =driver.findElement(By.xpath("//input[@id='email']"));
		 WebElement Password =driver.findElement(By.xpath("//input[@id='pass']"));
		 WebElement LoginBtn =driver.findElement(By.xpath("//button[@name='login']"));

		 
		 Username.sendKeys(username);
		 Password.sendKeys(password);
		 LoginBtn.click();
		 
	  }
}
