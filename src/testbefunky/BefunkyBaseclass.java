package testbefunky;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;

public class BefunkyBaseclass {
	
	WebDriver driver;
	
	@BeforeClass
	public void setup()
	{
	    driver = new ChromeDriver();
		driver.get("https://www.befunky.com/");
	}

}
