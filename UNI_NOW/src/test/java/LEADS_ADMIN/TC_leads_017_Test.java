package LEADS_ADMIN;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import Pom_repository.Leads_Page;
import generic.Base_Class;
import generic.ReadExcel;
import generic.UtilityMethods;

public class TC_leads_017_Test extends Base_Class{
	@Test
	public void Search() throws InterruptedException
	{
		ReadExcel a=new ReadExcel();
	//	String name= a.readStringDataFromExcel("Sheet1", 0, 0);
		UtilityMethods U=new UtilityMethods();
		Leads_Page L =new Leads_Page(driver);
		Thread.sleep(3000);
		List<WebElement> r=driver.findElements(By.xpath("//div/table/tbody/tr/td[4]/p[2]")); //Email in table
		int n=r.size();
	L.Date_Range_down_click();
	Thread.sleep(2000);
	L.Date_Range_down("Today");
	Thread.sleep(2000);
	L.submit();
	Thread.sleep(2000);
	L.reset();
	Thread.sleep(2000);
	List<WebElement> j=driver.findElements(By.xpath("//div/table/tbody/tr/td[4]/p[2]")); //Email in table
	int c=j.size();
	
	Assert.assertTrue(c==n, "TC_leads_017"); 
	System.out.println("TC_leads_017 is pass");
	
	
	
		
	}

}
