package com.Abhi.TestNGTest;

import org.testng.annotations.Test;

import com.Abhi.PageFactry.SrchScrn;
import com.Abhi.PageFactry.SlctBus;

import org.testng.annotations.BeforeTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class AbhiBusTest {
	WebDriver driver;
  @Test
  public void AbhiBus() {
	  
	  SrchScrn oSrchScrn = new SrchScrn(driver);
		oSrchScrn.source();
		oSrchScrn.destination();
		oSrchScrn.startdat();
		oSrchScrn.rtrndt();
		oSrchScrn.srchBus();
		
		
		
		SlctBus oSlctBus = new SlctBus(driver);
		oSlctBus.pageexist();
		oSlctBus.slctSeat();
		oSlctBus.fromLoc();
		oSlctBus.bookbtn();
		oSlctBus.rtnSeat();
		oSlctBus.toLoc();
		oSlctBus.paymntBtn();		 
  }
  @BeforeTest
  public void beforeTest() {
	  
	  String drvPath = "C:\\Users\\user1\\Desktop\\chromedriver_win32\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver",drvPath);
		//WebDriver driver = new ChromDriver(); --> null point exception if Webdriver is again initialIsed
		driver = new ChromeDriver();
		driver.get("https://www.abhibus.com");
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		driver.manage().window().maximize();
  }

  @AfterTest
  public void afterTest() {
	  driver.close();
  }

}
