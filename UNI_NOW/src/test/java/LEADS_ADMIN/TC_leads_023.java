package LEADS_ADMIN;

import org.testng.annotations.Test;

import Pom_repository.Leads_Page;
import generic.Base_Class;
import generic.ReadExcel;
import generic.UtilityMethods;

public class TC_leads_023 extends Base_Class{
	@Test
	public void Search() throws InterruptedException
	{
		ReadExcel a=new ReadExcel();
		UtilityMethods U=new UtilityMethods();
		Leads_Page L =new Leads_Page(driver);
	    
		L.Connect_3();
		Thread.sleep(3000);
		 L.Red_3();
		Thread.sleep(3000);
		U.get_title();
		System.out.println("Create student is showing when user clicks on red button");

}}
