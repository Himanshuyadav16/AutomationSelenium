package com.automationSelenium.pages;

import com.automationSelenium.utlis.ApplicationProperties;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;


public class HomePage extends BasePage {
    public String baseUrl = ApplicationProperties.INSTANCE.getUrl();
    public String baseUrls = ApplicationProperties.INSTANCE.getUrls();
    public String BaseUrlGoogle = ApplicationProperties.INSTANCE.getUrlGoogle();
    public String BaseUrlIFrame = ApplicationProperties.INSTANCE.getUrlIFrame();


    @FindBy(xpath = "//*[contains(a,'SwitchTo')]")
    private WebElement overAlert;
    @FindBy(xpath = "//*[contains(a,'Alerts')]")
    private WebElement clickAlert;

    @FindBy(xpath = "//*[contains(span,'Close')]")
    private WebElement close;


    @FindBy(xpath = "//*[@id='wp_nav_menu-item-36814']/a/span")
    private WebElement pop;

    @FindBy(id = "firstname-e0babd8d-9e08-437f-890a-d91f17aa48ae")
    private WebElement firstName;

    @FindBy(id = "email-e0babd8d-9e08-437f-890a-d91f17aa48ae")
    private WebElement email;

    @FindBy(xpath = "//*[@id='phone-e0babd8d-9e08-437f-890a-d91f17aa48ae']")
    private WebElement phone;

    @FindBy(id = "message-e0babd8d-9e08-437f-890a-d91f17aa48ae")
    private WebElement message;


    @FindBy(xpath = "//*[@id='hsForm_e0babd8d-9e08-437f-890a-d91f17aa48ae']/div/div[2]/input")
    private WebElement submit;

    @FindBy(id = "frm1")
    private WebElement iFrame;


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

        for (int i = 0; i < openTab.findElements(By.tagName("a")).size(); i++) {
            String openTabRepeat = Keys.chord(Keys.CONTROL, Keys.ENTER);

            openTab.findElements(By.tagName("a")).get(i).sendKeys(openTabRepeat);
        }
        Thread.sleep(5000);
        driver.quit();
    }
    public void iFrame() throws InterruptedException {
        driver.switchTo().frame("aswift_0");
        close.click();
    }

    public void frontPages() {
        driver.get(baseUrls);
    }

    public void pops() {
        if (firstName.isDisplayed()) {
            System.out.println("pop is displayed");
        } else {
        }
        //After click Let's click button
        pop.click();
        if (firstName.isDisplayed()) {
            firstName.click();
            firstName.sendKeys("test");
            email.sendKeys("user12@gmail.com");
            phone.sendKeys("7089675489");
            message.sendKeys("hello how are u");
            submit.click();
        } else {
            System.out.println("pop is not displayed ");
        }

    }

    public void frontPageGoogle() {
        driver.get(BaseUrlGoogle);
    }

    public void multipleWindow() {


    }

    public void frontPageFrame() {
        driver.get(BaseUrlIFrame);
    }

    public void iFrames() {
        WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.presenceOfElementLocated(By.id("frm1")));
        int size = driver.findElements(By.id("frm1")).size();
        System.out.println("Total Frames " + size);
        driver.switchTo().frame(0);

        Select select=new Select(iFrame);
        select.selectByValue("Home");

    }

}