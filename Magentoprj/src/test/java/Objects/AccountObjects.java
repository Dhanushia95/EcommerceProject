package Objects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AccountObjects {
	
	@FindBy(xpath="//a[@class='skip-link skip-account']")
	public static WebElement accounttab;
	
	@FindBy(xpath="(//a[contains(text(),'My Account')])[last()]")
	public static WebElement myaccount;
	
	@FindBy(xpath="//a[@class='button']")
	public static WebElement createaccountlink;
	
	@FindBy(id="firstname")
	public static WebElement firstname;
	
	@FindBy(id="lastname")
	public static WebElement lastname;
	
	@FindBy(id="password")
	public static WebElement password;
	
	@FindBy(id="confirmation")
	public static WebElement confirmpassword;
	
	@FindBy(id="email_address")
	public static WebElement email;
	
	
	@FindBy(name = "is_subscribed")
	public static WebElement signupfornewslettercheckbox;
	
	@FindBy(xpath="(//button[@class='button'])[1]")
	public static WebElement registerbutton;
	
	@FindBy(xpath="//li[@class='level0 nav-2 last']")
	public static WebElement tvtab;
	
	@FindBy(xpath="//p[@class='welcome-msg']")
	public static WebElement welcomemessage;
	
	//@FindBy(xpath="")

}
