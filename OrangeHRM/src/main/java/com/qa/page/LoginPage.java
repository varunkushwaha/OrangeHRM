package com.qa.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.qa.testbase.TestBase;

public class LoginPage extends TestBase{
	
	// Using simple POM
	
	By username = By.name("txtUsername");
	By password = By.name("txtPassword");
	By LoginBtn = By.name("Submit");
	By ForgotYourPsw = By.linkText("Forgot your password?");
	
	public LoginPage(WebDriver driver)
	{
		this.driver = driver;
	}

	public String getTitle()
	{
		return driver.getTitle();
    }
	
	public String GetPasswordResetLink()
	{
      return driver.findElement(ForgotYourPsw).getText();
	}
	
	public boolean passwrodLinkIsClicable()
	{
       return driver.findElement(ForgotYourPsw).isEnabled();
	}
	
	public void LoginToApplication(String uname , String pname)
	{
		driver.findElement(username).sendKeys(uname);
		driver.findElement(password).sendKeys(pname);
		driver.findElement(LoginBtn).click();
	}
	
}
