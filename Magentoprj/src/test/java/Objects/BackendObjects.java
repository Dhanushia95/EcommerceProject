package Objects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class BackendObjects {

	@FindBy(id="username")
	public static WebElement username;
	
	@FindBy(id="login")
	public static WebElement password;
	
	@FindBy(xpath="//input[@class='form-button']")
	public static WebElement loginbutton;
	
	@FindBy(linkText = "close")
	public static WebElement closepopup;
	
	@FindBy(linkText = "Sales")
	public static WebElement salestab;
	
	@FindBy(id="sales_order_grid_export")
	public static WebElement exporttodropdown;
	
	@FindBy(id="id_63822ab8c6e6b8c737667ee64d80bc2c")
	public static WebElement exportbutton;
	
}
