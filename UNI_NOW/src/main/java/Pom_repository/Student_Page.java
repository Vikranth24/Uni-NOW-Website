package Pom_repository;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import generic.UtilityMethods;
public class Student_Page extends UtilityMethods {
	WebDriver driver;
	public Student_Page(WebDriver driver){
		PageFactory.initElements(driver,this);
		this.driver=driver;
	}
	
	
	//Student **************************************************************************************
	@FindBy(xpath = "//li[@class='py-2 text-center text-white cursor-pointer bg-hover border-l-4']")
	WebElement Student;
	public void Student() {
		clickElement(Student);}
	
	//Date_Range_Up*************************************************************************************
	@FindBy(xpath = "//label[@class=\"block text-sm text-text\"]")
	WebElement Date_Range_up;
	public void Date_Range_up(String a) {
		SelectByvisible(Date_Range_up,a);}
	
	//Total_count****************************************************************************************
	@FindBy(xpath = "//p[text()='Total Students ']/../p[1]")
	WebElement Total_count ;
	public String Total_count() {
	String a=get_Text_Value(Total_count);
		return a;}
	
	//Executive_Dropdown******************************************************************************
	@FindBy(xpath = "//select[@class='  bg-line relative right-1']")
	WebElement Executive;
	public void Executive(String a) {
		SelectByvisible(Executive,a);}
	
	//Stage_Dropdown*********************************************************************************
	@FindBy(xpath = "(//select[@class='  bg-line relative right-1'])[2]")
	WebElement Stage;
	public void Stage(String a) {
		SelectByvisible(Stage,a);}	
	
	//country******************************************************************************************
	@FindBy(xpath = "(//select[@class='  bg-line relative right-1'])[3]")
	WebElement country;
	public void country(String a) {
		SelectByvisible(country,a);}
	
	//Search******************************************************************************************
	@FindBy(xpath = "//input[@class='border-none text-white pl-4 placeholder:text-text ']")
	WebElement search;
	public void search(String a) {
		enter_value(search,a);}
	
	//Submit*******************************************************************************************
	@FindBy(xpath = "//button[text()='Submit']")
	WebElement submit;
	public void submit() {
		clickElement(submit);}
	
	//Reset********************************************************************************************
	@FindBy(xpath = "//button[text()='Reset']")
	WebElement Reset ;
	public void Reset() {
		clickElement(Reset);}
	
	//Page_next*******************************************************************************************
	@FindBy(xpath = "//li[@id='dataTable_next']")
	WebElement Page_next;
	public void Page_next() {
		clickElement(Page_next);}
	
	//Previous page*****************************************************************************************
	@FindBy(xpath = "//li[@id='dataTable_previous']")
	WebElement Page_pre;
	public void Page_pre() {
		clickElement(Page_pre);}
	
	//New_Student********************************************************************************************
	@FindBy(xpath = "//a[text()= ' + New Student']")
	WebElement New_Student;
	public void New_Student() {
		clickElement(New_Student);}
	
	//create_Name_Textfield********************************************************************************
	@FindBy(xpath = "//input[@id='name']")
	WebElement create_Name;
	public void create_Name(String a) {
		enter_value( create_Name,a);}
	
	//Phone No*********************************************************************************************
	@FindBy(xpath = "//input[@id='phone']")
	WebElement create_Pno;
	public void create_Pno(String a) {
		enter_value(create_Pno,a);}
	
	//Email_Textfield**************************************************************************************
	@FindBy(xpath = "//input[@type='email']")
	WebElement Create_Email;
	public void Create_Email(String a) {
		enter_value(Create_Email,a);}
	
	//Designation_Dropdown*********************************************************************************
	@FindBy(xpath = "//select[@id='role']")
	WebElement Create_Des;
	public void Create_Des(String a) {
		SelectByvisible(Create_Des,a);}
	
	//Study_level_Dropdown*********************************************************************************
	@FindBy(xpath = "//select[@id='los']")
	WebElement Create_level;
	public void Create_level(String a) {
		SelectByvisible(Create_level,a);}
	
	//Industry_Dropdown***********************************************************************************
	@FindBy(xpath = "//select[@id='study_industry']")
	WebElement Create_industry;
	public void Create_industry(String a) {
		SelectByvisible(Create_industry,a);}
	
	//Intake_Dropdown**************************************************************************************
	@FindBy(xpath = "//select[@id='intake']")
	WebElement Create_intake;
	public void Create_intake(String a) {
		SelectByvisible(Create_intake,a);}
	
	//Poc_Dropdown****************************************************************************************
	@FindBy(xpath = "//select[@name='poc']")
	WebElement Create_POC;
	public void Create_POC(String a) {
		SelectByvisible(Create_POC,a);}
	
	//POC_Phone********************************************************************************************
	@FindBy(xpath = "(//input[@name='name'])[2]")
	WebElement Create_Pno;
	public void Create_Pno() {
		get_Text(Create_Pno);}
	
	//Submit_Button***************************************************************************************
	@FindBy(xpath = "//button[text()='Submit Details']")
	WebElement Create_Submit;
	public void Create_Submit() {
		clickElement(Create_Submit);}
	

	//Eye_button_1****************************************************************************************
	@FindBy(xpath = "//p[text()='Action']/../../../../tbody/tr/td[8]/div[2]/a/img")
	WebElement Eye_button_1 ;
	public void Eye_button_1() {
		clickElement(Eye_button_1);}
	
	//Student_name_view_1 ****************************************************************************************
	@FindBy(xpath = "//p[text()='Student Name']/../../../../tr/td[3]//p[@class='bg-tab py-5']")
	WebElement Student_Name_view ;
	public String Student_Name_view() {
	String a=get_Text_Value(Student_Name_view);
			return a;}
	
	
	//Student_Stage_view_1 ****************************************************************************************
	@FindBy(xpath = "//p[text()='Student Name']/../../../../tr/td[7]/div[2]//p")
	WebElement Student_Stage_view_1 ;
	public String Student_Stage_view_1() {
	String a=get_Text_Value(Student_Stage_view_1);
				return a;}
	

	//Student_country_view_1 ****************************************************************************************
	@FindBy(xpath = "//p[text()='Student Name']/../../../../tr/td[6]//p[@class='bg-tab h-16  flex justify-center items-center']")
	WebElement Student_country_view_1 ;
	public String Student_country_view_1() {
	String a=get_Text_Value(Student_country_view_1);
				return a;}
	
	
	
	//Eye_button_2****************************************************************************************
	@FindBy(xpath = "//p[text()='Action']/../../../../tbody/tr[2]/td[8]/div[2]/a/img")
	WebElement Eye_button_2 ;
	public void Eye_button_2() {
		clickElement(Eye_button_2);}
	
