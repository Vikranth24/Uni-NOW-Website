package generic;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class Generic_Screenshots implements FrameworkConstants
{
	

	
 public static void screenShotMethod(WebDriver driver) throws IOException {
	
	String photo=SCREENSHOT_PATH;			
	Date date= new Date();
	
	String ScreenShotDate=date.toString().replaceAll(":", "-");
	System.out.println(ScreenShotDate);
	TakesScreenshot takeScreenShot=(TakesScreenshot)driver;
	File source=takeScreenShot.getScreenshotAs(OutputType.FILE);
	File destination= new File("./Screenshot/"+ScreenShotDate+".png");
	FileHandler.copy(source, destination);
	
	System.out.println("HAi");
	 
	/* LocalDateTime systemDate = LocalDateTime.now();
		String ScreenShotDate = systemDate.toString().replaceAll(":", "-");
		TakesScreenshot takeScreenShot = (TakesScreenshot) driver;
		File tempFile = takeScreenShot.getScreenshotAs(OutputType.FILE);
		File destFile = new File(SCREENSHOT_PATH + ScreenShotDate + ".png");
		try {
			FileUtils.copyFile(tempFile, destFile);
		} catch (IOException e) {
			e.printStackTrace();*/
		}
}
 

