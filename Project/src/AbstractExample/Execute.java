package AbstractExample;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Execute {

	WebDriver driver = new FirefoxDriver();
	public static void main(String[] args)
	{
		AbstractExample ParentObj = new AddClass();
		int n = ParentObj.operate(2, 2);
		System.out.println(n);
		
		
	}
}
