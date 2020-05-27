package com.Base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;



public class TestBase  {
	FileInputStream fis;	
	 public Properties properties;
	 
	public TestBase() throws IOException{
		fis = new FileInputStream("C:\\Users\\priya-pc\\Desktop\\HomeSample\\AutomationAssessment\\src\\main\\java\\com\\config\\configuration.properties");
		properties = new Properties();
		
		try {
			properties.load(fis);			
			System.out.println(properties.getProperty("getUrl"));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}


}
