package KeywordDrivenPackage;


import java.io.IOException;

import org.openqa.selenium.WebDriver;

public class BaseTest extends Flip {

	
	static WebDriver driver;
	public <flib> void openBrowser()throws IOException

	
	{
		flib flib = new flib();
	String browservalue = flib .readPropertyData("./data/config.properties");
	String url = flib.readPropertyData("./data/config.properties","url");
	System.out.println(browservalue+""+url);
	}
		
		
		
	}

