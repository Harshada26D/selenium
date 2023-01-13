package sselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class parent_child 
{
	public static void main(String[] args) 
	{
		WebDriver driver =new ChromeDriver();
		
		driver.get("https://utkarshaaacademy.com");
		driver.manage().window().maximize();
		
		// css selector with parent child relationship
		
		driver.findElement(By.cssSelector("div.theme-menu>nav>ul>li>a[title='Automation Practice' ")).click();
		
		driver.findElement(By.cssSelector("input#name-firstname")).sendKeys("Harshada"); //id= #
		
		// driver.findElement(By.cssSelector("input#name-lastname")).sendKeys("Dhanwate");
		
		//driver.findElement(By.cssSelector("input[id=name-lastname]")).sendKeys("Dhanwate");
		
		driver.findElement(By.cssSelector("input[class='coblocks-field coblocks-field--name last']")).sendKeys("Dhanwa");
		
		
		//syntex of input = input[id/class/name='    '] or "input.    "   or   "input#      "   
		//when dot(class)  attribute is used space between word is not allowed like in above use dot(.) and class word is used space is allowes

		driver.findElement(By.cssSelector("input.coblocks-field.coblocks-field--name.last")).sendKeys("Dhanwate");

		//driver.findElement(By.cssSelector("input[class='coblocks-field.coblocks-field--telephone']")).sendKeys("9404515");

		driver.findElement(By.cssSelector("input[class='coblocks-field coblocks-field--telephone']")).sendKeys("9404515");
		
		// combining attribute -  eg:- class and id
		
		//input#email.coblocks-field   = syntex // input(id)email(class)coblocks-field
		
		//driver.findElement(By.cssSelector("input#email.input#email.coblocks-field")).sendKeys("harsh@gmail.com");
		//                               OR
		driver.findElement(By.cssSelector("input.coblocks-field#email")).sendKeys("harsh@gmail.com");
		
		//id with other attribute
		
			//driver.findElement(By.cssSelector("input#email[type='email']")).sendKeys("ravinangre@gmail.com");

		//parent child hirarchy
		 
		//when the element is dynamic i.e changing we have to use parent child 
		
		// css selector with parent child relationship
		
		driver.get("https://www.facebook.com");
		
		//driver.findElement(By.cssSelector("div._6ltg>button")).click();
		// or
		//driver.findElement(By.cssSelector("div>button")).click(); without class name
		
		driver.get("https://demoqa.com/select-menu");
		
		//syuntex for nth-child tag is " parent css locator> child HTML tag : nth-of-type(index)or(5)or(9)or()
		
		driver.findElement(By.cssSelector("select>option:nth-of-type(5)")).click();// purple colour
		
		// select tag it is static and div is dynamic
		
		driver.get("https://demoqa.com/select-menu");
		
		driver.findElement(By.cssSelector("select>option:nth-of-type(9)")).click();
		
		driver.findElement(By.cssSelector("div#withOptGroup>div>div.css-1hwfws3")).click();
		
		driver.findElement(By.cssSelector("div#withOptGroup>div>div>div:nth-of-type(3)")).click();
		
		
	}
}
