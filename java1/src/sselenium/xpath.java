package sselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpath 
{
	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://utkarshaaacademy.com");
		
		driver.manage().window().maximize();
		
		
		//Absolute Xpath  {it starts from html and single /}
		
		// Syntex for xpath 
		
		
		driver.findElement(By.xpath("/html/body/div[1]/header/div/div[3]/div/div/div[2]/div/nav/ul/li[5]/a")).click();
		
		
		driver.findElement(By.xpath("/html/body/div[1]/div/section/div/div/div[1]/div/form/div/div[1]/div[1]")).sendKeys("Harshada");
		
		
		//Relative { it starts from current tag and double // }
		//syntex Xpath
		//tagname[@attribute='attribute value']
		
		//driver.findElement(By.xpath("//input[@id='name-lastname']")).sendKeys("Nangare");
		
		//driver.findElement(By.xpath("//*[@id=\"last-firstname\"]")).sendKeys("Dhanwate");
		driver.findElement(By.xpath("//*[@id=\"name-lastname\"]")).sendKeys("Dhanwate");
		driver.findElement(By.xpath("//*[@id=\"phone\"]")).sendKeys("9404515607");
		driver.findElement(By.xpath("//input[@id='coblocks-field coblocks-field--email']")).sendKeys("harshdhanwate@gmail.com");
		driver.findElement(By.xpath("//input[@id='date']")).sendKeys("4-12-2022");
		driver.findElement(By.xpath("//input[@id='time-afternoon']")).click();
		
		
		
	}
}
