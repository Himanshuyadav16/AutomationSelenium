package com.automationSelenium.testCases;

import com.automationSelenium.BaseClass;
import com.automationSelenium.pages.HomePage;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class AutomationTest extends BaseClass {
    @Test
    public void homePageTest() {
        WebDriver driver = getDriver();
        HomePage homePage = new HomePage(driver);
        homePage.frontPage();
    }

}
