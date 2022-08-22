package org.testing;

import static org.junit.Assert.*;

import java.time.Duration;
import java.util.Date;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.utilities.BaseClass;
import org.utilities.HomepagePojo;
import org.utilities.SignInPagePojo;

import io.github.bonigarcia.wdm.WebDriverManager;


public class TestingByUsingJunit extends BaseClass {

	@BeforeClass
	public static void lunchrowser() {
		launchChrome();
		chromeObject();
		winMax();
	}

	@Before
	public void lunchToolStation() throws InterruptedException {
		implicitWaiting();
		launchUrl("https://www.toolstation.com/login");
		Date dt = new Date();
		System.out.println(dt);
	}
	
	@After
	public void endTime() {
		Date dt = new Date();
		System.out.println(dt);
	}

	@Test
	public void tc1() {
		SignInPagePojo s = new SignInPagePojo();
		s.getAcceptAll().click();
		s.getTxtUserName().sendKeys(getData(1, 2, 0));
		s.getTxtPassword().sendKeys(getData(1, 2, 1));
		s.getBtnLogin();
		
	}

	@Test
	public void tc2() {
		SignInPagePojo s = new SignInPagePojo();
		s.getTxtUserName().sendKeys(getData(1, 3, 0));
		s.getTxtPassword().sendKeys(getData(1, 3, 1));
		s.getBtnLogin();
		
	}
	
	@AfterClass
	public static void closee() {
		closeTab();
	}


	

}
