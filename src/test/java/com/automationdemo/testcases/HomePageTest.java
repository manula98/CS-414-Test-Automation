package com.automationdemo.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.automationdemo.base.TestBase;
import com.automationdemo.pages.HomePage;
import com.automationdemo.pages.LoginPage;

public class HomePageTest extends TestBase{

	LoginPage loginPage;
	HomePage homePage;
	public HomePageTest() {
		super();
	}
	
	
	@BeforeMethod
	public void seup() {
		initialization();
		loginPage = new LoginPage();
		homePage = loginPage.loging(properties.getProperty("username"), properties.getProperty("password"));
	}

	@Test(priority = 1)
	public void homePageTaskLinkTest() {
		homePage.clickOnTaskLink();
		
	}
	
	
	@Test(priority = 2)
	public void homePageUserLinkTest() {
	homePage.ClickOnUserLink();
	}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

}
