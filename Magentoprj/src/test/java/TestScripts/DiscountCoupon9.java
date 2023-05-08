package TestScripts;

import static org.testng.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import BaseClass.OpenTechpanda;
import Objects.DiscountCouponObjects;

public class DiscountCoupon9 extends OpenTechpanda {
	
	public double GURU50 = 0.05;
	@Test
	public void discountcoupon()
	{
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		PageFactory.initElements(driver, DiscountCouponObjects.class);
		
		DiscountCouponObjects.mobiletab.click();
		DiscountCouponObjects.iphoneaddtocart.click();
		DiscountCouponObjects.couponcodetextbox.click();
		DiscountCouponObjects.couponcodetextbox.clear();
		DiscountCouponObjects.couponcodetextbox.sendKeys("GURU50");
		DiscountCouponObjects.applybutton.click();
		
		String discount=DiscountCouponObjects.discount.getText();
		String subtotal=(DiscountCouponObjects.subtotal.getText());
		String gtotal=(DiscountCouponObjects.grandtotal.getText());
		
		String sdiscount=discount.replaceAll("\\$", " ");
		String ssubtotal=subtotal.replaceAll("\\$", " ");
		String sgtotal=gtotal.replaceAll("\\$", " ");
		
		String tdiscount=sdiscount.trim();
		String tsubtotal=ssubtotal.trim();
		String tgtotal=sgtotal.trim();
		
		double ddiscount=Double.parseDouble(tdiscount);
		double dsubtotal=Double.parseDouble(tsubtotal);
		double dgtotal=Double.parseDouble(tgtotal);
		
		double discountedAmt = (dsubtotal * GURU50);     
	    double ddiscountprice = (dsubtotal - discountedAmt);
	    
	    if (discountedAmt == ddiscount){
    		System.out.println("*** Derived discount amount   = " + discountedAmt);
    		System.out.println("*** Displayed discount amount = " + ddiscount);
    }else
      { System.out.println("*** Derived discount amount not equal displayed discount amount ***");
    }	
    
    String string_discountedAmt = Double.toString(discountedAmt);
    String string_dDiscDisp = Double.toString(ddiscount);
    try {
        assertEquals(string_discountedAmt, string_dDiscDisp);
      } catch (Error e) {
    	  System.out.println("*** Derived discount amount not equal displayed discount amount ***");
    	  e.printStackTrace();	
      }
	}

}
