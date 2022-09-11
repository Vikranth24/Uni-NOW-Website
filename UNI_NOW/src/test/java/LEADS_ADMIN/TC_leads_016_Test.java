package LEADS_ADMIN;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import Pom_repository.Leads_Page;
import generic.Base_Class;
import generic.ReadExcel;
import generic.UtilityMethods;

public class TC_leads_016_Test extends Base_Class {
	@Test
	public void Date_Range_down() throws InterruptedException
	{
		ReadExcel a=new ReadExcel();
		UtilityMethods U=new UtilityMethods();
		Leads_Page L =new Leads_Page(driver);
		driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
		Thread.sleep(5000);
		
	
		String[] c = { "All Time", "Today", "Yesterday", "Last 7 Days", "Last 30 Days", "This Month", "Last Month" };
		List<WebElement> t=driver.findElements(By.xpath("//div/table/tbody/tr/td[4]/p[1]")); // phone no
		for(WebElement yyy:t)
		{
			System.out.println(yyy.getText());
		}
		int g=t.size();
		ArrayList<String> rrr=new ArrayList<String>() ;//n	
		int f=0;  //n
	
		List<WebElement> q=L.Date_Range_down_all_option();
		
		for(int i=0;i<q.size();i++)
		{
			L.Date_Range_down_click();
			for(int j=0;j<q.size();j++)
			{
			if(q.get(i).getText().equalsIgnoreCase(c[j]))
			{
				Thread.sleep(1000);
				L.Date_Range_down(q.get(i).getText());
				Thread.sleep(1000);
				L.submit();
				Thread.sleep(2000);
				List<WebElement> r=driver.findElements(By.xpath("//div/table/tbody/tr/td[4]/p[2]")); //Email in table
				String[] n=new String [r.size()];
				
				if(r.size()!=0)
				{	
			    for(int k=0;k<r.size();k++)
			    {
				n[k]=r.get(k).getText()	;	
				}
			
			
			    
			    for(int k=0;k<r.size();k++)
			    {
			    	
			   if(  rrr.contains(n[k]))
					   {
				      
					   }
			   else {
				   rrr.add(n[k]);
				   f++;
			   }   
					   }
				} 
				 break;	
			}
			}	
		}
		if(f!=g)
		{
			System.out.println(f+"  ,"+g+" ,  "  );
			Assert.assertTrue(false, "49");
		}
		else
		{
			System.out.println("TC_leads_016 is pass");
			
		}
		
		
	}
}
