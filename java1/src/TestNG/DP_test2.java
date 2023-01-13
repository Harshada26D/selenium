package TestNG;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.DataProvider;

public class DP_test2 {
	public WebDriver driver;
	
  @Test(dataProvider = "FBLogin")
  public void FacebookLogin(String username, String password)
  {
	 driver = new ChromeDriver();
	 driver.get("https://www.facebook.com");
	 Reporter.log("Chrome sucessfully started");
	 WebElement Username =driver.findElement(By.xpath("//input[@id='email']"));
	 WebElement Password =driver.findElement(By.xpath("//input[@id='pass']"));
	 WebElement LoginBtn =driver.findElement(By.xpath("//button[@name='login']"));

	 
	 Username.sendKeys(username);
	 Password.sendKeys(password);
	 LoginBtn.click();
	 Reporter.log("Sucessfully Enter username and password and click on Login button");
  }

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

    };
  }
}
