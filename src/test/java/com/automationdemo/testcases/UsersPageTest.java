package com.automationdemo.testcases;

import com.automationdemo.base.TestBase;
import com.automationdemo.pages.HomePage;
import com.automationdemo.pages.LoginPage;
import com.automationdemo.pages.UsersPage;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class UsersPageTest extends TestBase {
    HomePage homePage;
    UsersPage usersPage;
    LoginPage loginPage;

    public UsersPageTest(){
        super();
    }

    @BeforeMethod
    public void seup(){
        initialization();
        loginPage = new LoginPage();
        homePage = loginPage.loging(properties.getProperty("username"), properties.getProperty("password"));
        usersPage = homePage.ClickOnUserLink();
    }

    @Test(priority = 1)
    public void loginPageLogoTest(){
        usersPage = usersPage.clickOnUser();
    }

    @AfterMethod
    public void tearDown(){
        driver.quit();
    }
}
