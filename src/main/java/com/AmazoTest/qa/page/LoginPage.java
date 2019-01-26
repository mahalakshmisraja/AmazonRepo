package com.AmazoTest.qa.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.AmazonTest.qa.base.AmazonTestbase;

public class LoginPage extends AmazonTestbase {
    
      
      @FindBy(xpath="//div[@id='nav-signin-tooltip']//span[@class='nav-action-inner'][contains(text(),'Sign in')]")
      WebElement  SigninBtn;
      
      public LoginPage() {
    	  PageFactory.initElements(driver, this);
      }
      
      public SignInPage clickonsignin() {
    	
    	  SigninBtn.click();
    	  return new SignInPage();
      }
      
      class Car {
    	  void add(int width, int height) {
    		  System.out.println("car" + width + height);
    	  }
      }
      class BMW extends Car {
    	  void add(int width, int height) {
    		  System.out.println("car" + width + height);
    	  }
    	  void add(int i) {
    		  
    	  }
      }
}
