package TestDrive;

import java.util.Set;

import org.testng.annotations.Test;

import BaseDrive.BaseSwag;
import PageDrive.PageSwag;

public class TestSwag extends BaseSwag {

	@Test
	public void location() {
		PageSwag add = new PageSwag();
		add.login("standard_user", "secret_sauce");
		add.location("vairam", "muthu", "627751");
	}

	/*	
	@Test
	public void login() {
		PageSwag log = new PageSwag();
		log.login("standard_user", "secret_sauce");
	}
	*/
	
/*	@Test
	public void store() {
		
		String logpage = driver.getWindowHandle();
		Set<String> store = driver.getWindowHandles();
		System.out.println(store);
		
		for (String Address : store ) {
			if(!Address.contentEquals(logpage)) {
				System.out.println(Address);
				driver.switchTo().window(Address);
			}
		}
	}
	*/
}
