package pages;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;

import base.Base;

public class HomePage extends Base{
	
	public void search() throws InterruptedException
	{
		Thread.sleep(15000); 

		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("iphone 14 pro max");
		driver.findElement(By.xpath("//input[@id='nav-search-submit-button']")).click();
		Thread.sleep(4000); 
		driver.findElement(By.xpath("//*[@id='search']/div[1]/div[1]/div/span[1]/div[1]/div[5]/div/div/div/div/div/div[2]/div/div/div[1]/h2/a/span")).click();
		Thread.sleep(4000);
		Set<String> windowhandles=driver.getWindowHandles();
//		System.out.println(windowhandles);
		Iterator<String>iterator =windowhandles.iterator();
		String parentwindow = iterator.next();
//		System.out.println(parentwindow);
		String childwindow =iterator.next();
//		System.out.println(childwindow);
		driver.switchTo().window(childwindow);

	}
}
