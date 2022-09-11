package LEADS_ADMIN;

import org.testng.annotations.Test;

import Pom_repository.Leads_Page;
import Pom_repository.Staff;
import Pom_repository.Student_Page;
import generic.Base_Class;
import generic.ReadExcel;
import generic.UtilityMethods;

@Test
public class TC_leads_038 extends Base_Class{
	public void Search() throws InterruptedException
	{
		ReadExcel a=new ReadExcel();
		
		UtilityMethods U=new UtilityMethods();
		Leads_Page L =new Leads_Page(driver);
		Student_Page S=new Student_Page(driver);
		Staff SF=new Staff(driver);
		String b=L.Leads_connected();
		L.status(2);
		L.Date_Range_down(5);
		L.submit();	
		
		L.Date_Range_top(5);
		
		if(L.Leads_Count().equals(b))
		{
			System.out.println("TC_leads_038 is pass");
			
		}
		else
		{
			System.out.println("TC_leads_038 is Fail");
			
		}
		
	}
}