	//Eye_button_3****************************************************************************************
	@FindBy(xpath = "//p[text()='Action']/../../../../tbody/tr[3]/td[8]/div[2]/a/img")
	WebElement Eye_button_3 ;
	public void Eye_button_3() {
	    clickElement(Eye_button_3);}	
	
	//Eye_button_4****************************************************************************************
	@FindBy(xpath = "//p[text()='Action']/../../../../tbody/tr[4]/td[8]/div[2]/a/img")
	WebElement Eye_button_4 ;
	public void Eye_button_4() {
	    clickElement(Eye_button_4);}	
	
	//Eye_button_5****************************************************************************************
	@FindBy(xpath = "//p[text()='Action']/../../../../tbody/tr[5]/td[8]/div[2]/a/img")
	WebElement Eye_button_5 ;
	public void Eye_button_5() {
		clickElement(Eye_button_5);}
		
	//Eye_button_6****************************************************************************************
	@FindBy(xpath = "//p[text()='Action']/../../../../tbody/tr[6]/td[8]/div[2]/a/img")
	WebElement Eye_button_6 ;
	public void Eye_button_6() {
		clickElement(Eye_button_6);}	
	
	//Eye_button_7****************************************************************************************
	@FindBy(xpath = "//p[text()='Action']/../../../../tbody/tr[7]/td[8]/div[2]/a/img")
	WebElement Eye_button_7 ;
	public void Eye_button_7() {
		clickElement(Eye_button_7);}	
	
	//Eye_button_8****************************************************************************************
	@FindBy(xpath = "//p[text()='Action']/../../../../tbody/tr[8]/td[8]/div[2]/a/img")
	WebElement Eye_button_8 ;
	public void Eye_button_8() {
		clickElement(Eye_button_8);}	
	

	//Eye_button_9****************************************************************************************
	@FindBy(xpath = "//p[text()='Action']/../../../../tbody/tr[9]/td[8]/div[2]/a/img")
	WebElement Eye_button_9 ;
	public void Eye_button_9() {
		clickElement(Eye_button_9);}
	
	//Eye_button_10****************************************************************************************
	@FindBy(xpath = "//p[text()='Action']/../../../../tbody/tr[9]/td[8]/div[2]/a/img")
	WebElement Eye_button_10 ;
	public void Eye_button_10() {
			clickElement(Eye_button_10);}
	
	//Student_name_view_1 in Student details page ****************************************************************************************
	@FindBy(xpath = "//div[text()='Student Name']/following-sibling::div")
	WebElement Student_Name_view_details ;
	public String Student_Name_view_deatils() {
	String a=get_Text_Value(Student_Name_view_details);
			return a;}
		
		
	//EDIT_button****************************************************************************************
	@FindBy(xpath = "//p[text()='Action']/../../../../tbody/tr[9]/td[8]/div[2]/a/img")
	WebElement edit_button ;
	public void edit_button() {
			clickElement(edit_button);}
	
	//Edit_name_Textfield**********************************************************************************
	@FindBy(xpath = "//input[@id='name']")
	WebElement Edit_name;
	public void Edit_name(String a) {
		get_Text(Edit_name);
		clickElement(Edit_name);
		
		enter_value(Edit_name,a);}
	
	//Edit_Phone_Textfield********************************************************************************
	@FindBy(xpath = "//input[@id='name']")
	WebElement Edit_Phone;
	public void Edit_Phone(String a) {
		get_Text(Edit_Phone);
		clickElement(Edit_Phone);
		enter_value(Edit_Phone,a);}
	
	//Edit_email********************************************************************************************
	@FindBy(xpath = "//input[@name='email']")
	WebElement Edit_email;
	public void Edit_email(String a) {
		get_Text(Edit_email);
		clickElement(Edit_email);
		enter_value(Edit_email,a);}
	
	//Edit_Designation_Dropdown******************************************************************************
	@FindBy(xpath = "//select[@id='role']")
	WebElement Edit_Desc;
	public void Edit_Desc() {
		System.out.println("Study Designation");
		is_Enable(Edit_Desc);
		get_Text(Edit_Desc);}
	
	//Edit_level***********************************************************************************************
	@FindBy(xpath = "//select[@id='los']")
	WebElement Edit_level;
	public void Edit_level() {
		System.out.println("Study level");
		is_Enable(Edit_level);
		get_Text(Edit_level);}
	
	//Industry_Dropdown***********************************************************************************
	@FindBy(xpath = "//select[@id='study_industry']")
	WebElement Edit_industry;
	public void Edit_industry() {
	System.out.println("Study Industry");
		is_Enable(Edit_industry);
		get_Text(Edit_industry);}
		
		//Intake_Dropdown**************************************************************************************
	@FindBy(xpath = "//select[@id='intake']")
	WebElement Edit_intake;
	public void Edit_intake() {
		System.out.println("intake");
		is_Enable(Edit_intake);
		get_Text(Edit_intake);}
		
		//Poc_Dropdown****************************************************************************************
	@FindBy(xpath = "//select[@name='poc']")
	WebElement Edit_POC;
	public void Edit_POC(int a) {
		Select_By_Index(Edit_POC,a);}
		
	//POC_Phone********************************************************************************************
	@FindBy(xpath = "(//input[@name='name'])[2]")
	WebElement Edit_Pno;
	public void Edit_Pno() {
		get_Text(Edit_Pno);}
		
	//Submit_Button***************************************************************************************
	@FindBy(xpath = "//button[text()='Submit Details']")
	WebElement Edit_Submit;
	public void Edit_Submit() {
		get_Text(Edit_Submit);}
	
	//Check_Box_1*********************************************************************************************
	@FindBy(xpath = "//div[text()='Gathering Checklists']/../../div[3]/div/div/div//input[@class='relative top-1 custom-check-box']")
	WebElement Check_Box_1;
	public void Check_Box_1() {
		clickElement(Check_Box_1);}	
	
	//Check_Box_2*********************************************************************************************
	@FindBy(xpath = "//div[text()='Gathering Checklists']/../../div[3]/div/div/div[2]//input[@class='relative top-1 custom-check-box']")
	WebElement Check_Box_2;
	public void Check_Box_2() {
		clickElement(Check_Box_2);}	
	
	//Check_Box_3*********************************************************************************************
	@FindBy(xpath = "//div[text()='Gathering Checklists']/../../div[3]/div/div/div[3]//input[@class='relative top-1 custom-check-box']")
	WebElement Check_Box_3;
	public void Check_Box_3() {
		clickElement(Check_Box_3);}	
	
