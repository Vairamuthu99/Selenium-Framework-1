package PageDrive;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BaseDrive.BaseSwag;

public class PageSwag extends BaseSwag {

	@FindBy(xpath = "//input[@placeholder='Username']")
	WebElement username;

	@FindBy(xpath = "//input[@id='password']")
	WebElement pass;

	@FindBy(xpath = "//input[@type='submit']")
	WebElement loginButton;

	@FindBy(xpath = "//button[@id='add-to-cart-sauce-labs-backpack']")
	WebElement addcart1;

	@FindBy(xpath = "//button[@id='add-to-cart-sauce-labs-bike-light']")
	WebElement addcart2;

	@FindBy(xpath = "//span[@class='shopping_cart_badge']")
	WebElement viewcart;

	@FindBy(xpath = "//button[@id='checkout']")
	WebElement checkout;

	@FindBy(xpath = "//input[@id='first-name']")
	WebElement firstname;

	@FindBy(xpath = "//input[@id='last-name']")
	WebElement lastname;

	@FindBy(xpath = "//input[@id='postal-code']")
	WebElement zipcode;

	@FindBy(xpath = "//input[@id='continue']")
	WebElement con;

	@FindBy(xpath = "//button[@id='finish']")
	WebElement fin;

	public PageSwag() {
		PageFactory.initElements(driver, this);
	}

	public void login(String name, String password) {
		username.sendKeys(name);
		pass.sendKeys(password);
		loginButton.click();

		addcart1.click();
		addcart2.click();
		viewcart.click();
		checkout.click();

	}

	public void location(String fname, String lname, String zcode) {
		firstname.sendKeys(fname);
		lastname.sendKeys(lname);
		zipcode.sendKeys(zcode);
		con.click();
		fin.click();
	}
}
