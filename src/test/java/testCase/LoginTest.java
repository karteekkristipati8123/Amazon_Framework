package testCase;

import org.testng.annotations.Test;

import base.Base;
import pages.HomePage;
import pages.LoginPage;

public class LoginTest extends Base {

	@Test
	public static void test1() throws InterruptedException {
		setup();

		LoginPage lp = new LoginPage();
		Thread.sleep(4000);
		lp.login();
		Thread.sleep(4000);
		HomePage hp = new HomePage();
		Thread.sleep(4000);
		hp.search();
	}
}