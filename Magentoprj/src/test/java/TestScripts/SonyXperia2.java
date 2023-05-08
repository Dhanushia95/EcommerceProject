package TestScripts;

import static org.testng.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import BaseClass.OpenTechpanda;
import Objects.MobileObjects;

public class SonyXperia2 extends OpenTechpanda {
	@Test
	public void sony()
	{
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		PageFactory.initElements(driver,MobileObjects.class);
		MobileObjects.mobiletab.click();
		
	String price1 =	MobileObjects.sonyxperiaprice.getText();
	System.out.println("price is :"+price1);
	
	String price2 =MobileObjects.sonydetailedprice.getText();
	System.out.println("detailed price is :"+price2);
	
	//System.out.println("compare price1 and price2 is:"+price1.equals(price2));
	
	try {
        assertEquals(price1, price2); 
      } catch (Exception e) {
    	  e.printStackTrace();
      }
	
	}
	
	

}
