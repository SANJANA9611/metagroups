package Basic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;



public class browser {
	@Test
	public void run()
	{
	System.setProperty("webdriver.chrome.driver","./source/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.instagram.com");
	}
}
		
