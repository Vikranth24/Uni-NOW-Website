package LEADS_ADMIN;

import org.testng.annotations.Test;

import Pom_repository.Leads_Page;
import Pom_repository.Staff;
import Pom_repository.Student_Page;
import generic.Base_Class;
import generic.ReadExcel;
import generic.UtilityMethods;

@Test
public class TC_Student_117 extends Base_Class {
	public void Search() throws InterruptedException {
		ReadExcel a = new ReadExcel();
		String r1 = a.readStringDataFromExcel("Sheet1", 0, 0);
		String r2 = a.readStringDataFromExcel("Sheet1", 0, 0);
		String Amo3 = a.readStringDataFromExcel("Sheet1", 0, 0);
		String Amo4 = a.readStringDataFromExcel("Sheet1", 0, 0);
		String Amo5 = a.readStringDataFromExcel("Sheet1", 0, 0);
		UtilityMethods U = new UtilityMethods();
		Leads_Page L = new Leads_Page(driver);
		Student_Page S = new Student_Page(driver);
		Staff SF = new Staff(driver);
		S.Student();
		S.Eye_button_1();
		S.Visa_Referance_1 (r1);
		S.Visa_Referance_2 (r2);
		S.Visa_Upload_1 ();
		S.Visa_Upload_2 ();
		S.Visa_Doc_1 ();
        S.Visa_Download_1();
        S.Visa_Reload_3 ();
        
        
}}
