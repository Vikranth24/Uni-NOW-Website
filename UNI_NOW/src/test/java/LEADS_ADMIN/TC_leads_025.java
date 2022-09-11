package LEADS_ADMIN;

import org.testng.annotations.Test;

import Pom_repository.Leads_Page;
import Pom_repository.Student_Page;
import generic.Base_Class;
import generic.ReadExcel;
import generic.UtilityMethods;

@Test
public class TC_leads_025 extends Base_Class{
	public void Search() throws InterruptedException
	{
		ReadExcel a=new ReadExcel();
		UtilityMethods U=new UtilityMethods();
		Leads_Page L =new Leads_Page(driver);
		Student_Page S=new Student_Page(driver);
		
		String name=a.readStringDataFromExcel("Sheet1",0,0);
		String phone=a.readStringDataFromExcel("Sheet1",0,1);
		String corp_comp=a.readStringDataFromExcel("Sheet1",0,2);
		String corp_email=a.readStringDataFromExcel("Sheet1",0,4);
		L.Connect_2();
		L.Red_2();
		 S.Create_POC(2);
		 S.Create_Pno();
		 S.Create_Submit();
		 S.Student();
		 
		 if(S.Student_Name_view().equals(name))
		 {
			System.out.println(" Student created successfully from leads page");
		 }
		 else 
		 {
		     System.out.println("Student is not created successfully from leads page");
		 
		 }

}
}