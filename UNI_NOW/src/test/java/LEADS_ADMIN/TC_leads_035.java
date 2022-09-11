package LEADS_ADMIN;

import org.testng.annotations.Test;

import Pom_repository.Leads_Page;
import Pom_repository.Staff;
import Pom_repository.Student_Page;
import generic.Base_Class;
import generic.ReadExcel;
import generic.UtilityMethods;

@Test
public class TC_leads_035 extends Base_Class{
	public void Search() throws InterruptedException
	{
		ReadExcel a=new ReadExcel();
		
		UtilityMethods U=new UtilityMethods();
		Leads_Page L =new Leads_Page(driver);
		Student_Page S=new Student_Page(driver);
		Staff SF=new Staff(driver);
		String b=L.Leads_connected();
		L.Connect_6();
		if(b.equals(L.Leads_connected()))
		{
			System.out.println("TC_leads_035 is Pass ");
			
		}
		else
		{
			System.out.println("TC_leads_035 is Fail ");
			
		}
		
		
		
			
		

}}
