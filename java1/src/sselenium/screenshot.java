package sselenium;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class screenshot 
{
	public static void main(String[] args) throws IOException 
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		TakesScreenshot ts =(TakesScreenshot)driver;
		
		File srcfile =ts.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(srcfile, new File ("C:\\Users\\hp\\eclipse workspace1\\java1\\site.jpeg"));
		//file utils class is used for copy,move file and its jars are given by commons io
	}
}
