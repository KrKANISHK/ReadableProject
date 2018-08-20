package TakingScreenShotSelenium;

import java.awt.Window;
import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Navigation 
{
	WebDriver driver;
	TakeScreens scr;
	public void capture(WebDriver driver) throws IOException
	{
		TakesScreenshot scr=((TakesScreenshot) driver);
		File srcFile = scr.getScreenshotAs(OutputType.FILE);
		File Destfile = new File("D:\\ScreenShot.jpg");
		FileUtils.copyFile(srcFile, Destfile);
		
	}
	public void exec() throws IOException
	{
		System.setProperty("webdriver.chrome.driver","D://chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.guru99.com/");
		capture(driver);
		
		List<WebElement> elements = driver.findElements(By.xpath("//span[@class='titreck']"));
		for(WebElement ele : elements)
		{
			ele.findElement(By.xpath("//span[text() = 'SAP']")).click();
			break;
		}
	}
	
	public static void main(String[] args) throws InterruptedException, IOException
	{
		Navigation chkobj = new Navigation();
		chkobj.exec();
	}
}
