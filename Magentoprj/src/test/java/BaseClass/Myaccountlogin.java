package BaseClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import Objects.AccountObjects;
import Objects.MyAccLoginObjects;
import Objects.MyAccObjects;

public class Myaccountlogin extends OpenTechpanda {

	@Test
	public void myacclogin()
	{
       driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
       

		PageFactory.initElements(driver, AccountObjects.class);
		
		AccountObjects.myaccount.click();
		
		PageFactory.initElements(driver, MyAccLoginObjects.class);
		
		//MyAccLoginObjects.myaccount.click();
		MyAccLoginObjects.emailid.sendKeys("dhanushia2@gmail.com");
		MyAccLoginObjects.pass.sendKeys("Abcd@123");
		MyAccLoginObjects.loginbutton.click();
		
	}
}
