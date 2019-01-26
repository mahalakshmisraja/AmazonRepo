package com.AmazoTest.qa.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.AmazonTest.qa.base.AmazonTestbase;

public class SearchResultPage extends AmazonTestbase {
	
	@FindBy(xpath="//a[contains(@title,'Hasbro Marvel Legends Series 12-inch Deadpool Action Figure from Uncanny X-Force Marvel Comics with Blaster/Weapon Accessories and 30 Points of Articulation (Amazon Exclusive)')]//h2[contains(@class,'a-text-normal')]")
     WebElement SearchItem;
	
	public SearchResultPage() {
		PageFactory.initElements(driver, this);
	}
	public AddtoCartPage selectSearchitem() {
		SearchItem.click();
		return new AddtoCartPage();
	}
}
