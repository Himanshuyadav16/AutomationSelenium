package com.automationSelenium.pages;

import com.automationSelenium.utlis.ApplicationProperties;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends  BasePage{
    public String baseUrl = ApplicationProperties.INSTANCE.getUrl();

    public HomePage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    public void frontPage() {
        driver.get(baseUrl);
    }

}
