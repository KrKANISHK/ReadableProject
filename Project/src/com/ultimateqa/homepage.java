package com.ultimateqa;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class homepage {

	WebDriver driver;
	public static final String listedLinks = "//div[@class='et_pb_text_inner']";
	
	public homepage()
	{
		System.setProperty("webdriver.chrome.driver","D://chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
	public void launch() throws InterruptedException
	{
		driver.get("https://www.ultimateqa.com/automation/");
		//driver.manage().window().maximize();
		List<WebElement> elements = driver.findElements(By.xpath("//div[@class='et_pb_text_inner']//ul/li"));
		System.out.println(elements.size());
		for (WebElement ele : elements )
		{
			String str=ele.getText().toString();
			if (str.equals("Fake Landing Page"))
			{	
				ele.click();
			}
		}
	}
	
	public static void main(String[] args) throws InterruptedException
	{
		homepage hm=new homepage();
		hm.launch();
	}
}
