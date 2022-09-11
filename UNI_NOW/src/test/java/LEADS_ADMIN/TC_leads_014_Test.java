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

public class TC_leads_014_Test extends Base_Class{
	@Test
	public void Search() throws InterruptedException
	{
		//ReadExcel a=new ReadExcel();
		//String name = a.readStringDataFromExcel("Sheet1", 0, 0);
		UtilityMethods U=new UtilityMethods();
		Leads_Page L =new Leads_Page(driver);
		Thread.sleep(3000);
		L.search("1111");
		Thread.sleep(3000);
		L.submit();
		Thread.sleep(3000);
		List<WebElement>q=driver.findElements(By.xpath("//div/table/tbody/tr/td[3]"));
		List<WebElement> t=driver.findElements(By.xpath("//div/table/tbody/tr/td[4]/p[2]"));
		List<WebElement> o=driver.findElements(By.xpath("//div/table/tbody/tr/td[4]/p[1]"));
		
		if(q.size()>0)
			
			
			
		{
			for(int i=0;i<q.size();i++)
			{
				String w=q.get(i).getText();
				String y=t.get(i).getText();
				String p=o.get(i).getText();
				
				if(w.contains("1111")==false)
				{
					if(y.contains("1111")==false)
					{
						if(p.contains("1111")==false)
						{
							Assert.assertTrue(false, "46");
							
						}
					}
				}
		else {
		  String u=	L.Search_not_found();
			Assert.assertTrue( u.equalsIgnoreCase("Not found"),"42");
			System.out.println("Bye");
		}	
	}}}
	}



