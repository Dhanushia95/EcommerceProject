package BaseClass;

import org.testng.annotations.Test;

import CommonFunctionality.OpenDriver;

public class OpenTechpanda extends OpenDriver {
	@Test
	public void openmajento()
	{
		driver.get("http://live.techpanda.org/");
		
		System.out.println("title is:"+driver.getTitle());
	}

}
