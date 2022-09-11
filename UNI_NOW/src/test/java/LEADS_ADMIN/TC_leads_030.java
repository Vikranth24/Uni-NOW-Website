package LEADS_ADMIN;

import org.testng.annotations.Test;

import Pom_repository.Leads_Page;
import Pom_repository.Staff;
import Pom_repository.Student_Page;
import generic.Base_Class;
import generic.ReadExcel;
import generic.UtilityMethods;

@Test
public class TC_leads_030 extends Base_Class{
	public void Search() throws InterruptedException
	{
		ReadExcel a=new ReadExcel();
		String name=a.readStringDataFromExcel("Sheet1",0,0);
		UtilityMethods U=new UtilityMethods();
		Leads_Page L =new Leads_Page(driver);
		Student_Page S=new Student_Page(driver);
		Staff SF=new Staff(driver);
		
		L.Connect_5();
		L.Red_5();
	    S.create_Name(name);
	    S.Create_Submit();
	    L.Leads();
	    
	  if(L.Leads_name_view_3().equals(name))
			  {
		  System.out.println("TC_leads_030 is fail ");
			  }
	  else 
	  {
		  System.out.println("TC_leads_030 is pass ");
	  }
		
		
		
	}
}
