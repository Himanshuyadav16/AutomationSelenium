package com.automationSelenium.pages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AlertPage extends BasePage {

    @FindBy(className = "btn-danger")
    private WebElement alertButton;
    @FindBy(xpath = "//*[contains(a,'Alert with OK & Cancel ')]")
    private WebElement cancel;
    @FindBy(css = "button.btn.btn-primary")
    private WebElement confirmationCancel;
    @FindBy(xpath = "//*[contains(a,'Alert with Textbox ')]")
    private WebElement text;
    @FindBy(css = "button.btn.btn-info")
    private WebElement confirmationTextAccept;


    public AlertPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    public void alertButton() {
        driver.navigate().refresh();
        driver.navigate().back();
        HomePage homePage = new HomePage(driver);
        homePage.frontPage();
        homePage.clickSwitchAlert();

        alertButton.click();
        driver.switchTo().alert().accept();

        cancel.click();
        confirmationCancel.click();
        driver.switchTo().alert().accept();

        confirmationCancel.click();
        driver.switchTo().alert().dismiss();

        text.click();
        confirmationTextAccept.click();
        driver.switchTo().alert().accept();

        text.click();
        confirmationTextAccept.click();
        driver.switchTo().alert().dismiss();

        text.click();
        confirmationTextAccept.click();
        driver.switchTo().alert().sendKeys("Ram");
        driver.switchTo().alert().accept();

        cancel.click();
        confirmationCancel.click();
        Alert alert = driver.switchTo().alert();
        String alertMessage = driver.switchTo().alert().getText();
        System.out.println(alertMessage);
        alert.accept();
    }

}
