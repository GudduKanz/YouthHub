package com.youthhub.YH.tests;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.youthhub.YH.base.TestBase;
import com.youthhub.YH.pages.Dashboardpage;
import com.youthhub.YH.pages.Homepages;

public class Homepagestest extends TestBase  {
	Homepages homepage;
	Dashboardpage dash;
	public 	Homepagestest() {
		super();//super class constructor called by super key word.
	}
	@BeforeClass
	public void setUp() {
		homepage = new Homepages();
		initialization();
	  
	     }
	
	@Test(priority=1)
	public void loginPageTitletest() {
	String title =	homepage.validateLoginPageTitle();
	Assert.assertEquals(title, "Youth Hub - Welcome Page");
	}
	@Test(priority=2)
	
	public void loginTest(){
		homepage= PageFactory.initElements(driver,Homepages.class);
		 dash = homepage.login(prop.getProperty("username"), prop.getProperty("password"));
	
	}
	
	@AfterMethod
	public void tearDown() {
		//driver.quit();
	}	
	
}
