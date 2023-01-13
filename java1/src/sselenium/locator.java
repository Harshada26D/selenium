package sselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByPartialLinkText;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class locator
{
	public static void main(String[] args) 
	{
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://www.utkarshaaacademy.com");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.partialLinkText("Automation")).click();
		
		driver.findElement(By.id("name-firstname")).sendKeys("Harshada");
		
		driver.findElement(By.id("name-lastname")).sendKeys("Dhanwate");
		driver.findElement(By.className("coblocks-field--telephone")).sendKeys("9404515607"); 
		//when using classname as attribute then there should not be any space in orignal classname. 
		//like in above case,class="coblocks-field coblocks-field--telephone" because of space between field and coblocks
		//use partial value
		
		driver.findElement(By.name("field-email[value]")).sendKeys("harshada@gmail.com");
		
		driver.get("https://www.facebook.com");
		
		driver.findElement(By.tagName("button")).click();
		
		
		
		
	}
}
