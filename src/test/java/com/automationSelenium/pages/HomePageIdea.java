package com.automationSelenium.pages;

import com.automationSelenium.utlis.ApplicationProperties;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePageIdea extends BasePage{
    public String getUrlIdeaForGetch = ApplicationProperties.INSTANCE.getUrlIdeaForGetch();

    @FindBy(xpath = "//a[text()='Mapping']")
  //  @FindBy(className = "hasDropdown")
    private WebElement mapping;

    public HomePageIdea(WebDriver driver){
        super(driver);
        PageFactory.initElements(driver,this);
    }
    public void homePageIdea() throws InterruptedException {
        driver.get(getUrlIdeaForGetch);
        Thread.sleep(10000);
        Actions actions = new Actions(driver);
        actions.moveToElement(mapping).click();
//         mapping.click();
    }
}
