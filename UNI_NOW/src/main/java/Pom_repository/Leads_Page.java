package Pom_repository;
import org.apache.xmlbeans.impl.xb.xsdschema.ListDocument.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import generic.UtilityMethods;
public class Leads_Page  extends UtilityMethods {
	WebDriver driver;
	public Leads_Page(WebDriver driver){
		PageFactory.initElements(driver,this);
		this.driver=driver;
	}
	
	
	// Leads***************************************************************************
	@FindBy(xpath = "//a[text()=' Leads']")
	WebElement Leads;
	public void Leads() {
			
		clickElement(Leads);}
	
	// Profile***************************************************************************
	@FindBy(xpath = "//div[@class='relative']")
	WebElement profile;
	public void profile() {
		clickElement(profile);}
	
	//Logout Button *********************************************************************
	@FindBy(xpath = "//div[text()='Logout']")
	WebElement logout;
	public void logout() {
		clickElement(logout);}
	
	// Cancel Profile button**************************************************************
	@FindBy(xpath = "(//*[local-name()='svg'])[31]")
	WebElement cancel_Logout;
	public void cancel_Logout() {
		clickElement(cancel_Logout);}
	
	//Yes logout****************************************************************************
	@FindBy(xpath = "//button[text()='yes']")
	WebElement Yes_logout;
	public void Yes_Logout() {
		clickElement(Yes_logout);}
	
	//Date Range on top*************************************************************************
	@FindBy(xpath = "//select[@class='bg-formfieldbg relative right-1']")
	WebElement Date_Range_top;
	public void Date_Range_top(String name) {
		SelectByvisible(Date_Range_top,name);}
	
	//Date Range on top*************************************************************************
	@FindBy(xpath = "//select[@class='bg-formfieldbg relative right-1']")
	WebElement Date_Range_top_click;
	public void Date_Range_top_click() {
		clickElement(Date_Range_top_click);}
		
	
	// To got all options of Top dropdown********************************************************
	@FindBy(xpath = "//select[@class='bg-formfieldbg relative right-1']")
	WebElement Date_Range_top_all_option;
	public java.util.List<WebElement>  Date_Range_top_all_option() {
		Select sel= new Select(Date_Range_top_all_option);
		 java.util.List<WebElement> a=  sel.getOptions();
		 return a;}
	
	//To get Total leads count in leads analytics*************************************************
	@FindBy(xpath = "//li/div[@class='text-4xl font-bold text-green']")
	WebElement Total_leads_count;
	public int Total_leads_count() {
		String a=Total_leads_count.getText();
		int b=Integer.parseInt(a);
		return b;}
		
	//Not-connected count on leads analytics
	@FindBy(xpath = "//div[@class='pt-3 text-2xl font-bold text-white']")
	WebElement Total_Not_connected_count;
	public int Total_Not_connected_count() {
		String a=Total_Not_connected_count.getText();
		int b=Integer.parseInt(a);
		return b;}
	//connected count on leads analytics
		@FindBy(xpath = "//div[text()='Contacted']/following-sibling::div")
		WebElement connected_count;
		public int connected_count() {
			String a=connected_count.getText();
			int b=Integer.parseInt(a);
			return b;}
	
	//Date range down*************************************************************************
	@FindBy(xpath = "//select[@class='relative right-1 bg-formfieldbg']")
	WebElement Date_Range_down;
	public void Date_Range_down(String name) {
		SelectByvisible(Date_Range_down,name);}
	

	//Date range down_click*************************************************************************
	@FindBy(xpath = "//select[@class='relative right-1 bg-formfieldbg']")
	WebElement Date_Range_click;
	public void Date_Range_down_click() {
		clickElement(Date_Range_down);}
	
	// To got all options of down dropdown********************************************************
		@FindBy(xpath = "//select[@class='bg-formfieldbg relative right-1']")
		WebElement Date_Range_down_all_option;
		public java.util.List<WebElement>  Date_Range_down_all_option() {
			Select sel= new Select(Date_Range_down_all_option);
			 java.util.List<WebElement> a=  sel.getOptions();
			 return a;}
		
		//Status_click**********************************************************************************
		@FindBy(xpath = "//select[@name='status']")
		WebElement status_click;
		public void status_click() {
			clickElement(status_click);}
	
		
	
	//Status**********************************************************************************
	@FindBy(xpath = "//select[@name='status']")
	WebElement status;
	public void status(String a) {
		SelectByvisible(status,a);}
	
