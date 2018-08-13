 package CheckGmail;

import java.util.List;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Check 
{
	WebDriver driver;
	
	public void check() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","D://chromedriver.exe");
		driver = new ChromeDriver();
		
		driver.get("https://www.w3schools.com/html/html_iframe.asp");
		
//		List<WebElement> elements = driver.findElements(By.xpath("//span[@class='titreck']"));
//		for(WebElement ele : elements)
//		{
//			ele.findElement(By.xpath("//span[text() = 'SAP']")).click();
//		}
//		
//		driver.findElement(By.xpath("//span[text() = 'SAP - FICO']")).click();

		driver.switchTo().frame(1);
		

		StringBuilder str = new StringBuilder();
		str.setLength(10);
		str.append("kanishk");
		str.append("another");
		str.append("another programmer");
		
		driver.navigate().back();
		
	} 

}

