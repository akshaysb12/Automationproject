package pagebefunky;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Befunkylogin {
	
WebDriver driver;
	
	By Befunkysignin = By.xpath("//*[@id=\"site_nav\"]/div[1]/button[2]");
	By Befunkyemail = By.xpath("//*[@id=\"sign_in_form_email\"]");
	By Befunkypassword = By.xpath("//*[@id=\"sign_in_form_password\"]");
	By Befunkysigninbutton = By.xpath("//*[@id=\"sign_in_form\"]/button");
	
	public Befunkylogin(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public void signin()
	{
		driver.findElement(Befunkysignin).click();
	}
	
	public void setvalues(String email, String password)
	{
		driver.findElement(Befunkyemail).sendKeys(email);
		driver.findElement(Befunkypassword).sendKeys(password);
	}
	
	public void signinclick()
	{
		driver.findElement(Befunkysigninbutton).click();
	}
	

}
