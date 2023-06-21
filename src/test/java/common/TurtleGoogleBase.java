package common;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TurtleGoogleBase {
	
public WebDriver driver;

public void launchBrowser() {
	WebDriverManager.chromedriver().setup();
	driver = new ChromeDriver();
	driver.get("https://www.google.com");
	driver.manage().window().maximize();
}


public void closeBrowser() {
	driver.close();
	
	
	
}
}
