package pages;

import org.openqa.selenium.By;

import base.Base;

public class LoginPage extends Base {

	public void login() throws InterruptedException {
		driver.findElement(By.xpath("//input[@id='ap_email']")).sendKeys("8919798123");
		Thread.sleep(4000);
		driver.findElement(By.xpath("//input[@id='continue']")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//input[@id='ap_password']")).sendKeys("Karthik@amazon8123");
		Thread.sleep(4000);
		driver.findElement(By.xpath("//input[@id='signInSubmit']")).click();
	}

}
