package CommonFunctionality;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;

public class OpenDriver {
	public static WebDriver driver;
	@BeforeTest
	public void openfirefox()
	{
		System.setProperty("WebDriver.gecko.driver", "C:\\Users\\dell\\Downloads\\geckodriver.exe");
	    driver =new FirefoxDriver();
	    
	   // ChromeOptions options =new ChromeOptions();
		//options.addArguments("--remote-allow-origins=*");
		//driver =new ChromeDriver(options);
	}

}
