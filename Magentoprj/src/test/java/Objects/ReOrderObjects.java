package Objects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ReOrderObjects {
	
	@FindBy(xpath="//a[@class='link-reorder']")
	public static WebElement reorder;
	
	@FindBy(xpath="//*[@id=\"shopping-cart-totals-table\"]/tfoot/tr/td[2]/strong/span")
	public static WebElement pricebeforeqtychange;
	
	@FindBy(xpath="//*[@id=\"shopping-cart-totals-table\"]/tfoot/tr/td[2]/strong/span")
	public static WebElement priceafterqtychange;
	
	@FindBy(name = "cart[205196][qty]")
	public static WebElement changeqty;
	
	@FindBy(name = "update_cart_action")
	public static WebElement updatebutton;
	
	@FindBy(xpath="(//button[@class='button btn-proceed-checkout btn-checkout'])[1]")
	public static WebElement proceedtocheckout;
	
	@FindBy(xpath = "(//button[@class='button'])[1]")
	public static WebElement billinfocontinue;
	
	@FindBy(xpath = "(//button[@class='button'])[3]")
	public static WebElement shippingmethodcontinue;
	
	@FindBy(id="p_method_checkmo")
	public static WebElement checkmoneyorderradiobutton;
	
	@FindBy(xpath = "(//button[@class='button'])[2]")
	public static WebElement paymentinfocontinue;

	@FindBy(xpath = "//button[@class='button btn-checkout']")
	public static WebElement placeorder;
	
	@FindBy(xpath="//div[@class='page-title']")
	public static WebElement orderplacedtitle;
	
	@FindBy(linkText = "100019171")
	public static WebElement ordernumber;
}