	//Check_Box_4*********************************************************************************************
	@FindBy(xpath = "//div[text()='Gathering Checklists']/../../div[3]/div/div/div[4]//input[@class='relative top-1 custom-check-box']")
	WebElement Check_Box_4;
	public void Check_Box_4() {
		clickElement(Check_Box_4);}	
	
	//Check_Box_5*********************************************************************************************
	@FindBy(xpath = "//div[text()='Gathering Checklists']/../../div[3]/div/div/div[5]//input[@class='relative top-1 custom-check-box']")
	WebElement Check_Box_5;
	public void Check_Box_5() {
		clickElement(Check_Box_5);}	
	
	//Check_Box_6*********************************************************************************************
	@FindBy(xpath = "//div[text()='Gathering Checklists']/../../div[3]/div/div/div[6]//input[@class='relative top-1 custom-check-box']")
	WebElement Check_Box_6;
	public void Check_Box_6() {
		clickElement(Check_Box_6);}	
	
	//Check_Box_7*********************************************************************************************
	@FindBy(xpath = "//div[text()='Gathering Checklists']/../../div[3]/div/div/div[7]//input[@class='relative top-1 custom-check-box']")
	WebElement Check_Box_7;
	public void Check_Box_7() {
		clickElement(Check_Box_7);}	
		
	//Check_Box_8*********************************************************************************************
	@FindBy(xpath = "//div[text()='Gathering Checklists']/../../div[3]/div/div[3]/div//input[@class='relative top-1']")
	WebElement Check_Box_8;
	public void Check_Box_8() {
		clickElement(Check_Box_8);}	
	
	//Check_Box_9*********************************************************************************************
	@FindBy(xpath = "//div[text()='Gathering Checklists']/../../div[3]/div/div[3]/div[2]//input[@class='relative top-1']")
	WebElement Check_Box_9;
	public void Check_Box_9() {
		clickElement(Check_Box_9);}	
			
	//Check_Box_10*********************************************************************************************
	@FindBy(xpath = "//div[text()='Gathering Checklists']/../../div[3]/div/div[3]/div[3]///input[@class='relative top-1']")
	WebElement Check_Box_10;
	public void Check_Box_10() {
		clickElement(Check_Box_10);}	
	
	//Check_Box_11*********************************************************************************************
	@FindBy(xpath = "//div[text()='Gathering Checklists']/../../div[3]/div/div[3]/div[4]///input[@class='relative top-1']")
	WebElement Check_Box_11;
	public void Check_Box_11() {
		clickElement(Check_Box_11);}
	
	//Check_Box_12*********************************************************************************************
	@FindBy(xpath = "//div[text()='Gathering Checklists']/../../div[3]/div/div[3]/div[5]///input[@class='relative top-1']")
	WebElement Check_Box_12;
	public void Check_Box_12() {
		clickElement(Check_Box_12);}	
	
	//Check_Box_13*********************************************************************************************
	@FindBy(xpath = "//div[text()='Gathering Checklists']/../../div[3]/div/div[3]/div[5]///input[@class='relative top-1']")
	WebElement Check_Box_13;
	public void Check_Box_13() {
			clickElement(Check_Box_13);}
	
	//Upload_1*********************************************************************************************
	@FindBy(xpath = "//th[text()='Action']/../../../tbody/tr/td[4]/div[2]//img[@class='cursor-pointer']")
	WebElement Upload_1;
	public void Upload_1() {
		 clickElement(Upload_1);}
	
	//Upload_2*********************************************************************************************
	@FindBy(xpath = "//th[text()='Action']/../../../tbody[2]/tr/td[4]/div[2]//img[@class='cursor-pointer']")
	WebElement Upload_2;
	public void Upload_2() {
		clickElement(Upload_2);}
	
	//Upload_3*********************************************************************************************
	@FindBy(xpath = "//th[text()='Action']/../../../tbody[3]/tr/td[4]/div[2]//img[@class='cursor-pointer']")
	WebElement Upload_3;
	public void Upload_3() {
			clickElement(Upload_3);}
		
	//Upload_4*********************************************************************************************
	@FindBy(xpath = "//th[text()='Action']/../../../tbody[4]/tr/td[4]/div[2]//img[@class='cursor-pointer']")
	WebElement Upload_4;
	public void Upload_4() {
			clickElement(Upload_4);}
				
	//Upload_5*********************************************************************************************
	@FindBy(xpath = "//th[text()='Action']/../../../tbody[5]/tr/td[4]/div[2]//img[@class='cursor-pointer']")
	WebElement Upload_5;
	public void Upload_5() {
			clickElement(Upload_5);}
	
	//Upload_6*********************************************************************************************
	@FindBy(xpath = "//th[text()='Action']/../../../tbody[6]/tr/td[4]/div[2]//img[@class='cursor-pointer']")
	WebElement Upload_6;
	public void Upload_6() {
		clickElement(Upload_6);}
	
	//Upload_7*********************************************************************************************
	@FindBy(xpath = "//th[text()='Action']/../../../tbody[7]/tr/td[4]/div[2]//img[@class='cursor-pointer']")
	WebElement Upload_7;
	public void Upload_7() {
		clickElement(Upload_7);}
	
	//Upload_8*********************************************************************************************
	@FindBy(xpath = "//th[text()='Action']/../../../tbody[8]/tr/td[4]/div[2]//img[@class='cursor-pointer']")
	WebElement Upload_8;
	public void Upload_8() {
		clickElement(Upload_8);}
	
	//Upload_9*********************************************************************************************
	@FindBy(xpath = "//th[text()='Action']/../../../tbody[9]/tr/td[4]/div[2]//img[@class='cursor-pointer']")
	WebElement Upload_9;
	public void Upload_9() {
		clickElement(Upload_9);}

	
	//Upload_10*********************************************************************************************
	@FindBy(xpath = "//th[text()='Action']/../../../tbody[10]/tr/td[4]/div[2]//img[@class='cursor-pointer']")
	WebElement Upload_10;
	public void Upload_10() {
		clickElement(Upload_10);}
	
	//Upload_11*********************************************************************************************
	@FindBy(xpath = "//th[text()='Action']/../../../tbody[11]/tr/td[4]/div[2]//img[@class='cursor-pointer']")
	WebElement Upload_11;
	public void Upload_11() {
			clickElement(Upload_11);}
	
	//Upload_12*********************************************************************************************
	@FindBy(xpath = "//th[text()='Action']/../../../tbody[11]/tr/td[4]/div[2]//img[@class='cursor-pointer']")
	WebElement Upload_12;
	public void Upload_12() {
		clickElement(Upload_12);}
	
