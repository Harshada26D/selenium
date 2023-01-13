package TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class second
{
	public WebDriver driver;
	
	@Test
	public void launchTest()
	{
		driver = new ChromeDriver();
	 	driver.get("https://www.facebook.com");
	}
	@Test
	public void loginTest()   // alphabetical order is important for method (upper class letters are given priorities)
	{
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("harshdhanwate@gmail.com");
		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("harshada");
		driver.findElement(By.tagName("button")).click();

	}
	
}
