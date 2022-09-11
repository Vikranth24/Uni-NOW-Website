package Pom_repository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login {
	
		public Login(WebDriver driver) {
		PageFactory.initElements(driver, this);}

		
		public WebElement getUsernameTextField() {
			return usernameTextField;}

		public WebElement getPasswordTextField() {
			return passwordTextField;}

		public WebElement getLoginButton() {
			return loginButton;}

		@FindBy(xpath = "//input[@name='email']")
		private WebElement usernameTextField;
		
		@FindBy(xpath = "//input[@name='password']")
		private WebElement passwordTextField;
		
		@FindBy(xpath ="//button[text()='Login']")
		private WebElement loginButton;
		
		public void login(String username,String password) throws InterruptedException{
			
			Thread.sleep(3000);
			getUsernameTextField().sendKeys(username);
			Thread.sleep(3000);
			getPasswordTextField().sendKeys(password);
			Thread.sleep(3000);
			getLoginButton().click();
		}

}
