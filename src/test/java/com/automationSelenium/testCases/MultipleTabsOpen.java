package com.automationSelenium.testCases;

import com.automationSelenium.BaseClass;
import com.automationSelenium.pages.HomePage;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class MultipleTabsOpen extends BaseClass {
    @Test
    public void multipleWindow() throws InterruptedException {
        WebDriver driver = getDriver();
        HomePage homePage = new HomePage(driver);
        homePage.frontPage();
        homePage.multipleWindows();
    }

    @Test
    public void multipleWindowsTwo() throws InterruptedException {
        WebDriver driver = getDriver();
        HomePage homePage = new HomePage(driver);
        homePage.multipleWindow();
    }

    @Test
    public void multipleWindowsLoop() throws InterruptedException {
        WebDriver driver = getDriver();
        HomePage homePage = new HomePage(driver);
        homePage.multipleWindowsLoop();
    }
}