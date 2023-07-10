package pages;

import org.openqa.selenium.By;

import base.Base;

public class AddtoCartPage extends Base{

	public void cart() throws InterruptedException
	{
		driver.findElement(By.xpath("//input[@id='add-to-cart-button']")).click();
		Thread.sleep(6000);
		driver.findElement(By.xpath("//span[@id='attach-sidesheet-checkout-button']//span/input")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//div[@class='a-box a-box-title']//span//input")).click();
		
	}
	
	
}
