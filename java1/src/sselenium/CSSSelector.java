package sselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CSSSelector
{
	public static void main(String[] args) 
	{
		WebDriver driver =new ChromeDriver();
		
		driver.get("https://utkarshaaacademy.com");
		driver.manage().window().maximize();
		
		driver.findElement(By.partialLinkText("Automation")).click();
		
		driver.findElement(By.cssSelector("input#name-firstname")).sendKeys("Harshada");
		// ' # 'is used instead of id and ' . ' is used for class
		
		driver.findElement(By.cssSelector("input#name-lastname")).sendKeys("Dhanwate");
		
		driver.findElement(By.cssSelector("input.coblocks-field--telephone")).sendKeys("9404515607");
		
		driver.findElement(By.cssSelector("input[name='field-email[value]']")).sendKeys("harshdanwte@gmail.com");
		//syntex is "input[name='    ']"
		
		driver.findElement(By.cssSelector("input[name='field-date[value]']")).sendKeys("21-12-2022"); //problem

		driver.findElement(By.cssSelector("button[class=wp-block-button__link]")).click();
	}
}
