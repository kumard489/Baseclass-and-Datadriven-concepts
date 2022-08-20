package org.ss;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Singletonn {
	public static Singletonn chrom;
	public static WebDriver driver;

	public Singletonn() {
	}

	public static Singletonn creatingObj() {
		chrom = new Singletonn();
		return chrom;
	}

	public void prop() {
		WebDriverManager.chromedriver().setup();
	}

	public void drive() {
		driver = new ChromeDriver();
	}

	public void url(String url) {
		driver.get(url);
	}

	public void maxi() {
		driver.manage().window().maximize();
	}

	public void clo() {
		driver.close();
	}

	public static void main(String[] args) {
		Singletonn l1 = new Singletonn();
		l1.prop();
		l1.drive();
		l1.maxi();
		l1.url("http://www.facebook.com");
		l1.clo();

		Singletonn l2 = new Singletonn();
		l2.prop();
		l2.drive();
		l2.maxi();
		l2.url("http://www.yahoo.com");
		l2.clo();

	}

}
