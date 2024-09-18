package com.util;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SetupDriver {

	public static WebDriver driver;
	public static ChromeOptions options;
	public static Properties prop;
	public static ChromeDriver ldriver;
	
	public SetupDriver() {
		try {
			prop = new Properties();
			FileInputStream ip = new FileInputStream("./src/main/resources/config.properties");
			prop.load(ip);
			System.out.println(prop.getProperty("url"));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	
	public static void initialization(){
		String browserName = prop.getProperty("browser");
		
		if(browserName.equals("chrome")){
			System.setProperty("webdriver.chrome.driver", "./src/main/resources/chromedriver.exe");	
			driver = new ChromeDriver(); 
		}
		else if(browserName.equals("FireFox")){
			System.setProperty("webdriver.gecko.driver", "./src/main/resources/geckodriver.exe");	
			driver = new FirefoxDriver(); 
		}
		else if(browserName.equals("Edge")){
			System.setProperty("webdriver.edge.driver", "./src/main/resources/msedgedriver.exe");	
			driver = new EdgeDriver();
		}
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		//driver.manage().timeouts().pageLoadTimeout(TestUtil.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
		//driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICIT_WAIT, TimeUnit.SECONDS);
		driver.get(prop.getProperty("url"));
		
	}
	
	public static void Liveinitialization(){
		String browserName = prop.getProperty("browser");
		
		if(browserName.equals("chrome")){
			options = new ChromeOptions();
			ldriver = new ChromeDriver(options);
		}
		else if(browserName.equals("FF")){
			System.setProperty("webdriver.gecko.driver", "");	
			driver = new FirefoxDriver(); 
		}
		options.addArguments("start-maximized");
		options.addArguments("incognito");
		//driver.manage().timeouts().pageLoadTimeout(TestUtil.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
		//driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICIT_WAIT, TimeUnit.SECONDS);
		//driver.get(prop.getProperty("url"));
		
		
		
	}
	
	public static void closebrowser() {
		driver.quit();
	}
}
