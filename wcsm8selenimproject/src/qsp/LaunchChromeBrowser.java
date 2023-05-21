package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class LaunchChromeBrowser {
public static void main(String[] args) throws InterruptedException {
	
	//To avoid illegalStateException
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	//To avoid connectionFailedException
	
	ChromeDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	
	
	driver.get("https://www.flipkart.com/");
	
	Thread.sleep(2000);
	driver.findElement(By.name("q")).sendKeys("Hp laptop");
	
}
}
