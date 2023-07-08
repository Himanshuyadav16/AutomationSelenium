package com.automationSelenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass {
    public WebDriver driver;

    public WebDriver getDriver(){
        System.setProperty("webdriver.chrome.driver","src/main/resources/chromedriver");
        driver=new ChromeDriver();
        return driver;
    }
}
