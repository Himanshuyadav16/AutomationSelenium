package com.automationSelenium.testCases;

import com.automationSelenium.BaseClass;
import com.automationSelenium.pages.HomePageIdea;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class IdeaForGetchTest extends BaseClass {
    @Test
    public void homePage() throws InterruptedException{
        WebDriver driver=getDriver();
        HomePageIdea homePageIdea=new HomePageIdea(driver);
        homePageIdea.homePageIdea();
    }

}
