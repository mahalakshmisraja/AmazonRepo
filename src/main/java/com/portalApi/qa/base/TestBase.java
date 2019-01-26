package com.portalApi.qa.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;


public class TestBase {
    public Properties prop;
	
	public TestBase() {
		try {
			prop = new Properties();
			FileInputStream fis = new FileInputStream("C:\\Users\\rarjunaraja\\Documents\\eclipse-workspace\\Amazontest\\src\\main\\java\\com\\portalApi\\qa\\config\\config.properties");
			try {
				prop.load(fis);
				System.out.println(prop);
			} catch (IOException e) {
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
}