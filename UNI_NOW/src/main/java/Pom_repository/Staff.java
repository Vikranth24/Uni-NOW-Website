package Pom_repository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import generic.UtilityMethods;
public class Staff extends UtilityMethods {
	WebDriver driver;
	public Staff(WebDriver driver){
		PageFactory.initElements(driver,this);
		this.driver=driver;
	}
	
	
	//Staff **************************************************************************************
	@FindBy(xpath = "//li[@class='py-2 text-center text-white cursor-pointer bg-hover border-l-4']")
	WebElement Staff ;
	public void Staff() {
		clickElement(Staff);}
	
	//Role Dropdown*************************************************************************************
	@FindBy(xpath = "//select[@class=' w-28 relative right-1 bg-line']")
	WebElement Role;
	public void Role(String a) {
		SelectByvisible(Role,a);}
	
	//Status Dropdown*************************************************************************************
	@FindBy(xpath = "(//select[@class=' w-28 relative right-1 bg-line'])[2]")
	WebElement Status;
	public void Status(String a) {
		SelectByvisible(Status,a);}
	
	//search Textfield*************************************************************************************
	@FindBy(xpath = "//input[@placeholder='Search...']")
	WebElement search;
	public void search(String a) {
		enter_value(search,a);}
	
	//submit Button*************************************************************************************
	@FindBy(xpath = "//input[@placeholder='Search...']")
	WebElement submit;
	public void submit() {
		clickElement(submit);}
	
	//Reset Button*************************************************************************************
	@FindBy(xpath = "//input[@placeholder='Search...']")
	WebElement Reset;
	public void Reset() {
		clickElement(Reset);}
	
	//Toggle_1*************************************************************************************
	@FindBy(xpath = "//p[text()='Status']/../../../../tbody/tr/td[7]//div[@class='bg-tab py-3']")
	WebElement Toggle_1 ;
	public void Toggle_1() {
		clickElement(Toggle_1);}
	
	//Toggle_2*************************************************************************************
	@FindBy(xpath = "//p[text()='Status']/../../../../tbody[2]/tr/td[7]//div[@class='bg-tab py-3']")
	WebElement Toggle_2 ;
	public void Toggle_2() {
		clickElement(Toggle_2);}
	
	//Toggle_3*************************************************************************************
	@FindBy(xpath = "//p[text()='Status']/../../../../tbody[3]/tr/td[7]//div[@class='bg-tab py-3']")
	WebElement Toggle_3 ;
	public void Toggle_3() {
		clickElement(Toggle_3);}
	
	//Toggle_4*************************************************************************************
	@FindBy(xpath = "//p[text()='Status']/../../../../tbody[4]/tr/td[7]//div[@class='bg-tab py-3']")
	WebElement Toggle_4 ;
	public void Toggle_4() {
	     clickElement(Toggle_4);}
	
	//Toggle_5*************************************************************************************
	@FindBy(xpath = "//p[text()='Status']/../../../../tbody[5]/tr/td[7]//div[@class='bg-tab py-3']")
	WebElement Toggle_5 ;
	public void Toggle_5() {
		  clickElement(Toggle_5);}
	
	//Toggle_6*************************************************************************************
	@FindBy(xpath = "//p[text()='Status']/../../../../tbody[6]/tr/td[7]//div[@class='bg-tab py-3']")
	WebElement Toggle_6 ;
	public void Toggle_6() {
	    clickElement(Toggle_6);}
	
	//Toggle_7*************************************************************************************
	@FindBy(xpath = "//p[text()='Status']/../../../../tbody[7]/tr/td[7]//div[@class='bg-tab py-3']")
	WebElement Toggle_7 ;
	public void Toggle_7() {
		clickElement(Toggle_7);}
	
	//Toggle_8*************************************************************************************
	@FindBy(xpath = "//p[text()='Status']/../../../../tbody[8]/tr/td[7]//div[@class='bg-tab py-3']")
	WebElement Toggle_8 ;
	public void Toggle_8() {
	   clickElement(Toggle_8);}
	
	//Toggle_9*************************************************************************************
	@FindBy(xpath = "//p[text()='Status']/../../../../tbody[9]/tr/td[7]//div[@class='bg-tab py-3']")
	WebElement Toggle_9 ;
	public void Toggle_9() {
		 clickElement(Toggle_9);}
	
	//Toggle_10*************************************************************************************
	@FindBy(xpath = "//p[text()='Status']/../../../../tbody[10]/tr/td[7]//div[@class='bg-tab py-3']")
	WebElement Toggle_10 ;
	public void Toggle_10() {
		clickElement(Toggle_10);}
	
	//Edit_1 Icon*************************************************************************************
	@FindBy(xpath = "//p[text()='Action']/../../../../tbody/tr/td[8]/div[2]/a//img[@alt='action']")
	WebElement Edit_1 ;
	public void Edit_1() {
		clickElement(Edit_1);}
	
