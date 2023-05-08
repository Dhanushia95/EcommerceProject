package TestScripts;

import static org.testng.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import BaseClass.OpenTechpanda;
import Objects.AccountObjects;
import Objects.MyAccLoginObjects;
import Objects.ReOrderObjects;

public class Reorder8 extends OpenTechpanda {
	@Test
	public void reorder()
	{
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	     

		PageFactory.initElements(driver, AccountObjects.class);
		
		AccountObjects.myaccount.click();
		

		PageFactory.initElements(driver, MyAccLoginObjects.class);
		MyAccLoginObjects.emailid.click();
		MyAccLoginObjects.emailid.sendKeys("dhanushia1@gmail.com");
		MyAccLoginObjects.pass.click();
		MyAccLoginObjects.pass.sendKeys("Abcd@123");
		MyAccLoginObjects.loginbutton.click();
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		PageFactory.initElements(driver, ReOrderObjects.class);
		
		ReOrderObjects.reorder.click();
		
		String price1 =ReOrderObjects.pricebeforeqtychange.getText();
		
		ReOrderObjects.changeqty.click();
		ReOrderObjects.changeqty.clear();
		ReOrderObjects.changeqty.sendKeys("5");
		ReOrderObjects.updatebutton.click();
		
		String price2 =ReOrderObjects.priceafterqtychange.getText();
		//assertEquals(price1,price2);
		if (price1==price2){
	    	   System.out.println("*** Grand Total price has not changed. ***");
	    }else{
		       System.out.println("*** Grand Total price has changed. ***");
		}
		
		ReOrderObjects.proceedtocheckout.click();
		ReOrderObjects.billinfocontinue.click();
		ReOrderObjects.shippingmethodcontinue.click();
		ReOrderObjects.checkmoneyorderradiobutton.click();
		ReOrderObjects.paymentinfocontinue.click();
		ReOrderObjects.placeorder.click();
		System.out.println(ReOrderObjects.orderplacedtitle.getText());
		System.out.println(ReOrderObjects.ordernumber.getText());
	}

}
