package com.Abhi.PageFactry;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SlctBus {
	
	WebDriver driver ;
	WebDriverWait wait;
	
	@FindBy(xpath="(//div[@id='SerVicesDetOneway1']//span[text()='Select Seat'])[1]") WebElement slctSeat;
	@FindBy(xpath="((//div[@class='seats'])[1]//li[@class='sleeper available'])[1]//a") WebElement seatAvlb;
	@FindBy(id="boardingpoint_id1") WebElement boardPt;
	@FindBy(xpath="//input[@id='btnEnable1']")  WebElement rtrnBtn;
	@FindBy(xpath="(//div[@id='SerVicesDetOneway2']//span[text()='Select Seat'])[1]") WebElement rtrnSeat;
	@FindBy(xpath="((//div[@class='seats'])[2]//li[@class='seat available'])[1]//a") WebElement rtnAvlb;
	@FindBy(name="boardingpoint_id2")WebElement boardPt1;
	@FindBy(xpath="(//input[@value='Continue to Payment '])[2]") WebElement paymtBtn;
	@FindBy(xpath="//div[@class='mainsection']") WebElement slctBusPg;
	
	public SlctBus(WebDriver driver) {
		
		this.wait = new WebDriverWait(driver, 30);
		PageFactory.initElements(driver, this);
	}
	
	public void pageexist() {
		wait.until(ExpectedConditions.visibilityOf(slctBusPg));
	}
	
	public void slctSeat() {
		 //500 milli seconds interval
		wait.until(ExpectedConditions.visibilityOf(slctSeat));
		slctSeat.click();
		seatAvlb.click();
		}
	public void fromLoc() {
		boardPt.click();
		//***Select as class and create object to retrieve list value ***
		Select oboard = new Select(boardPt);
		//String boardingpoint = oboard.getFirstSelectedOption().getText();
		oboard.selectByIndex(1);
		}
	
	public void bookbtn() {
		rtrnBtn.click();		
	}
	
	public void rtnSeat() {
		wait.until(ExpectedConditions.visibilityOf(rtrnSeat));
		rtrnSeat.click();
		rtnAvlb.click();		
	}
	
	public void toLoc() {
		boardPt1.click();
		Select oboard1 = new Select(boardPt1);
		oboard1.selectByIndex(2);
		//String boardingpoint1=oboard1.getFirstSelectedOption().getText();
		}
	
	
	public void paymntBtn() {
		
		paymtBtn.click();
		
	}
	
	
	
	

}