	// To got all options of Status dropdown********************************************************
		@FindBy(xpath = "//select[@name='status']")
		WebElement Date_Range_Status_all_option;
		public java.util.List<WebElement>  Date_Range_Status_all_option() {
			Select sel= new Select(Date_Range_Status_all_option);
			 java.util.List<WebElement> a=  sel.getOptions();
			 return a;}
	
	//Search ***********************************************************************************
	@FindBy(xpath = "(//input[@name='search'])[2]")
	WebElement search;
	public void search(String a) {
		enter_value(search,a);}
	
	//Submit**************************************************************************************
	@FindBy(xpath = "//button[text()='Submit']")
	WebElement submit;
	public void submit() {
		clickElement(submit);}
	
	//Reset**************************************************************************************
	@FindBy(xpath = "//button[text()='Reset']")
	WebElement reset;
	public void reset() {
		clickElement(reset);}
	
	
	
	//Connect 1**************************************************************************************
	@FindBy(xpath = "//th[text()='Action']/../../tbody/tr/td[9]//*[local-name()='svg']")
	WebElement Connect_1;
	public void Connect_1() {
		clickElement(Connect_1);}
		
	//Connect 2**************************************************************************************
	@FindBy(xpath = "//th[text()='Action']/../../tbody/tr[2]/td[9]//*[local-name()='svg']")
	WebElement Connect_2;
	public void Connect_2() {
		clickElement(Connect_2);}
	
	//Connect 3**************************************************************************************
	@FindBy(xpath = "//th[text()='Action']/../../tbody/tr[3]/td[9]//*[local-name()='svg']")
	WebElement Connect_3;
	public void Connect_3() {
		clickElement(Connect_3);}
	
	//Connect 4**************************************************************************************
	@FindBy(xpath = "//th[text()='Action']/../../tbody/tr[4]/td[9]//*[local-name()='svg']")
	WebElement Connect_4;
	public void Connect_4() {
		clickElement(Connect_4);}	
			
	//Connect 5**************************************************************************************
	@FindBy(xpath = "//th[text()='Action']/../../tbody/tr[5]/td[9]//*[local-name()='svg']")
	WebElement Connect_5;
	public void Connect_5() {
	     clickElement(Connect_5);}	
	
	//Connect 6**************************************************************************************
	@FindBy(xpath = "//th[text()='Action']/../../tbody/tr[6]/td[9]//*[local-name()='svg']")
	WebElement Connect_6;
	public void Connect_6() {
		  clickElement(Connect_6);}
	
	//Connect 7**************************************************************************************
	@FindBy(xpath = "//th[text()='Action']/../../tbody/tr[7]/td[9]//*[local-name()='svg']")
	WebElement Connect_7;
	public void Connect_7() {
		clickElement(Connect_7);}
	
	//Connect 8**************************************************************************************
	@FindBy(xpath = "//th[text()='Action']/../../tbody/tr[8]/td[9]//*[local-name()='svg']")
	WebElement Connect_8;
	public void Connect_8() {
		clickElement(Connect_8);}
	
	//Connect 9**************************************************************************************
	@FindBy(xpath = "//th[text()='Action']/../../tbody/tr[9]/td[9]//*[local-name()='svg']")
	WebElement Connect_9;
	public void Connect_9() {
		clickElement(Connect_9);}
	
	//Connect 10**************************************************************************************
	@FindBy(xpath = "//th[text()='Action']/../../tbody/tr[10]/td[9]//*[local-name()='svg']")
	WebElement Connect_10;
	public void Connect_10() {
		clickElement(Connect_10);}
		
	//Red Arrow 1**************************************************************************************
	@FindBy(xpath = "//th[text()='Action']/../../tbody/tr[1]/td[9]/div//img[@alt='arrowright']")
	WebElement Red_1;
	public void Red_1() {
		clickElement(Red_1);}
		
	//Red Arrow 2**************************************************************************************
	@FindBy(xpath = "//th[text()='Action']/../../tbody/tr[2]/td[9]/div//img[@alt='arrowright']")
	WebElement Red_2;
	public void Red_2() {
		clickElement(Red_2);}
	
	//Red Arrow 3**************************************************************************************
	@FindBy(xpath = "//th[text()='Action']/../../tbody/tr[3]/td[9]/div//img[@alt='arrowright']")
	WebElement Red_3;
	public void Red_3() {
		clickElement(Red_3);}
	
