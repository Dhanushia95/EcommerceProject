package Objects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PDFObjects {
	
	@FindBy(linkText = "View Order")
	public static WebElement vieworder;
	
	@FindBy(linkText = "Order #100019169 - Pending")
	public static WebElement orderstatus;
	
	@FindBy(xpath = "//a[@class='link-print']")
	public static WebElement printorder;
	
	@FindBy(xpath="//*[@id=\"sidebar\"]//print-preview-button-strip//div/cr-button[1]")
	public static WebElement print;
}
