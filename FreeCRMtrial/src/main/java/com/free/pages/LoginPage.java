package com.free.pages;

import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.free.util.SetupDriver;

public class LoginPage extends SetupDriver {
	FileInputStream FRead;
	XSSFWorkbook wb;
	XSSFSheet sh;
	int rowval,rowcount;

	@FindBy(xpath =  "//a[contains(text(),'Login')]")
	@CacheLookup
	WebElement login_link;

	@FindBy(how = How.NAME, using = "email")
	@CacheLookup
	WebElement usern;

	@FindBy(how = How.NAME, using = "password")
	@CacheLookup
	WebElement password;

	@FindBy(xpath = "//div[contains(@class,'ui fluid large blue submit button')]")
	@CacheLookup
	WebElement login_button;
	
	@FindBy(xpath = "//a[contains(@class,'navbar-brand')]/img[contains(@class,'img-responsive')]")
	@CacheLookup
	WebElement freeCRMLogo;

	@FindBy(xpath = "//p[contains(text(),'Invalid')]")
	@CacheLookup
	WebElement InvalidLogin;
	
	@FindBy(xpath = "//p[contains(text(),'Invalid')]")
	WebElement inv_text;
	
	public LoginPage() {
		PageFactory.initElements(driver, this);
	}
	
	public String titleofpage() {
		System.out.println("titleofpage_method");
		return driver.getTitle();
	}
	public String url_page() {
		System.out.println("geturlpage method");
		return driver.getCurrentUrl();
	}
	public boolean validateCRMLogo() {
		return freeCRMLogo.isDisplayed();
	}
	public void click_on_Loginlink() {
		System.out.println("clickonLogin Link on login page Method");
		System.out.println(driver.getTitle());
		//driver.findElement(By.xpath("//a[contains(text(),'Login')]")).click();
		//login_link.click();
		JavascriptExecutor js = (JavascriptExecutor)driver;
    	js.executeScript("arguments[0].click();", login_link);
		System.out.println(driver.getCurrentUrl());
	}
	
	public void click_on_classic() {
		WebElement classicFRCM=driver.findElement(By.xpath("//a[contains(text(),'Classic CRM')]"));
		JavascriptExecutor js = (JavascriptExecutor)driver;
    	js.executeScript("arguments[0].click();", classicFRCM);
	}
	// entering email
	public void email_login() throws Exception {
		System.out.println("entering email method");
		//email.sendKeys("pranaygupta937@gmail.com");
		FRead = new FileInputStream("C:\\Users\\EADKUMAR\\OneDrive - Capgemini\\exceldatafreecrm.xlsx");
		wb = new XSSFWorkbook(FRead);
		sh = wb.getSheet("Login");
		String emailval = sh.getRow(0).getCell(0).getStringCellValue();
		//driver.findElement(By.name("email")).sendKeys(emailval);
		usern.sendKeys(emailval);
	}
	//entering password
	public void password_login() throws Exception {
		System.out.println("entering password method");
		//driver.findElement(By.name("password")).sendKeys("Pranay@08");
		//password.sendKeys("Pranay@08");
		FRead = new FileInputStream("C:\\Users\\EADKUMAR\\OneDrive - Capgemini\\exceldatafreecrm.xlsx");
		wb = new XSSFWorkbook(FRead);
		sh = wb.getSheet("Login");
		String pwdval = sh.getRow(0).getCell(1).getStringCellValue();
		//driver.findElement(By.name("password")).sendKeys(pwdval);
		password.sendKeys(pwdval);
	}
	public void invClickLogin() {
		//login_button.click();
		JavascriptExecutor js = (JavascriptExecutor)driver;
    	js.executeScript("arguments[0].click();", login_button);
	}
	public String inval_text() {
		return inv_text.getText();
	}
	// clicking on the login button
	public HomePage login_button() {
		System.out.println("Login Submit method");
		//driver.findElement(By.xpath("//*[@id=\"ui\"]/div/div/form/div/div[3]")).click();
		login_button.click();
		JavascriptExecutor js = (JavascriptExecutor)driver;
    	js.executeScript("arguments[0].click();", login_button);
		return new HomePage();
	}
}
