package sselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpath_axes
{
	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
		
		driver.manage().window().maximize();
		
		// preceding & Following
		driver.findElement(By.xpath("//input[@id='pass']//preceding::input[1]")).sendKeys("harshdhanwate@gmail.com");
		
		driver.findElement(By.xpath("//input[contains(@id,'email')]//following::input[1]")).sendKeys("1254851");
		
		
	    driver.findElement(By.xpath("//input[contains(@id,'email')]//following::button")).click();
		
		
		
		// ancestor
	    
		
		
	}
}
