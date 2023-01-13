package sselenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class frame {

	public static void main(String[] args) 
	{
		 WebDriver driver= new ChromeDriver();
		 driver.get("https://demoqa.com/frames");
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		 
		 
		//frame can be used in 3 ways as index,name or id,web element
		 
		 //switch to frame using index
		 //but problem with index is it is dynamic
		 driver.switchTo().frame(2);
		 
		 //switch to frame using name or id
		 //driver.switchTo().frame("frame1");
		 
		 //switch to using web element
		 WebElement Frame1= driver.findElement(By.xpath("//iframe[@id='frame1']"));
		 
		 driver.switchTo().frame(Frame1);
		 
		String FrameText= driver.findElement(By.xpath("//h1[@id='sampleHeading']")).getText();
		
		System.out.println(FrameText);
		
		driver.get("https://demo.guru99.com/test/guru99home/");
		
		
		
	}

}
