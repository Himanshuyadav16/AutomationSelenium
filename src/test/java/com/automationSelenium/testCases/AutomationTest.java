package com.automationSelenium.testCases;

import com.automationSelenium.BaseClass;
import com.automationSelenium.pages.AlertPage;
import com.automationSelenium.pages.HomePage;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class AutomationTest extends BaseClass {

    @Test
    public void homePageTest() {
        WebDriver driver = getDriver();
        HomePage homePage = new HomePage(driver);
        homePage.frontPage();
        driver.close();
    }
    @Test
    public void alertPage() throws InterruptedException {
        WebDriver driver = getDriver();
        HomePage homePage = new HomePage(driver);
        homePage.frontPage();
        homePage.clickSwitchAlert();
      //  homePage.iFrame();
        AlertPage alertPage=new AlertPage(driver);
        alertPage.alertButton();
        driver.close();
    }



}
