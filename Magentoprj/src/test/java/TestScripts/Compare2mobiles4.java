package TestScripts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.support.PageFactory;

import BaseClass.OpenTechpanda;
import Objects.MobileObjects;

public class Compare2mobiles4 extends OpenTechpanda{
	
	public void comapremble()
	{

	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	PageFactory.initElements(driver,MobileObjects.class);
	MobileObjects.mobiletab.click();
	
	MobileObjects.sonycomparebutton.click();
	MobileObjects.iphonecomparebutton.click();
	MobileObjects.comparebutton.click();
	System.out.println(driver.getTitle());
	String a =driver.switchTo().newWindow(null).getTitle();
	System.out.println(a);
	driver.close();
	}
}
