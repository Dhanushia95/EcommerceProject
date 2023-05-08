package Objects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MobileObjects {
	
	@FindBy(xpath="//li[@class='level0 nav-1 first']")
	public static WebElement mobiletab;
	
	@FindBy(xpath="//body/div[@class='wrapper']/div[@class='page']/div[@class='main-container col3-layout']/div[@class='main']/div[@class='col-wrapper']/div[@class='col-main']/div[@class='category-products']/div[@class='toolbar']/div[@class='sorter']/div[@class='sort-by']/select[1]")
    public static  WebElement sortbydropdown;
	
	@FindBy(xpath="//span[@id='product-price-1']")
	public static WebElement sonyxperiaprice;
	
	@FindBy(xpath="//div[@class='price-box']")
	public static WebElement sonydetailedprice;
	
	@FindBy(xpath="(//button[@class='button btn-cart'])[last()-2]")
	public static WebElement sonyxperiaaddtocart;
	
	@FindBy(xpath="//input[@class='input-text qty']")
	public static WebElement qty;
	
	@FindBy(xpath="(//button[@name='update_cart_action'])[last()]")
	public static WebElement updatebutton;
	
	@FindBy(xpath="(//button[@name='update_cart_action'])[last()-2]")
	public static WebElement emptycart;

	@FindBy(xpath="//p[@class='item-msg error']")
	public static WebElement errormessage;
	
	@FindBy(xpath="text()='You have no items in your shopping cart.'])[last()]")
    public static WebElement emptycartmessage;
	
	@FindBy(xpath="(//a[@class='link-compare'])[last()-2]")
	public static WebElement sonycomparebutton;
	
	@FindBy(xpath="(//a[@class='link-compare'])[last()-1]")
	public static WebElement iphonecomparebutton;
	
	@FindBy(xpath="(//button[@class='button'])[1]")
	public static WebElement comparebutton;
}
