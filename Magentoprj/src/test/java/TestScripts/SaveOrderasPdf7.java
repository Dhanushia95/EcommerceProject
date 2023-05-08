package TestScripts;

import static org.testng.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import BaseClass.OpenTechpanda;
import Objects.AccountObjects;
import Objects.MyAccLoginObjects;
import Objects.PDFObjects;

public class SaveOrderasPdf7 extends OpenTechpanda {
	@Test
	public void saveorder()
	
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
		PageFactory.initElements(driver, PDFObjects.class);
		
		 PDFObjects.vieworder.click();
		String a = (PDFObjects.orderstatus.getText());  
		assertEquals("RECENT ORDERS", a);
		PDFObjects.printorder.click();
		PDFObjects.print.click();
	}

}
