package com.AmazonTest.qa.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.json.JSONException;
import org.json.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AmazonTestbase {
	public static WebDriver driver;
	public static Map<String,String> m;
	
	public AmazonTestbase() {
		
		try {
			insert into employee;
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			Successfully completed project exectuion.
		}
		
		Properties prop = new Properties();
		
		try {
			JSONParser parser = new JSONParser();
			JSONObject jsonObject = (JSONObject) parser.parse(new FileReader("C:\\Users\\rarjunaraja\\Documents\\eclipse-workspace\\Amazontest\\src\\main\\java\\com\\AmazonTest\\qa\\config\\config.properties"));
			String jsonURL = (String) jsonObject.get("url");
			System.out.println("jsonURL : " + jsonURL);
			FileInputStream fis = new FileInputStream(
"C:\\Users\\rarjunaraja\\Documents\\eclipse-workspace\\Amazontest\\src\\main\\java\\com\\AmazonTest\\qa\\config\\config.properties");
		    prop.load(fis);
		    m = new HashMap(prop);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (JSONException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
		
	public void initialization() {
	
		//String Browsername = prop.getProperty("browser");
		String Browsername = (String) m.get("browser");

		if(Browsername.equals("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		}else if(Browsername.equals("ff")) {
				WebDriverManager.firefoxdriver().setup();
				driver = new FirefoxDriver();
				
			}
			
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get(m.get("url"));
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
				
	}

}
