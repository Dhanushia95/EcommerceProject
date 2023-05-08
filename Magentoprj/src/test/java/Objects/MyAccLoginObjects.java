package Objects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MyAccLoginObjects {
	
	@FindBy(xpath="(//a[contains(text(),'My Account')])[last()]")
	public static WebElement myaccount;
	
	@FindBy(name="login[username]")
	public static WebElement emailid;
	
    @FindBy(name="login[password]")
    public static WebElement pass;
    
    @FindBy(id="send2")
    public static WebElement loginbutton;
}
