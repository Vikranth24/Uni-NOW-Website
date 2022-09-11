package LEADS_ADMIN;

import org.testng.annotations.Test;

import Pom_repository.Leads_Page;
import Pom_repository.Staff;
import Pom_repository.Student_Page;
import generic.Base_Class;
import generic.ReadExcel;
import generic.UtilityMethods;

@Test
public class TC_leads_040 extends Base_Class{
	public void Search() throws InterruptedException
	{
		ReadExcel a=new ReadExcel();
		String Date=a.readStringDataFromExcel("Sheet1",0,0);
		UtilityMethods U=new UtilityMethods();
		Leads_Page L =new Leads_Page(driver);
		Student_Page S=new Student_Page(driver);
		Staff SF=new Staff(driver);
	    
		if(L.Leads_Date_view_7().equals(Date))
		{
			System.out.println("TC_leads_040 is Pass");
		}
		else 
		{
			System.out.println("TC_leads_040 is Fail");
		}
		
		

}}
