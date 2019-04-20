package com.Abhi.PageFactry;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SrchScrn {
	
	WebDriver driver;
	WebDriverWait wait;
		
	@FindBy(id="source") WebElement lvngStn;
	@FindBy(xpath="//li[text()='Kochi']") WebElement srcStn;
	@FindBy(id="destination")WebElement gngStn;
	@FindBy(xpath="//li[text()='Chennai']")WebElement destStn;
	@FindBy(name="journey_date")WebElement strtDt;
	@FindBy(xpath="(//a[text()='21'])[1]")WebElement strtDtVal;
	@FindBy(name="journey_rdate")WebElement rtrnDt;
	@FindBy(xpath="(//a[text()='27'])[1]")WebElement rtrnDtVal;
	@FindBy(xpath="//a[@title='Search Buses']")WebElement srchBtn;
	
	public SrchScrn(WebDriver driver) {
		
		this.wait = new WebDriverWait(driver, 30);
		PageFactory.initElements(driver, this);
	}
	
	public void source() {
	lvngStn.sendKeys("Kochi");
	srcStn.click();
	}
	
	public void destination() {
	gngStn.sendKeys("Chennai");
	destStn.click();
	}
	
	public void startdat() {
	strtDt.click();
	wait.until(ExpectedConditions.visibilityOf(strtDtVal));
	strtDtVal.click();
	
	}
	
	public void  rtrndt() {	
	rtrnDt.click();
	wait.until(ExpectedConditions.visibilityOf(rtrnDtVal));
	rtrnDtVal.click();
	}
	
	public void srchBus() {
	srchBtn.click();
	}
}