package generic;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.opera.OperaDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

import Pom_repository.Login;
import io.github.bonigarcia.wdm.WebDriverManager;

/**
 * 
 * Vik
 *
 */

public class Base_Class implements FrameworkConstants {

	public static WebDriver driver;

	@Parameters("browser")
	@BeforeClass(alwaysRun = true)
	public void openApplication(@Optional("chrome") String browserName) throws Throwable {

		if (browserName.equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			Reporter.log("Successfully Launched Chrome Browser", true);
		}

		else if (browserName.equalsIgnoreCase("firefox")) {

			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
			Reporter.log("Successfully Launched Firefox Browser", true);
		}
		
		else if(browserName.equalsIgnoreCase("Miscrosoft Edge"))
		{
			WebDriverManager.edgedriver().setup();
			driver=new EdgeDriver();
			 Reporter.log("Successfully Launched Miscrosoft Edge Browser",true);
		}
		
		else if(browserName.equalsIgnoreCase("Safari"))
		{
			WebDriverManager.safaridriver().setup();
		    driver=new SafariDriver();
		    Reporter.log("Successfully Launched Safari Browser",true);
			
		}
		
		else if(browserName.equalsIgnoreCase("Opera"))
		{
			WebDriverManager.operadriver().setup();
		    driver=new OperaDriver();
		    Reporter.log("Successfully Launched Opera Browser",true);
		}
		

		driver.manage().window().maximize();
		Reporter.log("Browser window is maximized successfully", true);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	
	}

	@BeforeMethod(alwaysRun = true)
	public void login1() throws InterruptedException {
		driver.get(URL);
		driver.findElement(By.xpath("//button[text()='Recruiter']")).click();
		Thread.sleep(3000);

		Login l = new Login(driver);
		l.login(Log_Email, Log_PWD);
	}

	@AfterMethod(alwaysRun = true)
	public void logout1() {
		driver.close();

	}

	@AfterClass(alwaysRun = true)

	public void CloseApp() throws IOException {

		
		driver.quit();
	}

}
