package package3;

import org.openqa.selenium.WebDriver;

public class FbLogin extends LoginPage {
	
	 
	
	public FbLogin(WebDriver driver) {
		super(driver);
	}
	

	public static void main(String[] args) throws InterruptedException {
		LoginPage lo=new LoginPage(driver);
		lo.launchBrowser();
		Thread.sleep(3000);
	    lo.enterUsername("Anil");
	    Thread.sleep(3000);
		lo.enterPassword("1262377");
		lo.captureTitle();

	}

}
