package sselenium;

import java.awt.RenderingHints.Key;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyboardActions
{
	public static void main(String[] args) 
	{
		WebDriver driver= new ChromeDriver();
		driver.get("https://demoqa.com/text-box");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WebElement FullName = driver.findElement(By.xpath("//input[@id='userName']"));
		
		//regular way by xpath
	//	WebElement Email = driver.findElement(By.xpath("//input[@id='userEmail']"));
	//	WebElement CurrentAds =driver.findElement(By.xpath("//textarea[@id='currentAddress']"));
	//	WebElement PermentAds =driver.findElement(By.xpath("//textarea[@id='permanentAddress']"));
		
		// usually after xpath we use .sendKeys("Harshada " );
		
	//	FullName.sendKeys("Harshada Dhanwate");
	//	Email.sendKeys("harsh@gmail.com");
	//	CurrentAds.sendKeys("Parbhani");
	//	PermentAds.sendKeys("Pune");
		
	//	WebElement button = driver.findElement(By.xpath("//button[@id='submit']"));
	//	button.click();
		
		Actions act =new Actions(driver);
		act.sendKeys(FullName, "Harshada").perform();
		act.sendKeys(Keys.TAB).perform();
		act.sendKeys("harsh@dhanwate").perform();
		act.sendKeys(Keys.TAB).perform();
		act.sendKeys("Basmat road, Parbhani 431401").perform();
	//	act.sendKeys(Keys.TAB).perform();
	//	act.sendKeys("Manas lake, Pune").perform();
		
		//if we want to copy current address and paste it into permanent
		//first we go to field :- select it , copy it and then paste it
		
		//select text with Ctrl + a
		act.keyDown(Keys.CONTROL).perform();
		act.sendKeys("a").perform();
		act.build().perform();
		act.keyUp(Keys.CONTROL).perform();
		
		//copy a text
		act.keyDown(Keys.CONTROL).perform();
		act.sendKeys("c").perform();
		act.build().perform();
		act.keyUp(Keys.CONTROL).perform();
		
		act.sendKeys(Keys.TAB).perform();
		
		//paste a text
		act.keyDown(Keys.CONTROL).perform();
		act.sendKeys("v").perform();
		act.build().perform();
		act.keyUp(Keys.CONTROL).perform();
		
		
		
		//submit button
		act.sendKeys(Keys.TAB).perform();
		act.sendKeys(Keys.ENTER).perform();		
		
		
	}
}
