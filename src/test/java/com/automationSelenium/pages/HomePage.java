package com.automationSelenium.pages;

import com.automationSelenium.utlis.ApplicationProperties;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class HomePage extends  BasePage{
    public String baseUrl = ApplicationProperties.INSTANCE.getUrl();
    @FindBy(xpath = "//*[contains(a,'SwitchTo')]")
    private WebElement overAlert;
    @FindBy(xpath = "//*[contains(a,'Alerts')]")
    private WebElement clickAlert;

    @FindBy(xpath = "//*[contains(span,'Close')]")
    private WebElement close;

    //  @FindBy(id = "aswift_0")
    // private WebElement iFrame;

    public HomePage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    public void frontPage() {
        driver.get(baseUrl);
    }

    public void clickSwitchAlert(){
        Actions actions=new Actions(driver);
        actions.moveToElement(overAlert).perform();
        clickAlert.click();
    }

    public void multipleWindows() throws InterruptedException {
        WebElement openTab = driver.findElement(By.xpath("//*[@id='footer']/div/div/div[2]"));
        openTab.findElements(By.tagName("a")).size();
        System.out.println("Total number of links are : " + openTab.findElements(By.tagName("a")).size());
        for (int i=0; i < openTab.findElements(By.tagName("a")).size(); i++) {
            String openTabRepeat= Keys.chord(Keys.CONTROL,Keys.ENTER);
            openTab.findElements(By.tagName("a")).get(i).sendKeys(openTabRepeat);
        }
        Thread.sleep(5000);
        driver.quit();
    }
    public void iFrame() throws InterruptedException {
        driver.switchTo().frame("aswift_0");
        close.click();
    }
}