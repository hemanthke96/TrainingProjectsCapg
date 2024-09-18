package com.free.pages;

import java.io.FileInputStream;
import java.util.List;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.free.util.SetupDriver;

public class CalendarPage extends SetupDriver{
	FileInputStream Fread;
	XSSFWorkbook wb;
	XSSFSheet sh;
	int rowval,rowcount;

	public CalendarPage() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(how = How.XPATH, using = "//button[contains(text(),'Create')]")
	@CacheLookup
	WebElement createEvent;

	@FindBy(how = How.XPATH, using = "//button[contains(text(),'Save')]")
	@CacheLookup
	WebElement saveEvent;

	//events in findelements
	@FindBy(how = How.XPATH, using = "//div[@class='rbc-event-content']")
	List<WebElement> allevents;

	//agenda
	@FindBy(how=How.XPATH, using = "//span[contains(text(),'Agenda')]")
	@CacheLookup
	WebElement agendabutton;

	@FindBy(how=How.XPATH, using = "//button/i[@class='edit icon']")
	@CacheLookup
	WebElement editevent;

	@FindBy(how=How.XPATH, using = "//button/i[@class='trash icon']")
	@CacheLookup
	WebElement deletevent;

	@FindBy(how=How.XPATH, using = "//button/i[@class='remove icon']")
	@CacheLookup
	WebElement confdel;
	
//---------------------------------------------------------------------------------	
	public String cal_titleofpage() {
		System.out.println("titleofpage_method");
		return driver.getTitle();
	}
	public String cal_url_page() {
		System.out.println("geturlpage method");
		return driver.getCurrentUrl();
	}
	//---------------------------------------------------------------------------------	
	public void createclk() {
		//createEvent.click();
		System.out.println("create event method");
		driver.findElement(By.xpath("//button[contains(text(),'Create')]")).click();
	}
	//---------------------------------------------------------------------------------	
	// Getting the data from excel
	public void manualentry() {
		System.out.println("Giving manual entry to create method");
		driver.findElement(By.name("title")).clear();
		driver.findElement(By.name("title")).sendKeys("Meeting about Bylaws in the firm");
		driver.findElement(By.xpath("//input[contains(@value,'08/07/2022 12:00')]")).clear();
		driver.findElement(By.xpath("//input[contains(@value,'08/07/2022 12:00')]")).sendKeys("14/07/2022 21:45");
		driver.findElement(By.xpath("//input[contains(@value,'08/07/2022 13:00')]")).clear();
		driver.findElement(By.xpath("//input[contains(@value,'08/07/2022 13:00')]")).sendKeys("14/07/2022 23:45");
	}
	//---------------------------------------------------------------------------------	
	public void exceldataentry() throws Exception {
		//create click method
		System.out.println("getting data from excel method");
		
		String valexcel;
		
		WebElement title_cal_new = driver.findElement(By.name("title"));
		WebElement st_date_new = driver.findElement(By.xpath("//input[@class='calendarField react-datepicker-ignore-onclickoutside']"));
		WebElement end_date_new = driver.findElement(By.xpath("//input[@class='calendarField']"));
		Fread = new FileInputStream("C:\\Users\\EADKUMAR\\OneDrive - Capgemini\\exceldatafreecrm.xlsx");
		wb = new XSSFWorkbook(Fread);
		sh = wb.getSheet("Calendar");
		rowcount = sh.getPhysicalNumberOfRows();
		for(rowval=1;rowval<rowcount;rowval++) {
			for(int j=0;j<rowcount;j++) {
				if(j==0) {
					//cell(1,0)
					valexcel = sh.getRow(rowcount).getCell(j).getStringCellValue();
					title_cal_new.clear();
					title_cal_new.sendKeys(valexcel);
				}
				else if(j==1) {
					//cell(1,1)
					valexcel = sh.getRow(rowcount).getCell(j).getStringCellValue();
					st_date_new.clear();
					st_date_new.sendKeys(valexcel);
				}
				else if(j==2) {
					//cell(1,2)
					valexcel = sh.getRow(rowcount).getCell(j).getStringCellValue();
					end_date_new.clear();
					end_date_new.sendKeys(valexcel);
				}
			}
		}
	}
	public void saveclk() {
		saveEvent.click();
		System.out.println("clciking on save method");
		//driver.findElement(By.xpath("//button[contains(text(),'Save')]")).click();
	}
	//---------------------------------------------------------------------------------	
	public void eventclk() {
		System.out.println("clicking on event method");
		String event_des, event_page;
		System.out.println(allevents.size());
		for(int i=0;i<allevents.size();i++)
		{
			event_des = allevents.get(i).getText();
			System.out.println(event_des);
			allevents.get(i).click();
			event_page=driver.findElement(By.xpath("(//p)")).getText();
		}
	}
	public void editclk() {
		editevent.click();
		System.out.println("Click on edit link");
		//driver.findElement(By.xpath("//a[@href='/calendar']")).click();
		allevents.get(0).click();
		//driver.findElement(By.xpath("//button/i[@class='trash icon']"));
	}
	//---------------------------------------------------------------------------------	
	public void editSCinpLocation(String location_change) {
		System.out.println("editing with help of scenario outline input");
		driver.findElement(By.name("location")).sendKeys(location_change);
	}
	//---------------------------------------------------------------------------------	
	public void deleteclk() {
		System.out.println("Deleting an event method");
		allevents.get(1).click();
		deletevent.click();
		confdel.click();
		//driver.findElement(By.xpath("//button/i[@class='trash icon']")).click();
		//driver.findElement(By.xpath("//button/i[@class='remove icon']")).click();
	}
}
