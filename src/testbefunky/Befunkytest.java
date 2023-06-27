package testbefunky;

import org.testng.annotations.Test;

import pagebefunky.Befunkylogin;

public class Befunkytest extends BefunkyBaseclass {

	
	@Test
	public void Befunkylogintest() throws InterruptedException
	{
		Befunkylogin ob = new Befunkylogin(driver);
		
		ob.signin();
		ob.setvalues("akashakshay994@gmail.com", "Akashakshay@12");
		Thread.sleep(3000);
		ob.signinclick();
	}

}
