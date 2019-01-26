package com.Amazontest.qa.TestCase;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.AmazoTest.qa.page.LoginPage;
import com.AmazoTest.qa.page.SignInPage;
import com.AmazonTest.qa.base.AmazonTestbase;

public class LoginPageTestcasew extends AmazonTestbase {
	LoginPage loginpage;
	SignInPage signinpage;

	 LoginPageTestcasew() {
		super();
	}
	@BeforeMethod
	public void setup() {
		initialization();
		loginpage = new LoginPage();
		signinpage = new SignInPage();
		
	}
	@Test
	public void LoginpageTest() {
		signinpage = loginpage.clickonsignin();
	}
	
	@AfterMethod
	public void teardown() {
		driver.quit();
	}
	
	/*class Car {
		String rim() {
			return "straight line";
		}
	}
	class Toyota extends Car {}
	class BMW extends Car {
		String rim() {
			return "cross line";
		}
	}
	
	abstract class Cars {
		String noOfWheels() {
			return "4";
		}
		
		abstract String colors();
	}
	
	class Hyndai extends Cars {
		String colors() {
			return "grey";
		}
	}
	static String name;
	static int age;
	@SuppressWarnings("null")
	public static void getAge() {
		try {
			
			
			//name = "tom";
			//age = (Integer) null;
			LoginPageTestcasew l = null;
			l.getAge();
		}catch(Exception e) {
			System.out.println(e);
		}
		System.out.println("selanium");
	}
	
	LoginPageTestcasew(String s) {
	}
	
	static Object o; 
	static String a= null;
	public static void main(String args[]) {
		try {
			getAge();
			o =  new String("raj");
			System.out.println(o);
			a.length();
			//throw new Exception("test");
		} catch(Exception e) {
			System.out.println(e);
			a = "5";
			a.length();
			System.out.println(a);
		}
	}*/
	
}
