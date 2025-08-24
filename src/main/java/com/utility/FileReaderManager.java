package com.utility;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.junit.Assert;

public class FileReaderManager {
	private static FileInputStream fileInputStream;
	private static Properties property;
	public static void setUpProperty() throws IOException {
		File file = new File("C:\\Users\\HP\\eclipse-workspace\\Naukri_Project\\src\\main\\resources\\NaukriData.properties");
		try {
			fileInputStream = new FileInputStream(file);
			property = new Properties();
			property.load(fileInputStream);
		}catch(FileNotFoundException e) {
			Assert.fail("ERROR : OCCUR DURING FILE LOADING");
		}catch(Exception e) {
			Assert.fail("ERROR : OCCUR DURING FILE READING");
		}
	}
	public static String getDataProperty(String value) throws IOException {
		setUpProperty();
		return property.getProperty(value);
			
	}
	public static void main(String args[]) throws IOException {
		System.out.println(getDataProperty("browser"));
	}
	

}
