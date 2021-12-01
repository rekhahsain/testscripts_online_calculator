package com.onlineCalculater.testCases;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import com.onlineCalculater.utilites.ReadConfig;

public class BaseClass {
	ReadConfig readConfig = new ReadConfig();
	public String baseUrl = readConfig.getApplicationUrl();
	public static WebDriver driver;
	public static Logger logger;

	@Parameters("browser")
	@BeforeClass
	public void setup(String br) {
		logger = Logger.getLogger("onlineCalculater");
		PropertyConfigurator.configure("log4j.properties");
		if (br.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", readConfig.getChromeDriver());
			driver = new ChromeDriver();
		} else if(br.equals("firefox")) {
			System.setProperty("webdriver.gecko.driver", readConfig.getFirefoxDriver());
			driver = new FirefoxDriver();
		}
		driver.get(baseUrl);
	}

	@AfterClass
	public void tearDown() {
		driver.close();
	}
}
