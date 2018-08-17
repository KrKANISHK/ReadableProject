package TakingScreenShotSelenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigation 
{
	WebDriver driver;
	TakeScreens scr;
	public Navigation()
	{
		System.setProperty("webdriver.chrome.driver","D://chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.guru99.com/");
		scr.capture();
		List<WebElement> elements = driver.findElements(By.xpath("//span[@class='titreck']"));
		for(WebElement ele : elements)
		{
			ele.findElement(By.xpath("//span[text() = 'SAP']")).click();
			break;
		}
	}
}
