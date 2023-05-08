package TestScripts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import BaseClass.OpenTechpanda;
import Objects.MobileObjects;

public class AddSonyXperiatoCart3 extends OpenTechpanda  {
	@Test
	public void addtocart()
	{
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		PageFactory.initElements(driver, MobileObjects.class);
		MobileObjects.mobiletab.click();
		MobileObjects.sonyxperiaaddtocart.click();
		MobileObjects.qty.click();
		MobileObjects.qty.clear();
		MobileObjects.qty.sendKeys("1000");
		MobileObjects.updatebutton.click();
		
		//SoftAssert assert = new SoftAssert();
		String errmsg =MobileObjects.errormessage.getText();
		System.out.println(errmsg);
		String exp ="                * The maximum quantity allowed for purchase is 500.            ";
		Assert.assertEquals(errmsg, exp);
		
		MobileObjects.emptycart.click();
		
		String empmsg =MobileObjects.emptycartmessage.getText();
		System.out.println(empmsg);
		String exp1 ="You have no items in your shopping cart.";
		Assert.assertEquals(errmsg, exp1);
		
	}
}