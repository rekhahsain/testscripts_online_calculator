package com.onlineCalculater.utilites;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class ReadConfig {
 
	Properties pro;
	
	public ReadConfig() {
		File src = new File("./Configration/config.properties");
		try {
			FileInputStream fis = new FileInputStream(src);
			pro=new Properties();
			pro.load(fis);
			
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	public String getApplicationUrl() {
		String url = pro.getProperty("baseUrl");
		return url;
	}

	
	public String getChromeDriver() {
		String cdriver = pro.getProperty("chromepath");
		return cdriver;
	}
	public String getFirefoxDriver() {
		String fdriver = pro.getProperty("firefoxpath");
		return fdriver;
	}
}