	//Edit_2 Icon*************************************************************************************
	@FindBy(xpath = "//p[text()='Action']/../../../../tbody/tr[2]/td[8]/div[2]/a//img[@alt='action']")
	WebElement Edit_2 ;
	public void Edit_2() {
		clickElement(Edit_2);}
	
	//Edit_3 Icon*************************************************************************************
	@FindBy(xpath = "//p[text()='Action']/../../../../tbody/tr[3]/td[8]/div[2]/a//img[@alt='action']")
	WebElement Edit_3 ;
	public void Edit_3() {
		clickElement(Edit_3);}
	
	//Edit_4 Icon*************************************************************************************
	@FindBy(xpath = "//p[text()='Action']/../../../../tbody/tr[4]/td[8]/div[2]/a//img[@alt='action']")
	WebElement Edit_4 ;
	public void Edit_4() {
		clickElement(Edit_4);}
	
	//Edit_5 Icon*************************************************************************************
	@FindBy(xpath = "//p[text()='Action']/../../../../tbody/tr[5]/td[8]/div[2]/a//img[@alt='action']")
	WebElement Edit_5 ;
	public void Edit_5() {
		clickElement(Edit_5);}
	
	//Edit_6 Icon*************************************************************************************
	@FindBy(xpath = "//p[text()='Action']/../../../../tbody/tr[6]/td[8]/div[2]/a//img[@alt='action']")
	WebElement Edit_6 ;
	public void Edit_6() {
		clickElement(Edit_6);}
	
	//Edit_7 Icon*************************************************************************************
	@FindBy(xpath = "//p[text()='Action']/../../../../tbody/tr[7]/td[8]/div[2]/a//img[@alt='action']")
	WebElement Edit_7 ;
	public void Edit_7() {
		clickElement(Edit_7);}
	
	//Edit_8 Icon*************************************************************************************
	@FindBy(xpath = "//p[text()='Action']/../../../../tbody/tr[8]/td[8]/div[2]/a//img[@alt='action']")
	WebElement Edit_8 ;
	public void Edit_8() {
		clickElement(Edit_8);}
	
	//Edit_9 Icon*************************************************************************************
	@FindBy(xpath = "//p[text()='Action']/../../../../tbody/tr[9]/td[8]/div[2]/a//img[@alt='action']")
	WebElement Edit_9 ;
	public void Edit_9() {
		clickElement(Edit_9);}
	
	//Edit_10 Icon*************************************************************************************
	@FindBy(xpath = "//p[text()='Action']/../../../../tbody/tr[10]/td[8]/div[2]/a//img[@alt='action']")
	WebElement Edit_10 ;
	public void Edit_10() {
		clickElement(Edit_10);}
	
	//Edit_Name Icon*************************************************************************************
	@FindBy(xpath = "//input[@id='name']")
	WebElement Edit_Name ;
	public void Edit_Name(String a) {
		enter_value(Edit_Name,a);}
	
	//Edit_Phone Icon*************************************************************************************
	@FindBy(xpath = "//input[@id='phone']")
	WebElement Edit_Phone ;
	public void Edit_Phone(String a) {
		enter_value(Edit_Phone,a);}

	//Edit_Email Icon*************************************************************************************
	@FindBy(xpath = "//input[@id='email']")
	WebElement Edit_Email ;
	public void Edit_Email() {
		is_Enable(Edit_Email);
	     get_Text(Edit_Email);}
	
	//Edit_role Icon*************************************************************************************
	@FindBy(xpath = "//select[@id='role']")
	WebElement Edit_role ;
	public void Edit_role(String a) {
		SelectByvisible(Edit_role, a);
	}
	
	//Edit_Update Button*************************************************************************************
	@FindBy(xpath = "//button[text()='Update']")
	WebElement Edit_Update ;
	public void Edit_Update() {
		clickElement(Edit_Update);}
	
	//New_User Button*************************************************************************************
	@FindBy(xpath = "//a[text()=' +New User']")
	WebElement New_User ;
	public void New_User() {
		clickElement(New_User);}
	
	//Create_Name Icon*************************************************************************************
	@FindBy(xpath = "//input[@id='name']")
	WebElement Create_Name ;
	public void Create_Name(String a) {
		enter_value(Create_Name,a);}
		
	//Create_Phone Icon*************************************************************************************
	@FindBy(xpath = "//input[@id='phone']")
	WebElement Create_Phone ;
	public void Create_Phone(String a) {
		enter_value(Create_Phone,a);}

	//Crate_Email Icon*************************************************************************************
	@FindBy(xpath = "//input[@id='email']")
	WebElement Crate_Email ;
	public void Crate_Email(String a) {
		enter_value(Crate_Email,a);}
		
	//Craete_role Dropdown*************************************************************************************
	@FindBy(xpath = "//select[@id='role']")
	WebElement Craete_role ;
	public void Craete_role(String a) {
		SelectByvisible(Craete_role, a);
		}
		
	//Create_Submit Button*************************************************************************************
	@FindBy(xpath = "//button[text()='Submit Details']")
	WebElement Create_Submit ;
	public void Create_Submit() {
		clickElement(Create_Submit);}
}
