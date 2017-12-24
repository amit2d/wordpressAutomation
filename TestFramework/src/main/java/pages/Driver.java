package pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Driver {
	
	public static WebDriver Instance;
	
	public static void Initialize()
	{
		System.setProperty("webdriver.chrome.driver", "/home/amit/code/Driver/chromedriver");
		Instance = new ChromeDriver();
		Instance.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
	}

	public static void close() {

		Instance.close();
		
	}

}
