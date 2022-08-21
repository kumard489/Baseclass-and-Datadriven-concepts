package org.testing;

import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.security.KeyRep;
import java.util.List;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane.CloseAction;

import org.utilities.BaseClass;
import org.utilities.SignInPagePojo;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
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
		launchUrl("https://www.toolstation.com/");
		getTitleAndUrl();
		
		driver.findElement(By.xpath("//input[@id='name']")).sendKeys(getData(0, 1, 2));
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys(getData(0, 1, 0));
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys(getData(0, 1, 1));
	    scrnshot("naukri");
	    
	    
	   
		
		
		closeTab();
		
		
		
		
		
		
	}

}
