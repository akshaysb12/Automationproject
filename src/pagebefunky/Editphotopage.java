package pagebefunky;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Editphotopage {
	
WebDriver driver;

	By create = By.xpath("//*[@id=\"site_nav\"]/div[1]/div[2]");
	By photoeditor = By.xpath("//*[@id=\"site_nav\"]/div[2]/div[3]/div[1]/section/a[1]");
	By openimage = By.xpath("//*[@id=\"top_nav_bar\"]/div[2]/dropdown-menu[1]/button");
	By Computerselection = By.xpath("//*[@id=\"top_nav_bar\"]/div[2]/dropdown-menu[1]/div/button[1]");
	By closepopupeditor = By.xpath("//*[@id=\"multimedia_clue_haunted\"]/panel-header/button[3]");
	By cropclick = By.xpath("//*[@id=\"main_menu_panels\"]/secondary-menu/div/accordion-layout/div[2]/div/button[1]");
	By dropdown = By.xpath("//*[@id=\"crop_aspect_ratio\"]/button");
	By Youtubecover = By.xpath("//*[@id=\"crop_aspect_ratio\"]/div/button[18]");
	By apply = By.xpath("//*[@id=\"main_menu_panels\"]/tertiary-menu/custom-tool-menu/div/div/div[1]/div[2]/apply-cancel-menu/div/button[2]");
	By saveimg = By.xpath("//*[@id=\"top_nav_bar\"]/div[2]/dropdown-menu[2]/button");
	By savetocomputer = By.xpath("//*[@id=\"top_nav_bar\"]/div[2]/dropdown-menu[2]/div/button[1]");
	By savefinal = By.xpath("//*[@id=\"sas\"]/div/div[2]/div[5]/button[2]");
	
	
	public Editphotopage(WebDriver driver) {
		
		this.driver=driver;
	}
	
	
	public void editphotoclick()
	{
		WebElement mouse=driver.findElement(create);
		Actions act=new Actions(driver);
		act.moveToElement(mouse);
		act.perform();
		
	}
	
	public void photoeditorclick()
	{
		driver.findElement(photoeditor).click();
	}
	
	public void open()
	{
		driver.findElement(openimage).click();
	}
	
	public void compselection() throws AWTException
	{
		
		driver.findElement(By.xpath("//*[@id=\"top_nav_bar\"]/div[2]/dropdown-menu[1]/div/button[1]")).click();
		
		fileUpload("C:\\Users\\Akash S B\\OneDrive\\Pictures\\demo.jpg");
	}

	public void fileUpload(String string) throws AWTException {
		// TODO Auto-generated method stub
		
		StringSelection select = new StringSelection(string);
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(select, null);
		
		Robot robot = new Robot();
		robot.delay(3000);
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.delay(2000);
		robot.keyRelease(KeyEvent.VK_ENTER);
		}
	
	public void closepopup()
	{
		driver.findElement(closepopupeditor).click();
	}
	
	public void cropimg()
	{
		driver.findElement(cropclick).click();
	}
	
	public void dropdownclick()
	{
		driver.findElement(dropdown).click();
	}
	
	public void youtubecoverselect()
	{
		driver.findElement(Youtubecover).click();
	}
	
	public void applyimg()
	{
		driver.findElement(apply).click();
	}
	
	public void saveimage()
	{
		driver.findElement(saveimg).click();
	}
	
	public void savecomputer()
	{
		driver.findElement(savetocomputer).click();
	}
	
	public void imgsave()
	{
		driver.findElement(savefinal).click();
	}
	

}
