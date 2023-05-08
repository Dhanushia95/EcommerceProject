package TestScripts;

import static org.testng.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import BaseClass.OpenTechpanda;
import Objects.AccountObjects;
import Objects.MyAccLoginObjects;
import Objects.PurchaseProductsObjects;

public class PurchaseProducts6 extends OpenTechpanda {
	@Test
	public void purchaseproduct()
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
		
		
		PageFactory.initElements(driver, PurchaseProductsObjects.class);
		
		PurchaseProductsObjects.mywishlist1.click();
		PurchaseProductsObjects.addtocart.click();
		PurchaseProductsObjects.proceedtocheckout.click();
		PurchaseProductsObjects.enteraddress.click();
		PurchaseProductsObjects.enteraddress.sendKeys("karumparai,pudhur,erode");
		PurchaseProductsObjects.entercity.click();
		PurchaseProductsObjects.entercity.sendKeys("Erode");
		PurchaseProductsObjects.enterzipcode.click();
		PurchaseProductsObjects.enterzipcode.sendKeys("638002");
		PurchaseProductsObjects.entertelephonenum.click();
		PurchaseProductsObjects.entertelephonenum.sendKeys("1234567890");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		Select select =new Select(PurchaseProductsObjects.countrydropdown);
		select.selectByVisibleText("India");
		PurchaseProductsObjects.state.sendKeys("Tamilnadu");
		//Select select1 =new Select(PurchaseProductsObjects);
		//select1.selectByVisibleText("India");
		
		String a =PurchaseProductsObjects.flatrate.getText();
		String b= "Flat Rate";
		
	    	System.out.println(b);
	    	System.out.println(a);
	    	assertEquals(a,b);
		    
	    	
		String c = "Fixed - $5.00";
	    String d = PurchaseProductsObjects.shippingcost.getText();
	   	 
	    	System.out.println(c);
	    	System.out.println(d);
	    	assertEquals(c,d);
		    
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		//PurchaseProductsObjects.continuebutton.click();
		PurchaseProductsObjects.billingcontinue.click();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		PurchaseProductsObjects.shippingmethodcontinue.click();
		PurchaseProductsObjects.checkmoneyorderradiobutton.click();
		PurchaseProductsObjects.paymentcontinue.click();
		PurchaseProductsObjects.placeorderbutton.click();
		
		PurchaseProductsObjects.orderrecieved.getText();
		PurchaseProductsObjects.ordernumber.getText();
	}

}
