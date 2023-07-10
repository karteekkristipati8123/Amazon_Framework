package base;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;


public class Base {
	public static WebDriver driver;
	public static Properties prop = new Properties();
	public static Properties loc = new Properties();
	public static FileReader  fr;
	public static FileReader  fr1;


	

	@BeforeTest
	public static void setup() throws InterruptedException, IOException
	{
	FileReader fr= new FileReader(System.getProperty("user.dir")+"\\src\\test\\resources\\configFiles\\config.properties");
	FileReader fr1= new FileReader(System.getProperty("user.dir")+"\\src\\test\\resources\\configFiles\\locators.properties");
	prop.load(fr);
	loc.load(fr1);
	ChromeOptions op = new ChromeOptions();
	op.addArguments("--remote-allow-origins=*");
	driver = new ChromeDriver(op);
	driver.manage().window().maximize();
	driver.get(prop.getProperty("url"));
	Thread.sleep(5000);

	}

	
	@AfterTest
	public void teardown() {
		driver.close();
	}
}
