package sselenium;

import org.openqa.selenium.WebDriver;

public class dropdownActions {

	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		// Dynamic Drop down
		driver.get("https://demoqa.com/select-menu");
		
	}

}
