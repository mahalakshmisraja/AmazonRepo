package com.Amazontest.qa.TestCase;



import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.AmazoTest.qa.page.AddtoCartPage;
import com.AmazoTest.qa.page.HomePage;
import com.AmazoTest.qa.page.LoginPage;
import com.AmazoTest.qa.page.SearchResultPage;
import com.AmazoTest.qa.page.SignInPage;
import com.AmazonTest.qa.base.AmazonTestbase;

public class SearchResultPageTest extends AmazonTestbase{
	
	LoginPage loginpage;
	SignInPage signinpage;
	HomePage homepage;
	SearchResultPage searchresultpage;
	AddtoCartPage addtocartpage;
	public SearchResultPageTest() {
		super();
	}
	@BeforeTest
	public void setup() {
		initialization();
		loginpage = new LoginPage();
		signinpage= loginpage.clickonsignin();
		signinpage = new SignInPage();
		homepage = signinpage.signingin(m.get("username"), m.get("password"));
		homepage= new HomePage();
		//searchresultpage = homepage.SearchText();
		addtocartpage = new AddtoCartPage();
	}
	@Test
	public void verifySelectitemTest() {
		addtocartpage= searchresultpage.selectSearchitem();
		
	}
	@AfterMethod
	public void teardown() {
		driver.quit();
	}
	
	

}
