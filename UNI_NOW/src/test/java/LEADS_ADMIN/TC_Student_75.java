package LEADS_ADMIN;

import org.testng.Assert;
import org.testng.annotations.Test;

import Pom_repository.Leads_Page;
import Pom_repository.Staff;
import Pom_repository.Student_Page;
import generic.Base_Class;
import generic.ReadExcel;
import generic.UtilityMethods;

@Test
public class TC_Student_75 extends Base_Class{
	public void Search() throws InterruptedException
	{
		ReadExcel a=new ReadExcel();
		String name=a.readStringDataFromExcel("Sheet1",0,0);
		String Phone=a.readStringDataFromExcel("Sheet1",0,0);
		String Email=a.readStringDataFromExcel("Sheet1",0,0);
		String poc=a.readStringDataFromExcel("Sheet1",0,0);
		UtilityMethods U=new UtilityMethods();
		Leads_Page L =new Leads_Page(driver);
		Student_Page S=new Student_Page(driver);
		Staff SF=new Staff(driver);
		S.Student();
		S.New_Student();
		S.create_Name(name);
		S.create_Pno(Phone);
		S.Create_Email(Email);
		S.Create_Des(3);
		S.Create_level(3);
		S.Create_industry(3);
		S.Create_intake(3);
		S.Create_POC(3);
		S.Create_Pno();
		S.Create_Submit();
		Thread.sleep(3000);
		
	
		
		

}
}