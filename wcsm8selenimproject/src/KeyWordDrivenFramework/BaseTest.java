package KeyWordDrivenFramework;

import org.openqa.selenium.WebDriver;

public class BaseTest extends Flib{
	static webDriver driver;
	public void openBrowser()
	{
		Flib flib = new Flib();
		  String browservalue = flib.readPropertyData("./data/config.properties","browser");
		  
	
	}
	
	

}
