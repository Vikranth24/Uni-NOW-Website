package LEADS_ADMIN;

import org.testng.annotations.Test;

import Pom_repository.Leads_Page;
import Pom_repository.Staff;
import Pom_repository.Student_Page;
import generic.Base_Class;
import generic.ReadExcel;
import generic.UtilityMethods;

@Test
public class TC_leads_034 extends Base_Class{
	public void Search() throws InterruptedException
	{
		ReadExcel a=new ReadExcel();
		String name=a.readStringDataFromExcel("Sheet1",0,0);
		String Phone_no=a.readStringDataFromExcel("Sheet1",0,0);
		
		UtilityMethods U=new UtilityMethods();
		Leads_Page L =new Leads_Page(driver);
		Student_Page S=new Student_Page(driver);
		Staff SF=new Staff(driver);
	    L.search(name);	
	    L.submit();
	    String n="Found 0 Results.";
	   if( L.Leads_Count().equals(n))
	   {
		   System.out.println("Search textfield is Not filtering according to name in leads page");
		   
	   }
	   else
	   {
		   System.out.println("Search textfield is filtering according to name in leads page");
	   }
	    L.reset();
	    L.search(Phone_no);
	    L.submit() ;
	    if( L.Leads_Count().equals(n))
		   {
			   System.out.println("Search textfield is Not filtering according to Phone no in leads page");
			   
		   }
		   else
		   {
			   System.out.println("Search textfield is filtering according to Phone no in leads page");
		   }
	    L.reset();
	    
	    
	    
	    
	    
}}
