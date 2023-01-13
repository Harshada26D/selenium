package sselenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class navigation_demo 
{
	public static void main(String[] args) 
	{
		WebDriver driver= new ChromeDriver();
		driver.get("https://utkarshaaacademy.com");
		
		// we can also do by get command but history is not saved like navigate and also full page is loded in get not in navigate
		//driver.get("https://facebook.com")
		
		
		//Navigation command
		driver.navigate().to("https://facebook.com");
		
		driver.navigate().back();
		driver.navigate().forward();
		
	

		driver.navigate().refresh();
		driver.manage().window().maximize();
		
		driver.close();// to close the current window
		
		//driver.quit();//to close multiple windows
		
		
	}
}
