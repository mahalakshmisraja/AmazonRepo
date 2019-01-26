package com.Amazontest.qa.TestCase;

import java.io.IOException;
import java.util.Iterator;
import java.util.List;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.AmazoTest.qa.page.HomePage;
import com.AmazoTest.qa.page.LoginPage;
import com.AmazoTest.qa.page.SearchResultPage;
import com.AmazoTest.qa.page.SignInPage;
import com.AmazonTest.qa.TestUtil.ExcelUtil;
import com.AmazonTest.qa.base.AmazonTestbase;

public class HomePageTest extends AmazonTestbase {
	LoginPage loginpage;
	SignInPage signinpage;
	HomePage homepage;
	SearchResultPage searchresultpage;
    ExcelUtil eu = new ExcelUtil();

	public HomePageTest() {
		super();
	}
	
	@BeforeMethod
	public void setup() {
		initialization();
		loginpage= new LoginPage();
		searchresultpage = new SearchResultPage();
		signinpage = loginpage.clickonsignin();
		signinpage = new SignInPage();
		homepage= signinpage.signingin(m.get("username"), m.get("password"));
		
	}
	
	@DataProvider
	public Iterator<Object[]> excelData() throws IOException {
		return eu.readFile();
	} 
	
	@Test(dataProvider="excelData")
	public void verifysearchtextTest(Object searchText) throws IOException {
   		   searchresultpage = homepage.SearchText((String) searchText);   
	}
		
	//@AfterMethod
	public void teardown() {
		driver.quit();
	}

}
