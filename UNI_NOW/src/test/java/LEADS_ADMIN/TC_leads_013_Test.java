package LEADS_ADMIN;

import static org.testng.Assert.assertTrue;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import Pom_repository.Leads_Page;
import generic.Base_Class;
import generic.ReadExcel;
import generic.UtilityMethods;

public class TC_leads_013_Test extends Base_Class{
	@Test
	public void Status() throws InterruptedException
	{
		
	
		Leads_Page L= new Leads_Page(driver);
		L.status_click();
		List<WebElement> q =L.Date_Range_Status_all_option(); 
		for(int i=0;i<q.size();i++)
		{
			Thread.sleep(2000);
			java.util.List<WebElement> w = driver.findElements(By.xpath("//p[@class='flex justify-center']"));

			int t = w.size();
			
			String r=q.get(i).getText();
			L.status_click();
			Thread.sleep(2000);
			L.status(r);
			Thread.sleep(2000);
			L.submit() ;
			Thread.sleep(2000);
			int p=0;
			int g=0;
			java.util.List<WebElement> y = driver.findElements(By.xpath("//p[@class='flex justify-center']"));

			int u = y.size();
			
			
			
			if(i==1)
			{
				Thread.sleep(2000);
				List<WebElement> o=driver.findElements(By.xpath("//div[@class='status green']"));
				 p=o.size();
				int d= L.connected_count();
				Assert.assertTrue(p==d, "54");
			}
				

			if(i==2)
			{
				Thread.sleep(2000);
				List<WebElement> o=driver.findElements(By.xpath("//div[@class='status yellow']"));
				 g=o.size();
				int d= L.Total_Not_connected_count();
				Assert.assertTrue(g==d, "63");
			}
			
			
			
				
				
				
				
				
				
			}
			
			
			
		}
		
}
