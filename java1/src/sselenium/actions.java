package sselenium;

import java.awt.Desktop.Action;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class actions 
{
	
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.browserstack.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		Actions act = new Actions(driver);
		
		WebElement GetDemoBtn = driver.findElement(By.xpath("//a[@id='signupModalButton']"));
		act.moveToElement(GetDemoBtn).perform();
		
		Thread.sleep(2000);
	
		WebElement ProductBtn = driver.findElement(By.xpath("//button[@id='product-menu-toggle']"));
		// or using and :- by.xpath("//button[text()='Products' and  @id='product-menu-toggle']")  
		act.moveToElement(ProductBtn).perform();
		
		WebElement LiveBtn = driver.findElement(By.xpath("//div[@class='dropdown-link-wrapper']//div[text()=' Live ']"));
		act.clickAndHold(LiveBtn).perform();

		Thread.sleep(2000);
		
		//WebElement contactUsBtn = driver.findElement(By.xpath("//button[text()='Products' and @id='product-menu-toggle']"));
		WebElement contactUsBtn = driver.findElement(By.xpath("//button[text()=' Contact Us ']"));

		//button[text()=' Contact Us ']
		act.moveToElement(contactUsBtn).perform();
		
		Thread.sleep(2000);
		
		WebElement TermsCondition =driver.findElement(By.xpath("//li//a[text()='Terms of Service']"));
		act.moveToElement(TermsCondition).perform();
		
		driver.get("https://demoqa.com/buttons");
		driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WebElement DoubbleClickBtn = driver.findElement(By.xpath("//button[@id='doubleClickBtn']"));
		WebElement RightClickBtn = driver.findElement(By.xpath("//button[@id='rightClickBtn']"));
		WebElement ClickMeBtn = driver.findElement(By.xpath("//button[text()='Click Me']")); //here id is dynamic hence used text
		
		WebElement Buttons = driver.findElement(By.xpath("//span[text()='Buttons']"));
		act.moveToElement(Buttons).perform();
		
		act.doubleClick(DoubbleClickBtn).perform();
		act.contextClick(RightClickBtn).perform();
		act.click(ClickMeBtn).perform();
		
		driver.get("https://demoqa.com/droppable");
		
		WebElement Interactions = driver.findElement(By.xpath("//div[text()='Interactions']"));
		act.moveToElement(Interactions).perform();
		
		WebElement Source = driver.findElement(By.xpath("//div[@id='draggable']"));
		WebElement Destination = driver.findElement(By.xpath("//div[@id='draggable']//following-sibling::div"));
		act.dragAndDrop(Source, Destination).perform();
		
		act.clickAndHold(Source).perform();
		
	}
}