	//Upload_13*********************************************************************************************
	@FindBy(xpath = "//th[text()='Action']/../../../tbody[11]/tr/td[4]/div[2]//img[@class='cursor-pointer']")
	WebElement Upload_13;
	public void Upload_13() {
		clickElement(Upload_13);}
		
	//Upload_File*********************************************************************************************
	@FindBy(xpath = "//p[text()='Upload Status of Purpose Document']/../../div[2]/label//span[text()='Attach Document']")
	WebElement Upload_File;
	public void Upload_File() {
		clickElement(Upload_File);}
	
	//Upload_Submit*********************************************************************************************
	@FindBy(xpath = "//button[text()='Submit']")
	WebElement Upload_Submit;
	public void Upload_Submit() {
			clickElement(Upload_Submit);}
	
	//Upload_Download_1*********************************************************************************************
	@FindBy(xpath = "//th[text()='Action']/../../../tbody/tr/td[4]/div[2]//img[@alt='alt']")
	WebElement Upload_Download_1;
	public void Upload_Download_1() {
		clickElement(Upload_Download_1);}
	
	//Upload_Download_2*********************************************************************************************
	@FindBy(xpath = "//th[text()='Action']/../../../tbody[2]/tr/td[4]/div[2]//img[@alt='alt']")
	WebElement Upload_Download_2;
	public void Upload_Download_2() {
		clickElement(Upload_Download_2);}
	
	//Upload_Download_3*********************************************************************************************
	@FindBy(xpath = "//th[text()='Action']/../../../tbody[3]/tr/td[4]/div[2]//img[@alt='alt']")
	WebElement Upload_Download_3;
	public void Upload_Download_3() {
	    clickElement(Upload_Download_3);}
	
	//Upload_Download_4*********************************************************************************************
	@FindBy(xpath = "//th[text()='Action']/../../../tbody[4]/tr/td[4]/div[2]//img[@alt='alt']")
	WebElement Upload_Download_4;
	public void Upload_Download_4() {
		 clickElement(Upload_Download_4);}
	
	//Upload_Download_5*********************************************************************************************
	@FindBy(xpath = "//th[text()='Action']/../../../tbody[5]/tr/td[4]/div[2]//img[@alt='alt']")
	WebElement Upload_Download_5;
	public void Upload_Download_5() {
		  clickElement(Upload_Download_5);}
	
	//Upload_Download_6*********************************************************************************************
	@FindBy(xpath = "//th[text()='Action']/../../../tbody[6]/tr/td[4]/div[2]//img[@alt='alt']")
	WebElement Upload_Download_6;
	public void Upload_Download_6() {
		 clickElement(Upload_Download_6);}
	
	//Upload_Download_7*********************************************************************************************
	@FindBy(xpath = "//th[text()='Action']/../../../tbody[7]/tr/td[4]/div[2]//img[@alt='alt']")
	WebElement Upload_Download_7;
	public void Upload_Download_7() {
		  clickElement(Upload_Download_7);}
	
	//Upload_Download_8*********************************************************************************************
	@FindBy(xpath = "//th[text()='Action']/../../../tbody[8]/tr/td[4]/div[2]//img[@alt='alt']")
	WebElement Upload_Download_8;
	public void Upload_Download_8() {
		 clickElement(Upload_Download_8);}
	
	//Upload_Download_9*********************************************************************************************
	@FindBy(xpath = "//th[text()='Action']/../../../tbody[9]/tr/td[4]/div[2]//img[@alt='alt']")
	WebElement Upload_Download_9;
	public void Upload_Download_9() {
		    clickElement(Upload_Download_9);}
	
	//Upload_Download_10*********************************************************************************************
	@FindBy(xpath = "//th[text()='Action']/../../../tbody[10]/tr/td[4]/div[2]//img[@alt='alt']")
	WebElement Upload_Download_10;
	public void Upload_Download_10() {
		  clickElement(Upload_Download_10);}
	
	//Upload_Download_11*********************************************************************************************
	@FindBy(xpath = "//th[text()='Action']/../../../tbody[11]/tr/td[4]/div[2]//img[@alt='alt']")
	WebElement Upload_Download_11;
	public void Upload_Download_11() {
		  clickElement(Upload_Download_11);}
	
	//Upload_Download_12*********************************************************************************************
	@FindBy(xpath = "//th[text()='Action']/../../../tbody[12]/tr/td[4]/div[2]//img[@alt='alt']")
	WebElement Upload_Download_12;
	public void Upload_Download_12() {
		   clickElement(Upload_Download_12);}
	
	//Upload_Download_13*********************************************************************************************
	@FindBy(xpath = "//th[text()='Action']/../../../tbody[13]/tr/td[4]/div[2]//img[@alt='alt']")
	WebElement Upload_Download_13;
	public void Upload_Download_13() {
		   clickElement(Upload_Download_13);}	
	
	//Upload_Remove_1*********************************************************************************************
	@FindBy(xpath = "//th[text()='Action']/../../../tbody/tr/td[4]/div[2]//img[@alt='reload']")
	WebElement Upload_Remove_1;
	public void Upload_Remove_1() {
	      clickElement(Upload_Remove_1);}
	
	//Upload_Remove_2*********************************************************************************************
	@FindBy(xpath = "//th[text()='Action']/../../../tbody[2]/tr/td[4]/div[2]//img[@alt='reload']")
	WebElement Upload_Remove_2;
	public void Upload_Remove_2() {
		 clickElement(Upload_Remove_2);}
	
	//Upload_Remove_3*********************************************************************************************
	@FindBy(xpath = "//th[text()='Action']/../../../tbody[3]/tr/td[4]/div[2]//img[@alt='reload']")
	WebElement Upload_Remove_3;
	public void Upload_Remove_3() {
		   clickElement(Upload_Remove_3);}
	
	//Upload_Remove_4*********************************************************************************************
	@FindBy(xpath = "//th[text()='Action']/../../../tbody[4]/tr/td[4]/div[2]//img[@alt='reload']")
	WebElement Upload_Remove_4;
	public void Upload_Remove_4() {
		  clickElement(Upload_Remove_4);}
		
	
	//Upload_Remove_5*********************************************************************************************
	@FindBy(xpath = "//th[text()='Action']/../../../tbody[5]/tr/td[4]/div[2]//img[@alt='reload']")
	WebElement Upload_Remove_5;
	public void Upload_Remove_5() {
		 clickElement(Upload_Remove_5);}
	
	//Upload_Remove_6*********************************************************************************************
	@FindBy(xpath = "//th[text()='Action']/../../../tbody[6]/tr/td[4]/div[2]//img[@alt='reload']")
	WebElement Upload_Remove_6;
	public void Upload_Remove_6() {
		clickElement(Upload_Remove_6);}
	
