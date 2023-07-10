package testCase;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import base.Base;
import pages.AddtoCartPage;
import pages.HomePage;
import pages.LoginPage;
import utilities.AmazonReadXlsData;

public class LoginTest extends Base {

	@Test()
	public void login() throws InterruptedException {
		driver.findElement(By.xpath(loc.getProperty("email"))).sendKeys("karthikkristipati123@gmail.com");
		Thread.sleep(4000);
		driver.findElement(By.xpath(loc.getProperty("continue"))).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath(loc.getProperty("pwd"))).sendKeys("Karthik@amazon8123");
		Thread.sleep(4000);
		driver.findElement(By.xpath(loc.getProperty("signin"))).click();
		Thread.sleep(4000);
		HomePage hp = new HomePage();
		Thread.sleep(4000);
		hp.search();
		AddtoCartPage ap = new AddtoCartPage();
		Thread.sleep(4000);
		ap.cart();
	}
}