package com.Amazontest.qa.TestCase;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.AmazoTest.qa.page.HomePage;
import com.AmazoTest.qa.page.LoginPage;
import com.AmazoTest.qa.page.SignInPage;
import com.AmazonTest.qa.base.AmazonTestbase;

public class SigninPageTest extends AmazonTestbase {
	LoginPage loginpage;
	SignInPage signinpage;
	HomePage homepage;
	
	public SigninPageTest() {
		super();
	}
	@BeforeMethod
	public void setup() {
		initialization();
		loginpage = new LoginPage();
		signinpage = loginpage.clickonsignin();
		signinpage = new SignInPage();
		homepage = new HomePage();
		
	}
	@Test
	public void verifySigninPageTest() {
		homepage = signinpage.signingin(m.get("username"), m.get("password"));
		
	}
		
	
	

}