	//Upload_Remove_7*********************************************************************************************
	@FindBy(xpath = "//th[text()='Action']/../../../tbody[7]/tr/td[4]/div[2]//img[@alt='reload']")
	WebElement Upload_Remove_7;
	public void Upload_Remove_7() {
		clickElement(Upload_Remove_7);}
	
	//Upload_Remove_8*********************************************************************************************
	@FindBy(xpath = "//th[text()='Action']/../../../tbody[8]/tr/td[4]/div[2]//img[@alt='reload']")
	WebElement Upload_Remove_8;
	public void Upload_Remove_8() {
		 clickElement(Upload_Remove_8);}
	
	//Upload_Remove_9*********************************************************************************************
	@FindBy(xpath = "//th[text()='Action']/../../../tbody[9]/tr/td[4]/div[2]//img[@alt='reload']")
	WebElement Upload_Remove_9;
	public void Upload_Remove_9() {
		 clickElement(Upload_Remove_9);}
			
	//Upload_Remove_10*********************************************************************************************
	@FindBy(xpath = "//th[text()='Action']/../../../tbody[10]/tr/td[4]/div[2]//img[@alt='reload']")
	WebElement Upload_Remove_10;
	public void Upload_Remove_10() {
	     clickElement(Upload_Remove_10);}
	
	//Upload_Remove_11*********************************************************************************************
	@FindBy(xpath = "//th[text()='Action']/../../../tbody11]/tr/td[4]/div[2]//img[@alt='reload']")
	WebElement Upload_Remove_11;
	public void Upload_Remove_11() {
		 clickElement(Upload_Remove_11);}
	
	//Upload_Remove_12 icon*********************************************************************************************
	@FindBy(xpath = "//th[text()='Action']/../../../tbody[12]/tr/td[4]/div[2]//img[@alt='reload']")
	WebElement Upload_Remove_12;
	public void Upload_Remove_12() {
		 clickElement(Upload_Remove_12);}
	
	//Upload_Remove_13 icon*********************************************************************************************
	@FindBy(xpath = "//th[text()='Action']/../../../tbody[13]/tr/td[4]/div[2]//img[@alt='reload']")
	WebElement Upload_Remove_13;
	public void Upload_Remove_13() {
		 clickElement(Upload_Remove_13);}
	
	//Upload_Rem_Yes pop up*********************************************************************************************
	@FindBy(xpath = "//p[text()='Are you sure want to Delete this Document?']/../../div[2]//button[text()='Yes']")
	WebElement Upload_Rem_Yes;
	public void Upload_Rem_Yes() {
		clickElement(Upload_Rem_Yes);}
			

	//Next_Stage Button*********************************************************************************************
	@FindBy(xpath = "(//div[@class=\"flex justify-end mt-3\"]//button[text()='Next Stage '])[2]")
	WebElement Next_Stage;
	public void Next_Stage() {
		clickElement(Next_Stage);}
	
	
	//University Dropdown*********************************************************************************************
	@FindBy(xpath = "(//option[text()='Select University'])[2]")
	WebElement University;
	public void University(String a) {
		SelectByvisible(University,a);}
	
	//Add_University icon*********************************************************************************************
	@FindBy(xpath = "(//div[text()='University Application'])[2]/../../div[2]/form/div/div/div/button/span//img[@class='mr-2 object-contain']")
	WebElement Add_University ;
	public void Add_University() {
		clickElement(Add_University);}
	
	//University_Status_1 dropdown*********************************************************************************************
	@FindBy(xpath = "//th[text()='Application Status']/../../../tbody/tr/td[3]//select[@class='bg-tab py-3 px-2 rounded-xl']")
	WebElement University_Status_1 ;
	public void University_Status_1(String a) {
		SelectByvisible(University_Status_1,a);}
	
	//University_Status_2 dropdown*********************************************************************************************
	@FindBy(xpath = "//th[text()='Application Status']/../../../tbody[2]/tr/td[3]//select[@class='bg-tab py-3 px-2 rounded-xl']")
	WebElement University_Status_2 ;
	public void University_Status_2(String a) {
		SelectByvisible(University_Status_2,a);}
	
	//University_Status_3 dropdown*********************************************************************************************
	@FindBy(xpath = "//th[text()='Application Status']/../../../tbody[3]/tr/td[3]//select[@class='bg-tab py-3 px-2 rounded-xl']")
	WebElement University_Status_3 ;
	public void University_Status_3(String a) {
		SelectByvisible(University_Status_3,a);}
	
	//University_Status_4 dropdown*********************************************************************************************
	@FindBy(xpath = "//th[text()='Application Status']/../../../tbody[4]/tr/td[3]//select[@class='bg-tab py-3 px-2 rounded-xl']")
	WebElement University_Status_4 ;
	public void University_Status_4(String a) {
		SelectByvisible(University_Status_4,a);}
	
	//University_Update_1 Link*********************************************************************************************
	@FindBy(xpath = "//th[text()='Application Status']/../../../tbody/tr/td[3]//p[text()='Update']")
	WebElement University_Update_1 ;
	public void University_Update_1() {
		clickElement(University_Update_1);}
	
	//University_Update_2 Link*********************************************************************************************
	@FindBy(xpath = "//th[text()='Application Status']/../../../tbody[2]/tr/td[3]//p[text()='Update']")
	WebElement University_Update_2 ;
	public void University_Update_2() {
		clickElement(University_Update_2);}
	
	//University_Update_3 Link*********************************************************************************************
	@FindBy(xpath = "//th[text()='Application Status']/../../../tbody[3]/tr/td[3]//p[text()='Update']")
	WebElement University_Update_3 ;
	public void University_Update_3() {
		clickElement(University_Update_3);}
	
	//University_Update_4 Link*********************************************************************************************
	@FindBy(xpath = "//th[text()='Application Status']/../../../tbody[4]/tr/td[3]//p[text()='Update']")
	WebElement University_Update_4 ;
	public void University_Update_4() {
		clickElement(University_Update_4);}
	
	//University_Upload_1 icon*********************************************************************************************
	@FindBy(xpath = "(//th[text()='Action'])[2]/../../../tbody/tr/td[6]/div[2]//img[@class='cursor-pointer']")
	WebElement University_Upload_1 ;
	public void University_Upload_1() {
		clickElement(University_Upload_1);}
	
	//University_Upload_2 icon*********************************************************************************************
	@FindBy(xpath = "(//th[text()='Action'])[2]/../../../tbody[2]/tr/td[6]/div[2]//img[@class='cursor-pointer']")
	WebElement University_Upload_2 ;
	public void University_Upload_2() {
		clickElement(University_Upload_2);}
	
