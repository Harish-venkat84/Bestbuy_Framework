package com.bestbuy.property;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.commons.configuration2.Configuration;
import org.apache.commons.configuration2.FileBasedConfiguration;
import org.apache.commons.configuration2.PropertiesConfiguration;
import org.apache.commons.configuration2.builder.FileBasedConfigurationBuilder;
import org.apache.commons.configuration2.builder.fluent.Parameters;
import org.apache.commons.configuration2.ex.ConfigurationException;

public class MenuTitles {
	
	static Properties pro = new Properties();
	
	static Configuration config;
	static FileBasedConfigurationBuilder<FileBasedConfiguration> builder;
	public String path = "";
	
	
	public void createPropertyFile() throws ConfigurationException, IOException {
		
		String path = System.getProperty("user.dir") + this.path;
		
		File file = new File(path);
		
		if (!file.exists()) {
			
			file.createNewFile();
		}
		
		Parameters parameter = new Parameters();
		builder = new FileBasedConfigurationBuilder<FileBasedConfiguration>(PropertiesConfiguration.class)
				.configure(parameter.properties().setFileName(file.getPath()));
		
		config = builder.getConfiguration();
	}
	
	public void write(String key, String value) throws ConfigurationException {
		
		config.setProperty(key, value);
		builder.save();
	}
	
	static Properties property;
	
	public void loadPropertyFile() {
		
		try {
			
			String path = System.getProperty("user.dir") + this.path;

			FileInputStream input = new FileInputStream(new File(path));

			property = new Properties();

			property.load(input);
			
			input.close();

		} catch (Exception ex) {
			
			System.out.println("problem on loading the property file");
			
			ex.printStackTrace();
		}
	}
	
	public String getValue(String key) {
		
		try { return property.getProperty(key); }catch (Exception ex) {
			
			System.out.println("problem getting value from property file");
			
			ex.printStackTrace();
		}
		
		return null;
	}

}
