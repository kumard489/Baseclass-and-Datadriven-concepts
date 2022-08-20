package org.utilities;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

public class HomepagePojo extends AllPageFooterPojo {

	// pagafactory
	public HomepagePojo() {
		PageFactory.initElements(driver, this);
	}

	// homepage locators
	@FindBy(xpath = "(//a[@class='product-suggestion '])[6]")
	private WebElement firstProduct;
	
	
    //getters
	public WebElement getFirstProduct() {
		return firstProduct;
	}

}