	//University_Upload_3 icon*********************************************************************************************
	@FindBy(xpath = "(//th[text()='Action'])[2]/../../../tbody[3]/tr/td[6]/div[2]//img[@class='cursor-pointer']")
	WebElement University_Upload_3 ;
	public void University_Upload_3() {
		clickElement(University_Upload_3);}
	
	//University_Upload_4 icon*********************************************************************************************
	@FindBy(xpath = "(//th[text()='Action'])[2]/../../../tbody[4]/tr/td[6]/div[2]//img[@class='cursor-pointer']")
	WebElement University_Upload_4 ;
	public void University_Upload_4() {
		clickElement(University_Upload_4);}
	
	//University_downlad_1 icon*********************************************************************************************
	@FindBy(xpath = "(//th[text()='Action'])[2]/../../../tbody/tr/td[6]/div[2]/img[@class='cursor-pointer']")
	WebElement University_downlad_1 ;
	public void University_downlad_1() {
		clickElement(University_downlad_1);}
	
	//University_downlad_2 icon*********************************************************************************************
	@FindBy(xpath = "(//th[text()='Action'])[2]/../../../tbody[2]/tr/td[6]/div[2]/img[@class='cursor-pointer']")
	WebElement University_downlad_2 ;
	public void University_downlad_2() {
		clickElement(University_downlad_2);}
	
	//University_downlad_3 icon*********************************************************************************************
	@FindBy(xpath = "(//th[text()='Action'])[2]/../../../tbody[3]/tr/td[6]/div[2]/img[@class='cursor-pointer']")
	WebElement University_downlad_3 ;
	public void University_downlad_3() {
		clickElement(University_downlad_3);}
	
	//University_downlad_4 icon*********************************************************************************************
	@FindBy(xpath = "(//th[text()='Action'])[2]/../../../tbody[4]/tr/td[6]/div[2]/img[@class='cursor-pointer']")
	WebElement University_downlad_4 ;
	public void University_downlad_4() {
		clickElement(University_downlad_4);}
	
	//University_reload_1 icon*********************************************************************************************
	@FindBy(xpath = "(//th[text()='Action'])[2]/../../../tbody/tr/td[6]/div[2]//img[@alt='reload']")
	WebElement University_reload_1 ;
	public void University_reload_1() {
		clickElement(University_reload_1);}
	
	//University_reload_2 icon*********************************************************************************************
	@FindBy(xpath = "(//th[text()='Action'])[2]/../../../tbody[2]/tr/td[6]/div[2]//img[@alt='reload']")
	WebElement University_reload_2 ;
	public void University_reload_2() {
		clickElement(University_reload_2);}
	
	//University_reload_3 icon*********************************************************************************************
	@FindBy(xpath = "(//th[text()='Action'])[2]/../../../tbody[3]/tr/td[6]/div[2]//img[@alt='reload']")
	WebElement University_reload_3 ;
	public void University_reload_3() {
		clickElement(University_reload_3);}
	
	//University_reload_4 icon*********************************************************************************************
	@FindBy(xpath = "(//th[text()='Action'])[2]/../../../tbody[4]/tr/td[6]/div[2]//img[@alt='reload']")
	WebElement University_reload_4 ;
	public void University_reload_4() {
		clickElement(University_reload_4);}
	
	//University_Next_1 icon*********************************************************************************************
	@FindBy(xpath = "(//button[text()='Next Stage '])[2]")
	WebElement University_Next_1 ;
	public void University_Next_1 () {
		clickElement(University_Next_1);}
	
	//Pre_cas_Checkbox_1 icon*********************************************************************************************
	@FindBy(xpath = "(//div[text()='Pre-CAS Process'])[2]/../../div[2]/div/div//input[@class='relative top-1']")
	WebElement Pre_cas_Checkbox_1 ;
	public void Pre_cas_Checkbox_1 () {
		clickElement(Pre_cas_Checkbox_1);}
	
	//Pre_cas_Checkbox_2 icon*********************************************************************************************
	@FindBy(xpath = "(//div[text()='Pre-CAS Process'])[2]/../../div[2]/div/div[2]//input[@class='relative top-1']")
	WebElement Pre_cas_Checkbox_2 ;
	public void Pre_cas_Checkbox_2 () {
		clickElement(Pre_cas_Checkbox_2);}
	

	//Pre_cas_Checkbox_3 icon*********************************************************************************************
	@FindBy(xpath = "(//div[text()='Pre-CAS Process'])[2]/../../div[2]/div/div[3]//input[@class='relative top-1']")
	WebElement Pre_cas_Checkbox_3 ;
	public void Pre_cas_Checkbox_3 () {
		clickElement(Pre_cas_Checkbox_3);}
	
	//Pre_cas_Checkbox_4 icon*********************************************************************************************
	@FindBy(xpath = "(//div[text()='Pre-CAS Process'])[2]/../../div[2]/div/div[4]//input[@class='relative top-1']")
	WebElement Pre_cas_Checkbox_4 ;
	public void Pre_cas_Checkbox_4 () {
		clickElement(Pre_cas_Checkbox_4);}
		
	//Pre_cas_Checkbox_5 icon*********************************************************************************************
	@FindBy(xpath = "(//div[text()='Pre-CAS Process'])[2]/../../div[2]/div/div[5]//input[@class='relative top-1']")
    WebElement Pre_cas_Checkbox_5 ;
	public void Pre_cas_Checkbox_5 () {
		clickElement(Pre_cas_Checkbox_5);}
	
	//Pre_cas_Checkbox_6 icon*********************************************************************************************
	@FindBy(xpath = "(//div[text()='Pre-CAS Process'])[2]/../../div[2]/div/div[6]//input[@class='relative top-1']")
    WebElement Pre_cas_Checkbox_6 ;
	public void Pre_cas_Checkbox_6 () {
		clickElement(Pre_cas_Checkbox_6);}
	
	//Pre_cas_Request icon*********************************************************************************************
	@FindBy(xpath = "(//div[text()='Pre-CAS Process'])[2]/../../div[2]/div[2]//button[text()='Request Document']")
	WebElement Pre_cas_Request ;
	public void Pre_cas_Request () {
		clickElement(Pre_cas_Request);}
	
	//Pre_cas_Upload_1 icon*********************************************************************************************
	@FindBy(xpath = "(//th[text()='Action'])[3]/../../../tbody/tr/td[4]/div[2]//img[@class='cursor-pointer']")
	WebElement Pre_cas_Upload_1 ;
	public void Pre_cas_Upload_1 () {
		clickElement(Pre_cas_Upload_1);}
	
