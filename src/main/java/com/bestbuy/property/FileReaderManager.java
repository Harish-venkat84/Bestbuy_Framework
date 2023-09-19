package com.bestbuy.property;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class FileReaderManager {

	static Properties property;
	
	// this method is used for load the property file on Properties class
	public FileReaderManager() {
		try {

			String path = System.getProperty("user.dir") + "\\Property\\Bestbuy.properties";

			FileInputStream input = new FileInputStream(new File(path));

			property = new Properties();

			property.load(input);

		} catch (Exception ex) {
			
			System.out.println("problem on loading the property file");
			
			ex.printStackTrace();
		}
	}
	
	// return URL value from property file as a String
	public String getURL() {
		
		try { return property.getProperty("URL"); }catch(Exception ex) {
			
			System.out.println("problem on getting URL form the property file");
			
			ex.printStackTrace();
		}
		
		return null;
	}

	// return value from property file as a String
	public String getValue(String key) {
		
		try { return property.getProperty(key); }catch (Exception ex) {
			
			System.out.println("problem getting value from property file");
			
			ex.printStackTrace();
		}
		
		return null;
	}
	
}
