package com.stud.singleton;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class Configuration {
	private static Configuration _instance = null;
	private Properties props = null;
	
	private Configuration() {
		props = new Properties();
		try {
			FileInputStream fis = new FileInputStream(new File("props.txt"));
			props.load(fis);
		}
		catch (Exception ex) {
			ex.printStackTrace();
		}
	}
	
	public synchronized static Configuration getInstance() {
		if(_instance == null) {
			_instance = new Configuration();
		}
		
		return _instance;
	}
	
	public synchronized String getProperty(String key) {
		String value = null;
		if(props.containsKey(key)) {
			value = (String) props.get(key);
		}
		else {
			System.out.println("Property with key: " + key + " not found!");
		}
		
		return value;
	}
}
