package LEADS_ADMIN;

import org.testng.annotations.Test;

import Pom_repository.Leads_Page;
import Pom_repository.Staff;
import Pom_repository.Student_Page;
import Pom_repository.University;
import generic.Base_Class;
import generic.ReadExcel;
import generic.UtilityMethods;

@Test
public class TC_University_143 extends Base_Class {
	public void Search() throws InterruptedException {
		ReadExcel a = new ReadExcel();
		String name= a.readStringDataFromExcel("Sheet1", 0, 0);
		String Phone = a.readStringDataFromExcel("Sheet1", 0, 0);
		String email= a.readStringDataFromExcel("Sheet1", 0, 0);
		String Amo4 = a.readStringDataFromExcel("Sheet1", 0, 0);
		String Amo5 = a.readStringDataFromExcel("Sheet1", 0, 0);
		UtilityMethods U = new UtilityMethods();
		Leads_Page L = new Leads_Page(driver);
		Student_Page S = new Student_Page(driver);
		Staff SF=new Staff(driver);
		University UN=new University(driver);
		UN.University();
		UN.Role(2);
		UN.Submit();
		UN.Reset();
		

}}