	//Leads_name_view_3 ****************************************************************************************
	@FindBy(xpath = "//th[text()='Lead Name']/../../tbody/tr[3]/td[3]")
	WebElement Leads_name_view_3 ;
	public String Leads_name_view_3() {
	String a=get_Text_Value(Leads_name_view_3);
			return a;}
	
	//Red Arrow 4**************************************************************************************
	@FindBy(xpath = "//th[text()='Action']/../../tbody/tr[4]/td[9]/div//img[@alt='arrowright']")
	WebElement Red_4;
	public void Red_4() {
		clickElement(Red_4);}
	
	//Red Arrow 5**************************************************************************************
	@FindBy(xpath = "//th[text()='Action']/../../tbody/tr[5]/td[9]/div//img[@alt='arrowright']")
	WebElement Red_5;
	public void Red_5() {
		clickElement(Red_5);}
	
	//Red Arrow 6**************************************************************************************
	@FindBy(xpath = "//th[text()='Action']/../../tbody/tr[6]/td[9]/div//img[@alt='arrowright']")
	WebElement Red_6;
	public void Red_6() {
		clickElement(Red_6);}
	
	//Red Arrow 7**************************************************************************************
	@FindBy(xpath = "//th[text()='Action']/../../tbody/tr[7]/td[9]/div//img[@alt='arrowright']")
	WebElement Red_7;
	public void Red_7() {
		clickElement(Red_7);}
	
	//Leads_Date_view_7 ****************************************************************************************
	@FindBy(xpath = "//th[text()='Date']/../../tbody/tr[7]/td[2]//p[@class='lg:w-10 xl:w-full break-words']")
	WebElement Leads_Date_view_7 ;
	public String Leads_Date_view_7() {
	String a=get_Text_Value(Leads_Date_view_7);
			return a;}
	
	//Red Arrow 8**************************************************************************************
	@FindBy(xpath = "//th[text()='Action']/../../tbody/tr[8]/td[9]/div//img[@alt='arrowright']")
	WebElement Red_8;
	public void Red_8() {
		clickElement(Red_8);}
	
	//Red Arrow 9**************************************************************************************
	@FindBy(xpath = "//th[text()='Action']/../../tbody/tr[9]/td[9]/div//img[@alt='arrowright']")
	WebElement Red_9;
	public void Red_9() {
		clickElement(Red_9);}
	
	//Red Arrow 10**************************************************************************************
	@FindBy(xpath = "//th[text()='Action']/../../tbody/tr[9]/td[9]/div//img[@alt='arrowright']")
	WebElement Red_10;
	public void Red_10() {
		clickElement(Red_10);}
	
	//Page next >>**********************************************************************************
	@FindBy(xpath = "//li[@id='dataTable_next']")
	WebElement Page_next;
	public void Page_next() {
		clickElement(Page_next);}
	
	//Page next _ Web element>>**********************************************************************************
		@FindBy(xpath = "//li[@id='dataTable_next']")
		WebElement Page_next_webelement;
		public WebElement Page_next_webelement() {
			return Page_next_webelement;}
	
	//Page previous <<**********************************************************************************
	@FindBy(xpath = "//li[@id='dataTable_previous']")
	WebElement Page_pre;
	public void Page_pre() {
		clickElement(Page_pre);}
	
	//Leads_Count****************************************************************************************
	@FindBy(xpath = "//div[@class='py-2 text-sm text-right text-white opacity-50 md:px-4 md:mt-4 md:opacity-100 md:text-left']")
	WebElement Leads_Count ;
	public String Leads_Count() {
	String a=get_Text_Value(Leads_Count);
		return a;}
	

	//Leads_connected ****************************************************************************************
	@FindBy(xpath = "//div[@class='pt-3 text-2xl font-bold text-white']")
	WebElement Leads_connected ;
	public String Leads_connected() {
	String a=get_Text_Value(Leads_connected);
		return a;}
	
	//Page_Count****************************************************************************************
	@FindBy(xpath = "//span[@class='mr-2 -mt-1 text-blue font-WavehausSemiBold']")
	WebElement Page_Count ;
	public WebElement Page_Count() {
		return Page_Count;}
	
	// Search no data found ******************************************************************************
	@FindBy(xpath = "//tbody/tr//td[text()='Not found']")
	WebElement Search_not_found ;
	public String Search_not_found() {
	String a=get_Text_Value(Search_not_found);
			return a;}	
}




	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

	
	
	
	
	
	
	
	
	
	
	
	
	
