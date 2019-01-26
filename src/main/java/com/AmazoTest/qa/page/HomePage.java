package com.AmazoTest.qa.page;

import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.AmazonTest.qa.TestUtil.ExcelUtil;
import com.AmazonTest.qa.base.AmazonTestbase;

public class HomePage extends AmazonTestbase {
	
	   @FindBy(id="twotabsearchtextbox")
	   WebElement searchBox;
	   
	   
	   @FindBy(xpath="//input[@type='submit']")
	   WebElement searchLink;
	   
	   public HomePage() {
		   PageFactory.initElements(driver, this);

	   }
	   public SearchResultPage SearchText(String data) throws IOException {
		   driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
		   searchBox.sendKeys(data);
		   driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
		   searchLink.click();
		   driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
		   return new SearchResultPage();
	   }
}
