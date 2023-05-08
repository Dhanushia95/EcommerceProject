package Objects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PurchaseProductsObjects {

	
	@FindBy(linkText ="My Wishlist")
	public static WebElement mywishlist;
	
	@FindBy(xpath="//div[@class='block-content']//a[normalize-space()='My Wishlist']")
	public static WebElement mywishlist1;
	
	@FindBy(xpath = "//button[@class='button btn-cart']")
	public static WebElement addtocart;
	
	@FindBy(xpath = "(//button[@class='button btn-proceed-checkout btn-checkout'])[2]")
	public static WebElement proceedtocheckout;
	
	@FindBy(id="billing:street1")
	public static WebElement enteraddress;
	
	@FindBy(id="billing:city")
	public static WebElement entercity;
	
	@FindBy(id="billing:postcode")
	public static WebElement enterzipcode;
	
	@FindBy(id="billing:telephone")
	public static WebElement entertelephonenum;
	
	@FindBy(xpath = "(//button[@class='button'])[1]")
	public static WebElement continuebutton;
	
	@FindBy(id="billing:country_id")
	public static WebElement countrydropdown;
	
	@FindBy(id="billing:region")
	public static WebElement state;
	
	@FindBy(xpath = "/html/body/div/div/div[2]/div/div[1]/ol/li[3]/div[2]/form/div[3]/button")
	public static WebElement shippingmethodcontinue;
	
	@FindBy(id="p_method_checkmo")
	public static WebElement checkmoneyorderradiobutton;
	
	@FindBy(xpath="//button[@class='button btn-checkout']")
	public static WebElement placeorderbutton;
	
	@FindBy(xpath="//div[@class='page-title']")
	public static WebElement orderrecieved;
	
	@FindBy(xpath="//*[@id=\"top\"]/body/div/div/div[2]/div/div/p[1]/a")
	public static WebElement ordernumber;
	
	@FindBy(xpath = "//*[@id=\"billing-buttons-container\"]/button")
	public static WebElement billingcontinue;
	
	@FindBy(xpath="(//button[@class='button'])[1]")
	public static WebElement paymentcontinue;
	
	@FindBy(xpath=".//*[@id='co-shipping-method-form']/dl/dd/ul/li/label")
	public static WebElement shippingcost;
	
	@FindBy(xpath="co-shipping-method-form")
	public static WebElement flatrate;
}
