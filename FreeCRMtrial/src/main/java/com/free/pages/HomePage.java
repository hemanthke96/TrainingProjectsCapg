package com.free.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.free.util.SetupDriver;

public class HomePage extends SetupDriver {
	
	@FindBy(xpath = "//span[contains(text(),'Pranay')]")
	@CacheLookup
	WebElement user_info;

	@FindBy(xpath = "//span[contains(text(),'Contacts')]")
	WebElement contactsLink;
	
	@FindBy(xpath = "//span[contains(text(),'Calendar')]")
	WebElement Calendarlink;
	
	@FindBy(xpath = "//span[contains(text(),'Deals')]")
	WebElement dealsLink;

	@FindBy(xpath = "//span[contains(text(),'Tasks')]")
	WebElement tasksLink;
	
	@FindBy(xpath = "//span[contains(text(),'Companies')]")
	WebElement CompanyLink;
	public HomePage() {
		PageFactory.initElements(driver, this);
	}
	
	public String verifyHomepagetitle() {
		return driver.getTitle(); 
	}
	
	public String verify_url() {
		return driver.getCurrentUrl();
	}
	
	public boolean verifyUserName() {
		return user_info.isDisplayed();
	}
	
	public CalendarPage Cal_click() {
		Actions act = new Actions(driver);
		act.moveToElement(Calendarlink).click().build().perform();
		return new CalendarPage();
	}
	
	public RestOfPages contact_click() {
		Actions act = new Actions(driver);
		act.moveToElement(contactsLink).click().build().perform();
		return new RestOfPages();
	}
	
	public RestOfPages tasks_click() {
		Actions act = new Actions(driver);
		act.moveToElement(tasksLink).click().build().perform();
		return new RestOfPages();
	}
	
	public RestOfPages deals_click() {
		Actions act = new Actions(driver);
		act.moveToElement(dealsLink).click().build().perform();
		return new RestOfPages();
	}
	public RestOfPages company_click() {
		Actions act = new Actions(driver);
		act.moveToElement(CompanyLink).click().build().perform();
		return new RestOfPages();
	}
}
