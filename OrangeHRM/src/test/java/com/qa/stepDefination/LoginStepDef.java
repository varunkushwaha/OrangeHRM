package com.qa.stepDefination;

import org.openqa.selenium.By;
import org.testng.asserts.SoftAssert;

import com.qa.page.LoginPage;
import com.qa.testbase.TestBase;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginStepDef extends TestBase{
	
	public LoginStepDef()
	{
		super();
	}
	
	LoginPage login = new LoginPage(driver);
		
@Given("^user open browser$")
public void user_open_browser() throws Throwable {
	TestBase.initialization();
}

@When("^user is on login page$")
public void user_is_on_login_page() throws Throwable {
	String ActualLoginPageTitle = login.getTitle();
	String ExpectedLoginPageTitle = pro.getProperty("Title");
	SoftAssert softAssertion= new SoftAssert();
	softAssertion.assertEquals(ActualLoginPageTitle, ExpectedLoginPageTitle);
	softAssertion.assertAll();
}

@Then("^check Forgot Your Password link is present and enabled$")
public void check_Forgot_Your_Password_link_is_present_and_enabled() 
{
	String ForgotPassword = login.GetPasswordResetLink();
	System.out.println(ForgotPassword);
	login.passwrodLinkIsClicable();
	System.out.println(login.passwrodLinkIsClicable());
}


@Then("^user enter \"([^\"]*)\" and \"([^\"]*)\"$")

public void user_enter_username_and_password(String username , String Password) throws Throwable 
{
	login.LoginToApplication(username, Password);	
}

@Then("^user clicks login button$")
public void user_clicks_login_button() throws Throwable {
//	driver.findElement(By.name("Submit")).click(); 
}
	
	

}
