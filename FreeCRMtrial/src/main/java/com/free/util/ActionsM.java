package com.free.util;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class ActionsM extends SetupDriver{

	public static void keyboardEntry(String eleselect,String keys) {
		System.out.println("ActionKeyEntry");
		driver.findElement(By.xpath(eleselect)).sendKeys(keys);
	}

	public static void MouseClick(String eleselect) {
		System.out.println("MouseClick");
		WebElement buttonclick = driver.findElement(By.xpath(eleselect));
		Actions builder = new Actions(driver);
		builder.moveToElement(buttonclick).click().perform();
	}

	public static void JSClickEle(String eleselect) {
		System.out.println("JS Click");
		WebElement m=driver.findElement(By.xpath(eleselect));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", m);
	}
	public static String geTitle(String titleofPage) {
		System.out.println("title retrieved");
		return(driver.getTitle());
	}
	public static String getURL(String webpageURL) {
		return(driver.getCurrentUrl());
	}
	public static String getPageSource (String SourceOfPage) {
		return(driver.getPageSource());
	}
	public static void GoBack() {
		driver.navigate().back();
	}
	public static void GoForward() {
		driver.navigate().forward();
	}
	public static void RefreshPage() {
		driver.navigate().refresh();
	}
	
	
}