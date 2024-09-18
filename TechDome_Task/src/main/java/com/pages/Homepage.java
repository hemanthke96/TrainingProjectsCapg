package com.pages;

import javax.swing.ActionMap;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.util.ActionsM;
import com.util.SetupDriver;

public class Homepage extends SetupDriver {
	
	Actions buildActions = new Actions(driver);
	@FindBy(xpath = "//a[contains(text(),'Register')]")
	WebElement RegisterLink;
	
	@FindBy(xpath = "//a[contains(text(),'Log in')]")
	WebElement LoginLink;
	
	@FindBy(xpath = "//input[contains(@value,'Search store')]")
	WebElement SearchBox;
	
	@FindBy(xpath = "//a[contains(text(),'Laptop')]")
	WebElement SearchResultLink;
	
	@FindBy(xpath = "//span[contains(@class,'price-value')]")
	WebElement GetPrice;
	
	@FindBy(xpath = "//h1[contains(@itemprop,'name')]")
	WebElement GetTextofProp;
	
	
	
	public Homepage() {
		PageFactory.initElements(driver, this);
	}
	
	public void clicklogin() {
		ActionsM.MouseClick("//a[contains(text(),'Log in')]");
	}
	
	public void enterDetailsforLogin(String user, String pwd) {
		ActionsM.keyboardEntry("//*[@id=\"Email\"]", user);
		ActionsM.keyboardEntry("//*[@id=\"Password\"]", pwd);
	}
	
	public void clickonLoginAfterEntry(String str) {
		ActionsM.JSClickEle("//input[contains(@value,'Log in')]");
		System.out.println(str + "Logged In successfully");
	}
	
	public void SearchandGetData(String searchValue) {
		//ActionsM.MouseClick("//input[contains(@value,'Search store')]");
		ActionsM.keyboardEntry("//input[contains(@value,'Search store')]", searchValue);
		SearchBox.sendKeys(Keys.RETURN);
		System.out.println("Price of the laptop"+GetPrice.getText());
		System.out.println("Name of the product"+GetTextofProp.getText());
	}
	
	
}