	//Pre_cas_Upload_2 icon*********************************************************************************************
	@FindBy(xpath = "(//th[text()='Action'])[3]/../../../tbody[2]/tr/td[4]/div[2]//img[@class='cursor-pointer']")
	WebElement Pre_cas_Upload_2 ;
	public void Pre_cas_Upload_2 () {
		clickElement(Pre_cas_Upload_2);}
	
	//Pre_cas_Upload_3 icon*********************************************************************************************
	@FindBy(xpath = "(//th[text()='Action'])[3]/../../../tbody[3]/tr/td[4]/div[2]//img[@class='cursor-pointer']")
	WebElement Pre_cas_Upload_3 ;
	public void Pre_cas_Upload_3 () {
		clickElement(Pre_cas_Upload_3);}
	
	//Pre_cas_Upload_4 icon*********************************************************************************************
	@FindBy(xpath = "(//th[text()='Action'])[3]/../../../tbody[4]/tr/td[4]/div[2]//img[@class='cursor-pointer']")
	WebElement Pre_cas_Upload_4 ;
	public void Pre_cas_Upload_4 () {
		clickElement(Pre_cas_Upload_4);}
	
	//Pre_cas_Upload_5 icon*********************************************************************************************
	@FindBy(xpath = "(//th[text()='Action'])[3]/../../../tbody[5]/tr/td[4]/div[2]//img[@class='cursor-pointer']")
	WebElement Pre_cas_Upload_5 ;
	public void Pre_cas_Upload_5 () {
		clickElement(Pre_cas_Upload_5);}
	
	//Pre_cas_Upload_6 icon*********************************************************************************************
	@FindBy(xpath = "(//th[text()='Action'])[3]/../../../tbody[6]/tr/td[4]/div[2]//img[@class='cursor-pointer']")
	WebElement Pre_cas_Upload_6 ;
	public void Pre_cas_Upload_6 () {
		clickElement(Pre_cas_Upload_6);}
	
	//Pre_cas_Dowoad_1 icon*********************************************************************************************
	@FindBy(xpath = "(//th[text()='Action'])[3]/../../../tbody/tr/td[4]/div[2]//img[@alt='alt']")
	WebElement Pre_cas_Dowoad_1 ;
	public void Pre_cas_Dowoad_1 () {
		clickElement(Pre_cas_Dowoad_1);}
	
	//Pre_cas_Download_2 icon*********************************************************************************************
	@FindBy(xpath = "(//th[text()='Action'])[3]/../../../tbody[2]/tr/td[4]/div[2]//img[@alt='alt']")
	WebElement Pre_cas_Download_2 ;
	public void Pre_cas_Download_2 () {
		clickElement(Pre_cas_Download_2);}
	
	//Pre_cas_Download_3 icon*********************************************************************************************
	@FindBy(xpath = "(//th[text()='Action'])[3]/../../../tbody[3]/tr/td[4]/div[2]//img[@alt='alt']")
	WebElement Pre_cas_Download_3 ;
	public void Pre_cas_Download_3 () {
		clickElement(Pre_cas_Download_3);}
	
	//Pre_cas_Download_4 icon*********************************************************************************************
	@FindBy(xpath = "(//th[text()='Action'])[3]/../../../tbody[4]/tr/td[4]/div[2]//img[@alt='alt']")
	WebElement Pre_cas_Download_4 ;
	public void Pre_cas_Download_4 () {
		clickElement(Pre_cas_Download_4);}
	
	//Pre_cas_Download_5 icon*********************************************************************************************
	@FindBy(xpath = "(//th[text()='Action'])[3]/../../../tbody[5]/tr/td[4]/div[2]//img[@alt='alt']")
	WebElement Pre_cas_Download_5 ;
	public void Pre_cas_Download_5 () {
		clickElement(Pre_cas_Download_5);}
	
	//Pre_cas_Download_6 icon*********************************************************************************************
	@FindBy(xpath = "(//th[text()='Action'])[3]/../../../tbody[6]/tr/td[4]/div[2]//img[@alt='alt']")
	WebElement Pre_cas_Download_6 ;
	public void Pre_cas_Download_6 () {
		clickElement(Pre_cas_Download_6);}
	
	//Pre_cas_Reload_1 icon*********************************************************************************************
	@FindBy(xpath = "(//th[text()='Action'])[3]/../../../tbody/tr/td[4]/div[2]//img[@alt='reload']")
	WebElement Pre_cas_Reload_1 ;
	public void Pre_cas_Reload_1 () {
		clickElement(Pre_cas_Reload_1);}
	
	//Pre_cas_Reload_2 icon*********************************************************************************************
	@FindBy(xpath = "(//th[text()='Action'])[3]/../../../tbody[2]/tr/td[4]/div[2]//img[@alt='reload']")
	WebElement Pre_cas_Reload_2 ;
	public void Pre_cas_Reload_2 () {
		clickElement(Pre_cas_Reload_2);}
	
	//Pre_cas_Reload_3 icon*********************************************************************************************
	@FindBy(xpath = "(//th[text()='Action'])[3]/../../../tbody[3]/tr/td[4]/div[2]//img[@alt='reload']")
	WebElement Pre_cas_Reload_3 ;
	public void Pre_cas_Reload_3 () {
		clickElement(Pre_cas_Reload_3);}
	
	//Pre_cas_Reload_4 icon*********************************************************************************************
	@FindBy(xpath = "(//th[text()='Action'])[3]/../../../tbody[4]/tr/td[4]/div[2]//img[@alt='reload']")
	WebElement Pre_cas_Reload_4 ;
	public void Pre_cas_Reload_4 () {
		clickElement(Pre_cas_Reload_4);}
	
	//Pre_cas_Reload_5 icon*********************************************************************************************
	@FindBy(xpath = "(//th[text()='Action'])[3]/../../../tbody[5]/tr/td[4]/div[2]//img[@alt='reload']")
	WebElement Pre_cas_Reload_5 ;
	public void Pre_cas_Reload_5 () {
	    clickElement(Pre_cas_Reload_5);}
	
	//Pre_cas_Reload_6 icon*********************************************************************************************
	@FindBy(xpath = "(//th[text()='Action'])[3]/../../../tbody[6]/tr/td[4]/div[2]//img[@alt='reload']")
	WebElement Pre_cas_Reload_6 ;
	public void Pre_cas_Reload_6 () {
	    clickElement(Pre_cas_Reload_6);}
	
	//Pre_cas_Next icon*********************************************************************************************
	@FindBy(xpath = "(//button[text()='Next Stage '])[3]")
	WebElement Pre_cas_Next ;
	public void Pre_cas_Next () {
		clickElement(Pre_cas_Next);}
	
