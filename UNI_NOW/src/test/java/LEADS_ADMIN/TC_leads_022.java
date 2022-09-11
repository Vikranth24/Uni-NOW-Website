package LEADS_ADMIN;

import org.testng.annotations.Test;

import Pom_repository.Leads_Page;
import generic.Base_Class;
import generic.ReadExcel;
import generic.UtilityMethods;

public class TC_leads_022 extends Base_Class{
	@Test
	public void Search() throws InterruptedException
	{
		ReadExcel a=new ReadExcel();
		UtilityMethods U=new UtilityMethods();
		Leads_Page L =new Leads_Page(driver);
		String name=a.readStringDataFromExcel("Sheet1",0,0);
		
		L.status(2);
		//Clicked on submit //Only Connected status List is shown
		L.submit();
		Thread.sleep(3000);
		L.Connect_2();
		Thread.sleep(3000);
		L.Connect_2();
		Thread.sleep(3000);
		  L.reset();
		  
		  
		 L.search(name);
		 L.submit();
		 L.Connect_2();
		 U.scroll_down(driver);
		Thread.sleep(3000);
		 L.Connect_2();
		 U.scroll_up(driver);
		 Thread.sleep(3000);
		  
		 
		L.Date_Range_down(5);
		L.submit();
		 U.scroll_down(driver);
		Thread.sleep(3000);
		 L.Connect_2();
		Thread.sleep(3000);
		 U.scroll_down(driver);
		 L.Connect_2();
		Thread.sleep(3000);
		  L.reset();
		  
		  System.out.println("Action Icon is working properly when filters are added");
			
		
		
	}
}
