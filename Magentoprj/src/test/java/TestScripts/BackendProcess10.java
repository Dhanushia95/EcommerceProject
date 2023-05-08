package TestScripts;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import CommonFunctionality.OpenDriver;
import Objects.BackendObjects;

public class BackendProcess10 extends OpenDriver {
	@Test
	public void backendprocess()
	{
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("http://live.techpanda.org/index.php/backendlogin/");
		
		PageFactory.initElements(driver, BackendObjects.class);
		
		BackendObjects.username.click();
		BackendObjects.username.sendKeys("user01");
		BackendObjects.password.click();
		BackendObjects.password.sendKeys("guru99com");
		BackendObjects.loginbutton.click();
		BackendObjects.closepopup.click();
		Select select = new Select(BackendObjects.salestab);
		select.selectByIndex(0);
		Select select1 =new Select(BackendObjects.exporttodropdown);
		select1.selectByIndex(0);
		BackendObjects.exportbutton.click();
		
		
		String filePath = System.getProperty("user.home")+"/Downloads/orders.csv";
			//EmailUtil.emailUtil(filePath);
			//Mail.mail(filePath);
		
		
		// 5. Read downloaded file and display the Heading and all the Order details in the console windows
		File f = new File(filePath);
		System.out.println("is the file downloaded:"+f.exists());
		
		try {
			FileReader fr = new FileReader(f);
			BufferedReader br = new BufferedReader(fr);
			String line = br.readLine();
			while(line!=null){
				System.out.println(line);
				line = br.readLine();
			}
			fr.close();
			br.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