	//Finance_Tution_Fee Textfield*********************************************************************************************
	@FindBy(xpath = "//input[@class='py-2  bg-tab border-none rounded-r-lg']")
	WebElement Finance_Tution_Fee ;
	public void Finance_Tution_Fee (String a) {
		enter_value(Finance_Tution_Fee,a);}
	
	//Finance_deposite Textfield*********************************************************************************************
	@FindBy(xpath = "(//input[@class='py-2  bg-tab border-none rounded-r-lg'])[2]")
	WebElement Finance_deposite ;
	public void Finance_deposite (String a) {
		enter_value(Finance_deposite,a);}
	
	//Finance_Rem_Fee Textfield*********************************************************************************************
	@FindBy(xpath = "(//input[@class='py-2  bg-tab border-none rounded-r-lg'])[3]")
	WebElement Finance_Rem_Fee ;
	public void Finance_Rem_Fee(String a) {
		enter_value(Finance_Rem_Fee,a);}
	
	//Finance_Liv_Cost Textfield*********************************************************************************************
	@FindBy(xpath = "(//input[@class='py-2  bg-tab border-none rounded-r-lg'])[4]")
	WebElement Finance_Liv_Cost ;
	public void Finance_Liv_Cost(String a) {
		enter_value(Finance_Liv_Cost,a);}
	
	
	//Finance_Liv_Cost_drop Dropdown*********************************************************************************************
	@FindBy(xpath = "(//select[@class=\"py-2 pr-7 pl-2 rounded-lg bg-tab\"])[2]")
	WebElement Finance_Liv_Cost_drop ;
	public void Finance_Liv_Cost_drop(String a) {
		SelectByvisible(Finance_Liv_Cost_drop,a);}
		
	//Finance_Next icon*********************************************************************************************
	@FindBy(xpath = "(//button[text()='Next Stage '])[3]")
	WebElement Finance_Next ;
	public void Finance_Next () {
		clickElement(Finance_Next);}
	
	//Visa_Referance_1 Textfield*********************************************************************************************
	@FindBy(xpath = "//input[@placeholder='Enter Reference Link']")
	WebElement Visa_Referance_1 ;
	public void Visa_Referance_1 (String a) {
		enter_value(Visa_Referance_1,a);}
	
	//Visa_Referance_2 Textfield*********************************************************************************************
	@FindBy(xpath = "(//input[@placeholder='Enter Reference Link'])[2]")
	WebElement Visa_Referance_2 ;
	public void Visa_Referance_2 (String a) {
		enter_value(Visa_Referance_2,a);}
	
	//Visa_Referance_3 Textfield*********************************************************************************************
	@FindBy(xpath = "//input[@placeholder='Enter Reference Link']")
	WebElement Visa_Referance_3 ;
	public void Visa_Referance_3 (String a) {
		enter_value(Visa_Referance_3,a);}
	
	//Visa_Upload_1 link*********************************************************************************************
	@FindBy(xpath = "//th[text()='Info']/../../../tbody/tr/td[3]/div[2]//p[text()='Update']")
	WebElement Visa_Upload_1 ;
	public void Visa_Upload_1 () {
		clickElement(Visa_Upload_1);}
	
	//Visa_Upload_2 link*********************************************************************************************
	@FindBy(xpath = "//th[text()='Info']/../../../tbody[2]/tr/td[3]/div[2]//p[text()='Update']")
	WebElement Visa_Upload_2 ;
	public void Visa_Upload_2 () {
		clickElement(Visa_Upload_2);}
	
	//Visa_Upload_3 link*********************************************************************************************
	@FindBy(xpath = "//th[text()='Info']/../../../tbody[3]/tr/td[3]/div[2]//p[text()='Update']")
	WebElement Visa_Upload_3 ;
	public void Visa_Upload_3 () {
		clickElement(Visa_Upload_3);}
	
	//Visa_Doc_1 icon*********************************************************************************************
	@FindBy(xpath = "//th[text()='Info']/../../../tbody/tr/td[4]/div[2]//img[@class='cursor-pointer']")
	WebElement Visa_Doc_1 ;
	public void Visa_Doc_1 () {
		clickElement(Visa_Doc_1);}
	
	//Visa_Doc_2 icon*********************************************************************************************
	@FindBy(xpath = "//th[text()='Info']/../../../tbody[2]/tr/td[4]/div[2]//img[@class='cursor-pointer']")
	WebElement Visa_Doc_2 ;
	public void Visa_Doc_2 () {
		clickElement(Visa_Doc_2);}
	
	//Visa_Doc_3 icon*********************************************************************************************
	@FindBy(xpath = "//th[text()='Info']/../../../tbody[3]/tr/td[4]/div[2]//img[@class='cursor-pointer']")
	WebElement Visa_Doc_3 ;
	public void Visa_Doc_3 () {
		clickElement(Visa_Doc_3);}
	
	//Visa_Download_1 icon*********************************************************************************************
	@FindBy(xpath = "//th[text()='Info']/../../../tbody/tr/td[4]/div[2]//img[@alt='alt']")
	WebElement Visa_Download_1  ;
	public void Visa_Download_1  () {
		clickElement(Visa_Download_1 );}
	
	//Visa_Download_2 icon*********************************************************************************************
	@FindBy(xpath = "//th[text()='Info']/../../../tbody[2]/tr/td[4]/div[2]//img[@alt='alt']")
	WebElement Visa_Download_2  ;
	public void Visa_Download_2  () {
		clickElement(Visa_Download_2 );}
	
	//Visa_Download_3 icon*********************************************************************************************
	@FindBy(xpath = "//th[text()='Info']/../../../tbody[3]/tr/td[4]/div[2]//img[@alt='alt']")
	WebElement Visa_Download_3  ;
	public void Visa_Download_3  () {
		clickElement(Visa_Download_3 );}
	
	//Visa_Reload_1 icon*********************************************************************************************
	@FindBy(xpath = "//th[text()='Info']/../../../tbody/tr/td[4]/div[2]//img[@alt='reload']")
	WebElement Visa_Reload_1  ;
	public void Visa_Reload_1  () {
		clickElement(Visa_Reload_1);}
	
	//Visa_Reload_2 icon*********************************************************************************************
	@FindBy(xpath = "//th[text()='Info']/../../../tbody[2]/tr/td[4]/div[2]//img[@alt='reload']")
	WebElement Visa_Reload_2  ;
	public void Visa_Reload_2 () {
		clickElement(Visa_Reload_2);}
	
	//Visa_Reload_3 icon*********************************************************************************************
	@FindBy(xpath = "//th[text()='Info']/../../../tbody[3]/tr/td[4]/div[2]//img[@alt='reload']")
	WebElement Visa_Reload_3  ;
	public void Visa_Reload_3 () {
		clickElement(Visa_Reload_3);}	
	
	}  
