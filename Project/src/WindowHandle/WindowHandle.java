package WindowHandle;
import java.io.IOException;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class WindowHandle {
	WebDriver driver;
	
	public void exec() throws IOException
	{
		System.setProperty("webdriver.chrome.driver","D://chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://toolsqa.com/automation-practice-switch-windows/");
		System.out.println(driver.getWindowHandle());
		driver.findElement(By.id("button1")).click();
		Set<String> wins = driver.getWindowHandles();
		
		
		
	}
	
	public static void main(String[] args) throws InterruptedException, IOException
	{
		WindowHandle chkobj = new WindowHandle();
		chkobj.exec();
	}
}
