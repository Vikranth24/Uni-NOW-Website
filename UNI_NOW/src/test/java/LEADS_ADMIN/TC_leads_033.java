package LEADS_ADMIN;

import org.testng.annotations.Test;

import Pom_repository.Leads_Page;
import Pom_repository.Staff;
import Pom_repository.Student_Page;
import generic.Base_Class;
import generic.ReadExcel;
import generic.UtilityMethods;

public class TC_leads_033 extends Base_Class{
	@Test
	public void Search() throws InterruptedException
	{
		ReadExcel a=new ReadExcel();
		String Count=a.readStringDataFromExcel("Sheet1",0,0);
		UtilityMethods U=new UtilityMethods();
		Leads_Page L =new Leads_Page(driver);
		Student_Page S=new Student_Page(driver);
		Staff SF=new Staff(driver);
		System.out.println(L.Leads_Count());
		L.Date_Range_down(2);
		L.status(2);
		if(L.Leads_Count().equals(Count))
		{
			System.out.println(" TC_leads_033 is Pass");
			
		}
		else
		{
			System.out.println(" TC_leads_033 is Fail");
		}
		
		

}
}