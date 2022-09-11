package LEADS_ADMIN;

import org.testng.annotations.Test;

import Pom_repository.Leads_Page;
import Pom_repository.Staff;
import Pom_repository.Student_Page;
import generic.Base_Class;
import generic.ReadExcel;
import generic.UtilityMethods;

@Test
public class TC_Users_131 extends Base_Class {
	public void Search() throws InterruptedException {
		ReadExcel a = new ReadExcel();
		String Search = a.readStringDataFromExcel("Sheet1", 0, 0);
		String Phone = a.readStringDataFromExcel("Sheet1", 0, 0);
		String email= a.readStringDataFromExcel("Sheet1", 0, 0);
		String Amo4 = a.readStringDataFromExcel("Sheet1", 0, 0);
		String Amo5 = a.readStringDataFromExcel("Sheet1", 0, 0);
		UtilityMethods U = new UtilityMethods();
		Leads_Page L = new Leads_Page(driver);
		Student_Page S = new Student_Page(driver);
		Staff SF = new Staff(driver);
        SF.Staff();
        SF.Role(3);
        SF.Status(5);
        SF.search(Search);
        SF.submit();
        SF.Reset();
        
        
        
         
         
	

}
}