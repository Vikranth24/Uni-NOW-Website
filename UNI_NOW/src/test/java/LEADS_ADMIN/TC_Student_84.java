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
public class TC_Student_84 extends Base_Class {
	public void Search() throws InterruptedException {
		ReadExcel a = new ReadExcel();
		String name = a.readStringDataFromExcel("Sheet1", 0, 0);
		String Phone = a.readStringDataFromExcel("Sheet1", 0, 0);
		String Email = a.readStringDataFromExcel("Sheet1", 0, 0);
		String poc = a.readStringDataFromExcel("Sheet1", 0, 0);
		UtilityMethods U = new UtilityMethods();
		Leads_Page L = new Leads_Page(driver);
		Student_Page S = new Student_Page(driver);
		Staff SF = new Staff(driver);
		S.Student();
		S.Eye_button_1();
		S.edit_button();
		S.Edit_name(name);
		S.Edit_Phone(Phone);
		S.Edit_email(Email);
		S.Edit_Desc();
		S.Edit_level();
		S.Edit_industry();
		S.Edit_intake();
		S.Edit_POC(2);
		S.Edit_Pno();
		S.Edit_Submit();
		
		
		

}}
