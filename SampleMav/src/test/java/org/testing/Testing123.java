package org.testing;

import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.security.KeyRep;
import java.util.Date;
import java.util.List;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane.CloseAction;

import org.utilities.BaseClass;
import org.utilities.HomepagePojo;
import org.utilities.SignInPagePojo;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Sleeper;

import net.bytebuddy.asm.Advice.This;

public class Testing123 extends BaseClass {
	
	
	public static void main(String[] args) throws Throwable {
		launchChrome();
		chromeObject();
		winMax();
		implicitWaiting();
		launchUrl("https://www.toolstation.com/login");
		
		implicitWaiting();
		Date dt=new Date();
		System.out.println(dt);

		SignInPagePojo s=new SignInPagePojo();
		s.getAcceptAll();
		s.getTxtUserName().sendKeys(getData(1, 2, 0));
		s.getTxtPassword().sendKeys(getData(1, 2, 1));
		s.getBtnLogin();

		closeTab();

	}

}
