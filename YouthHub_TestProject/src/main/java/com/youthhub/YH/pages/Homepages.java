package com.youthhub.YH.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.youthhub.YH.base.TestBase;

public class Homepages extends TestBase {

	@FindBy(name="identity") WebElement nm;
	@FindBy(name="password") WebElement pwrd;
	@FindBy(id="join_today_popup") WebElement lg;
	 //Initializing the PageObjects
    public  Homepages() {
   	
   	 PageFactory.initElements(driver,this);//this means pointing to the current class object
   	 }
    
    //Actions
    public String validateLoginPageTitle() {
   	 return driver.getTitle();
    }
    
    public Dashboardpage  login(String user, String pwd){
 		nm.sendKeys(user);
 		pwrd.sendKeys(pwd);
 		lg.click();
 		    //	JavascriptExecutor js = (JavascriptExecutor)driver;
 		    //	js.executeScript("arguments[0].click();", loginBtn);
 		    	
 		return new Dashboardpage();
 	}
}
