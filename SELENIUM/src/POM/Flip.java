package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Flip 
{
	@FindBy(id="inputEmail")
	private WebElement usernametb;
	
	@FindBy(id="inputPassword")
	private WebElement passwordtb;
	
	@FindBy(id="submitLogin")
	private WebElement loginbtn;
	
	public Flip(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void username(String name)
	{
		usernametb.sendKeys(name);
	}
	public void password(String pwd)
	{
		passwordtb.sendKeys(pwd);
	}
	public void loginbutton()
	{
		loginbtn.click();
	}
}
