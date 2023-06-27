package testbefunky;

import org.testng.annotations.Test;

import pagebefunky.Editphotopage;

public class Editaphoto extends BefunkyBaseclass {
	
	@Test
	public void editphoto() throws Exception
	{
		Editphotopage ob1= new Editphotopage(driver);
		
		ob1.editphotoclick();
		ob1.photoeditorclick();
		ob1.open();
		Thread.sleep(3000);
		ob1.compselection();
		Thread.sleep(3000);
		ob1.closepopup();
		ob1.cropimg();
		Thread.sleep(3000);
		ob1.dropdownclick();
		ob1.youtubecoverselect();
		ob1.applyimg();
		Thread.sleep(3000);
		ob1.saveimage();
		Thread.sleep(3000);
		ob1.savecomputer();
		Thread.sleep(3000);
		ob1.imgsave();
	}

}
