package TestScripts;

import static org.testng.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import BaseClass.OpenTechpanda;
import Objects.AccountObjects;
import Objects.TVObjects;

public class CreateACCandWishlist5 extends OpenTechpanda{
	
	public String firstname="Dhanushia";
	public String lastname="p";
	
	@Test
	public void accountcreation()
	{
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		PageFactory.initElements(driver, AccountObjects.class);
		
		AccountObjects.myaccount.click();
		AccountObjects.createaccountlink.click();
		AccountObjects.firstname.sendKeys(firstname);
		AccountObjects.lastname.sendKeys(lastname);
		AccountObjects.password.sendKeys("Abcd@123");
		AccountObjects.confirmpassword.sendKeys("Abcd@123");
		AccountObjects.email.sendKeys("dhanushia3@gmail.com");
		AccountObjects.signupfornewslettercheckbox.click();
		AccountObjects.registerbutton.click();
		
		String a = ("WELCOME, " + firstname + " " + lastname + "!");
		WebElement b = (AccountObjects.welcomemessage);
		String c =b.getText();
		assertEquals(a,c);
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		PageFactory.initElements(driver, TVObjects.class);
		
		TVObjects.tvtab.click();
		TVObjects.addtowishlistlgtv.click();
		TVObjects.clicksharewishlist.click();
		TVObjects.enteremail.click();
		TVObjects.enteremail.sendKeys("dhanushia@gmail.com");
		TVObjects.entermesssage.click();
		TVObjects.entermesssage.sendKeys("sending wishlist");
		TVObjects.submitwishlist.click();
		
		String e =(TVObjects.successmesssage.getText());
		String d = "Your Wishlist has been shared.";
		assertEquals(e,d);
		
		
	}

}
