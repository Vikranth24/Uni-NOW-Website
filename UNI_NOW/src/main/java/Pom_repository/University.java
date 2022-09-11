package Pom_repository;
	
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import generic.UtilityMethods;
	
    public class University extends UtilityMethods {
    WebDriver driver;
    public University (WebDriver driver){
    PageFactory.initElements(driver,this);
    this.driver=driver;
    }
		
    //University **************************************************************************************
	@FindBy(xpath = "//a[text()='Universities']")
	WebElement University ;
	public void University() {
		clickElement(University);}
		
	//Country Dropdown*************************************************************************************
	@FindBy(xpath = "//select[@class='  bg-line relative right-1']")
	WebElement Country ;
	public void Role(String a) {
		SelectByvisible(Country,a);}
	
	//Search textfield*************************************************************************************
	@FindBy(xpath = "//input[@placeholder='Search...']")
	WebElement Search ;
	public void Search(String a) {
		SelectByvisible(Search,a);}
	
	//Submit textfield*************************************************************************************
	@FindBy(xpath = "//button[text()='Submit']")
	WebElement Submit ;
	public void Submit() {
		clickElement(Submit);}
	
	//Reset textfield*************************************************************************************
	@FindBy(xpath = "//button[text()='Reset']")
	WebElement Reset ;
	public void Reset() {
		clickElement(Reset);}
	
	//Edit_1 textfield*************************************************************************************
	@FindBy(xpath = "//p[text()='Action']/../../../../tbody/tr/td[4]/div[2]/a/img[@alt='action']")
	WebElement Edit_1 ;
	public void Edit_1() {
		clickElement(Edit_1);}
	
	//Edit_2 textfield*************************************************************************************
	@FindBy(xpath = "//p[text()='Action']/../../../../tbody/tr[2]/td[4]/div[2]/a/img[@alt='action']")
	WebElement Edit_2 ;
	public void Edit_2() {
		clickElement(Edit_2);}
	
	//Edit_3 textfield*************************************************************************************
	@FindBy(xpath = "//p[text()='Action']/../../../../tbody/tr[3]/td[4]/div[2]/a/img[@alt='action']")
	WebElement Edit_3 ;
	public void Edit_3() {
		clickElement(Edit_3);}
	
	//Edit_4 textfield*************************************************************************************
	@FindBy(xpath = "//p[text()='Action']/../../../../tbody/tr[4]/td[4]/div[2]/a/img[@alt='action']")
	WebElement Edit_4 ;
	public void Edit_4() {
		clickElement(Edit_4);}
	
	//Edit_5 textfield*************************************************************************************
	@FindBy(xpath = "//p[text()='Action']/../../../../tbody/tr[5]/td[4]/div[2]/a/img[@alt='action']")
	WebElement Edit_5 ;
	public void Edit_5() {
		clickElement(Edit_5);}
	
	//Edit_6 textfield*************************************************************************************
	@FindBy(xpath = "//p[text()='Action']/../../../../tbody/tr[6]/td[4]/div[2]/a/img[@alt='action']")
	WebElement Edit_6 ;
	public void Edit_6() {
		clickElement(Edit_6);}
	
	//Edit_7 textfield*************************************************************************************
	@FindBy(xpath = "//p[text()='Action']/../../../../tbody/tr[7]/td[4]/div[2]/a/img[@alt='action']")
	WebElement Edit_7 ;
	public void Edit_7() {
		clickElement(Edit_7);}
	
	//Edit_8 textfield*************************************************************************************
	@FindBy(xpath = "//p[text()='Action']/../../../../tbody/tr[8]/td[4]/div[2]/a/img[@alt='action']")
	WebElement Edit_8 ;
	public void Edit_8() {
		clickElement(Edit_8);}
	
	//Edit_9 textfield*************************************************************************************
	@FindBy(xpath = "//p[text()='Action']/../../../../tbody/tr[9]/td[4]/div[2]/a/img[@alt='action']")
	WebElement Edit_9 ;
	public void Edit_9() {
		clickElement(Edit_9);}
	
	//Edit_10 textfield*************************************************************************************
	@FindBy(xpath = "//p[text()='Action']/../../../../tbody/tr[10]/td[4]/div[2]/a/img[@alt='action']")
	WebElement Edit_10 ;
	public void Edit_10() {
		clickElement(Edit_10);}
	
	//Edit_name textfield*************************************************************************************
	@FindBy(xpath = "//input[@id='name']")
	WebElement Edit_name ;
	public void Edit_name() {
		clickElement(Edit_name);}
	
	//Edit_Country textfield*************************************************************************************
	@FindBy(xpath = "//select[@id='country_id']")
	WebElement Edit_Country ;
	public void Edit_Country(String a) {
		SelectByvisible(Edit_Country,a);}
	
	//Edit_Submit textfield*************************************************************************************
	@FindBy(xpath = "//button[text()='Submit Details']")
	WebElement Edit_Submit ;
	public void Edit_Submit() {
		clickElement(Edit_Submit);}
	
	//Next_Page *************************************************************************************
	@FindBy(xpath = "//li[@id='dataTable_next']")
	WebElement Next_Page;
	public void Next_Page() {
		clickElement(Next_Page);}
	
	//Pre_page *************************************************************************************
	@FindBy(xpath = "//li[@id='dataTable_previous']")
	WebElement Pre_page;
	public void Pre_page() {
		clickElement(Pre_page);}
	
	//Create_name textfield*************************************************************************************
	@FindBy(xpath = "//input[@id='name']")
	WebElement Create_name ;
	public void Create_name() {
		clickElement(Create_name);}
	
	
	//Create_Country textfield*************************************************************************************
	@FindBy(xpath = "//select[@id='country_id']")
	WebElement Create_Country ;
	public void Create_Country(String a) {
		SelectByvisible(Create_Country,a);}
		
	//Create_Submit textfield*************************************************************************************
	@FindBy(xpath = "//button[text()='Submit Details']")
	WebElement Create_Submit ;
	public void Create_Submit() {
		clickElement(Create_Submit);}
	
	
	
	
}


