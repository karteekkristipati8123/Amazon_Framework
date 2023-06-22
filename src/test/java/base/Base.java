package base;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;


public class Base {
	public static WebDriver driver;
	public static Properties prop;

	public Base()
		{
		try {
				prop = new Properties();
				FileInputStream fis= new FileInputStream(System.getProperty("user.dir")+"\\src\\test\\resources\\configfiles\\config.properties");
				prop.load(fis);
				}
			catch (Exception e)
			{
				e.printStackTrace();
			}

		}

	public static void takescreenshot(WebDriver driver,String filename) throws IOException
	{
		File screen = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(screen, new File("//Screenshots//"+filename+".png"));
	}



	public static void setup() throws InterruptedException
	{
	ChromeOptions op = new ChromeOptions();
	op.addArguments("remote-allow-origins=*");
	driver = new ChromeDriver(op);
	driver.manage().window().maximize();
	driver.get(prop.getProperty("url"));
	Thread.sleep(5000);

	}

}
