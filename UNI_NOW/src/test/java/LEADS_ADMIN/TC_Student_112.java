package LEADS_ADMIN;

import org.testng.annotations.Test;

import Pom_repository.Leads_Page;
import Pom_repository.Staff;
import Pom_repository.Student_Page;
import generic.Base_Class;
import generic.ReadExcel;
import generic.UtilityMethods;

@Test
public class TC_Student_112 extends Base_Class {
	public void Search() throws InterruptedException {
		ReadExcel a = new ReadExcel();
		String Amo1 = a.readStringDataFromExcel("Sheet1", 0, 0);
		String Amo2 = a.readStringDataFromExcel("Sheet1", 0, 0);
		String Amo3 = a.readStringDataFromExcel("Sheet1", 0, 0);
		String Amo4 = a.readStringDataFromExcel("Sheet1", 0, 0);
		String Amo5 = a.readStringDataFromExcel("Sheet1", 0, 0);
		UtilityMethods U = new UtilityMethods();
		Leads_Page L = new Leads_Page(driver);
		Student_Page S = new Student_Page(driver);
		Staff SF = new Staff(driver);
		S.Student();
		S.Eye_button_1();
		S.Finance_Tution_Fee (Amo1);
        S.Finance_deposite (Amo2);
        S.Finance_Rem_Fee(Amo3);
        S.Finance_Liv_Cost(Amo4);
        S.Finance_Next ();
       
}
}