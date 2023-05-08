package Objects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MyAccObjects {
	
	//@FindBy(xpath = "//div[@class='footer']//a[@title='My Account'][normalize-space()='My Account']")
	//public static WebElement myaccount;
	
	@FindBy(id = "email")
	public static WebElement enteremailid;
	
	@FindBy(id ="pass")
	public static WebElement enterpassword;
	
	@FindBy(id="send2")
	public static WebElement loginbutton;

}
