package com.AmazoTest.qa.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.AmazonTest.qa.base.AmazonTestbase;

public class SignInPage extends AmazonTestbase {
	    
	     @FindBy(name="email")
	     WebElement username;
	     
	     @FindBy(name="password")
	     WebElement password;
	     
	     @FindBy(id="signInSubmit")
	     WebElement signinBtn;
	     
	     public SignInPage() {
	    	 PageFactory.initElements(driver, this);
	     }
	     
	     public HomePage signingin(String uname, String pass) {
	    	 username.sendKeys(uname);
	    	 password.sendKeys(pass);
	    	 signinBtn.click();
	    	 return new HomePage();
	     }

}
