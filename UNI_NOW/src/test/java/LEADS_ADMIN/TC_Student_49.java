package LEADS_ADMIN;

import org.testng.annotations.Test;

import Pom_repository.Leads_Page;
import Pom_repository.Staff;
import Pom_repository.Student_Page;
import generic.Base_Class;
import generic.ReadExcel;
import generic.UtilityMethods;

@Test
public class TC_Student_49 extends Base_Class{
	public void Search() throws InterruptedException
	{
		ReadExcel a=new ReadExcel();
		
		String name=a.readStringDataFromExcel("Sheet1",0,0);
		UtilityMethods U=new UtilityMethods();
		Leads_Page L =new Leads_Page(driver);
		Student_Page S=new Student_Page(driver);
		Staff SF=new Staff(driver);
		
		S.Student();
		S.Stage(4);
		S.submit();
		if (S.Student_Stage_view_1().equals(name))
		{
			System.out.println("TC_Student_49 is Pass");
		}
		
		if (S.Student_Stage_view_1().equals(name))
		{
			System.out.println("TC_Student_49 is Fail");
		}
		
		
		
		

}}
