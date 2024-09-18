package com.free.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.free.util.SetupDriver;

public class RestOfPages extends SetupDriver{
	@FindBy(xpath = "/html/body/div[1]/div/div[2]/div[2]/div/div[1]/div[1]/div")
	WebElement title;
	
	public RestOfPages() {
		PageFactory.initElements(driver, this);
	}
	
	public String urlofpage() {
		return driver.getCurrentUrl();
	}
}
