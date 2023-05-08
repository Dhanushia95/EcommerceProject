package TestScripts;


import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import BaseClass.OpenTechpanda;
import Objects.MobileObjects;

public class Mobiles1 extends OpenTechpanda {
	@Test
	public void mobile()
	{
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		PageFactory.initElements(driver, MobileObjects.class);
		MobileObjects.mobiletab.click();
		System.out.println("title :"+driver.getTitle());
		
		MobileObjects.sortbydropdown.click();
		
		Select sortby = new Select (MobileObjects.sortbydropdown);
		sortby.selectByIndex(1);
		
		List originallist = new ArrayList();
		List <WebElement> options = sortby.getOptions();
		for(WebElement ele :options)
		{
			originallist.add(ele.getText());
		}
		System.out.println(originallist );
	
		
	}
}
