package Objects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DiscountCouponObjects {
	
	@FindBy(linkText = "Mobile")
	public static WebElement mobiletab;
	
	@FindBy(xpath="(//button[@class='button btn-cart'])[1]")
	public static WebElement iphoneaddtocart;
	
	@FindBy(id="coupon_code")
	public static WebElement couponcodetextbox;
	
	@FindBy(xpath = "(//button[@class='button2'])[1]")
	public static WebElement  applybutton;
	
	@FindBy(xpath = "(//span[@class='price'])[7]")
	public static WebElement subtotal;
	
	@FindBy(xpath="(//span[@class='price'])[8]")
	public static WebElement discount;
	
	@FindBy(xpath="(//span[@class='price'])[6]")
	public static WebElement grandtotal;

}
