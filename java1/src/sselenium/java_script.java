package sselenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class java_script {

	public static void main(String[] args) 
	{
		WebDriver driver =new ChromeDriver();
		driver.get("https://demoqa.com/buttons");
		driver.manage().window().maximize();
	//	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WebElement doubleClickBtn = driver.findElement(By.xpath("//button[@id='doubleClickBtn']"));
		WebElement rightClickBtn = driver.findElement(By.xpath("//button[@id='rightClickBtn']"));
		WebElement ClickBtn = driver.findElement(By.xpath("//button[text()='Click Me']"));

		Actions act = new Actions(driver);
		
		//WebElement Buttons = driver.findElement(By.xpath("//span[text()='Buttons']"));
		//	act.moveToElement(Buttons).perform();
		
		JavascriptExecutor js= (JavascriptExecutor)driver;
		
		act.doubleClick(doubleClickBtn).perform();
		act.contextClick(rightClickBtn).perform();
	
		
		//act.click(ClickBtn).perform();
		
		js.executeScript("arguments[0].click()", ClickBtn);
		
		js.executeScript("alert('welcome to demoqa page')");
		driver.switchTo().alert().accept();
		js.executeScript("window.location ='https://www.utkarshaaacademy.com'");
		
		  //Method document.title fetch the Title name of the site. Tostring() change object to name	
		  String TitleName = js.executeScript("return document.title;").toString();			
	       System.out.println("Title of the page = "+TitleName);
	        
	      //  js.executeScript("window.scrollBy(0,600)");
	        
	        WebElement Address = driver.findElement(By.xpath("//span[contains(text(),'Infront of Vandevi')]"));
	        js.executeScript("arguments[0].scrollIntoView(true)", Address);
	        
	        WebElement AutoPrac =  driver.findElement(By.xpath("//nav[@class='menubar']//a[text()='Automation Practice']"));
	        js.executeScript("arguments[0].click()", AutoPrac);
	        
	        WebElement FirstName = driver.findElement(By.xpath("//input[@id='name-firstname']"));
	        js.executeScript("arguments[0].value='harshada'", FirstName);
		}
		
		
	}

}
