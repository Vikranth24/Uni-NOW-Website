package LEADS_ADMIN;

import org.testng.annotations.Test;

import Pom_repository.Leads_Page;
import generic.Base_Class;
import generic.ReadExcel;
import generic.UtilityMethods;

public class TC_leads_020 extends Base_Class{
	@Test
	public void Search() throws InterruptedException
	{
		ReadExcel a=new ReadExcel();
		UtilityMethods U=new UtilityMethods();
		Leads_Page L =new Leads_Page(driver);
		
		L.Connect_1();
		Thread.sleep(3000);
		 L.Connect_1();
		Thread.sleep(3000);
		
		System.out.println("Action Button is working properly and changes the status");

}
}