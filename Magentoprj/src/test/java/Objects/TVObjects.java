package Objects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class TVObjects {

	@FindBy(xpath="(//a[@class='level0 '])[2]")
	public static WebElement tvtab;
	
	@FindBy(xpath="(//ul[@class='add-to-links'])[last()-1]")
	public static WebElement addtowishlistlgtv;
	
	@FindBy(name = "save_and_share")
	public static WebElement clicksharewishlist;
	
	@FindBy(id = "email_address")
	public static WebElement  enteremail;
	
	@FindBy(id = "message")
	public static WebElement entermesssage  ;
	
	@FindBy(xpath="(//button[@class='button'])[1]")
	public static WebElement submitwishlist;
	
	@FindBy(xpath="//li[@class='success-msg']")
	public static WebElement successmesssage;
	
}
