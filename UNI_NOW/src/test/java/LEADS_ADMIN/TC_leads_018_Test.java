package LEADS_ADMIN;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import Pom_repository.Leads_Page;
import generic.Base_Class;
import generic.ReadExcel;
import generic.UtilityMethods;

public class TC_leads_018_Test extends Base_Class{
	@Test
	public void Search() throws InterruptedException
	{
		ReadExcel a=new ReadExcel();
		UtilityMethods U=new UtilityMethods();
		Leads_Page L =new Leads_Page(driver);
		
		Thread.sleep(2000);
		int c=Integer.parseInt(L.Page_Count().getText().split("of")[1].trim());
		int z=1;  //n
		for(int i=1;i<=c;i++)
		{
			Thread.sleep(2000);
			int d=Integer.parseInt(L.Page_Count().getText().split("of")[0].trim());
			if(d==z)
			{
				Thread.sleep(3000);
				if(L.Page_next_webelement().isEnabled())
				{
				L.Page_next();
				z++;
				}	
			}	
		}
		Thread.sleep(3000);
		int e=Integer.parseInt(L.Page_Count().getText().split("of")[1].trim());
		int f=Integer.parseInt(L.Page_Count().getText().split("of")[1].trim());
	
		if(f==e & f==c & f==z)
		{
		  System.out.println("TC_leads_018 is pass");
			
		}
		else {
			Assert.assertTrue(false, "TC_leads_018 is fail");
		}
}
	}
