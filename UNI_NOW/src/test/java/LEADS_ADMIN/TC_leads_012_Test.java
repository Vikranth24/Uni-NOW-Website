package LEADS_ADMIN;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import Pom_repository.Leads_Page;
import generic.Base_Class;


public class TC_leads_012_Test extends Base_Class {
	@Test
	public void Top_Dropdown() throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);

		Leads_Page L = new Leads_Page(driver);

		String[] c = { "All Time", "Today", "Yesterday", "Last 7 Days", "Last 30 Days", "This Month", "Last Month" };

		List<WebElement> k = L.Date_Range_top_all_option();
		if (k.size() == 7) {

			for (int i = 0; i < k.size(); i++) {
				String j = k.get(i).getText();
				if (j.equals(c[i])) {
					L.Date_Range_top_click();
					Thread.sleep(3000);
					L.Date_Range_top(j);
					L.Date_Range_down_click();
					java.util.List<WebElement> m = L.Date_Range_down_all_option();
					String z = m.get(i).getText();
					L.Date_Range_down(z);
					Thread.sleep(3000);
					L.submit();
					Thread.sleep(3000);
					int p = L.Total_leads_count();
					Thread.sleep(3000);
					java.util.List<WebElement> w = driver.findElements(By.xpath("//p[@class='flex justify-center']"));

					int t = w.size();

					Assert.assertTrue(p == t, "1");
					System.out.print(i + " ");
					Thread.sleep(3000);

				}

			}

		}
	}

}
