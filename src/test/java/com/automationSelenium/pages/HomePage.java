package com.automationSelenium.pages;

import com.automationSelenium.utlis.ApplicationProperties;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.ArrayList;


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

    @FindBy(xpath = "//*[@id='selectnav1']")
    private WebElement iFrame;

    @FindBy(xpath = "//*[@id='frm1']")
    private WebElement iFrameMenu;

    @FindBy(id = "selectnav1")
    private WebElement frameSelect;


    @FindBy(id = "frm2")
    private WebElement iframeMenuSecond;

    @FindBy(id = "selectnav1")
    private WebElement frameSelectSecond;

    @FindBy(id = "firstName")
    private WebElement firstNameHY;

    @FindBy(id = "lastName")
    private WebElement lastNameHy;

    @FindBy(id = "femalerb")
    private WebElement female;

    @FindBy(id = "englishchbx")
    private WebElement english;

    @FindBy(id = "hindichbx")
    private WebElement hindi;

    @FindBy(id = "email")
    private WebElement emailHy;

    @FindBy(id = "password")
    private WebElement password;

    @FindBy(id = "frm3")
    private WebElement frameThird;

    @FindBy(id = "selectnav1")
    private WebElement frameSelectThird;


    @FindBy(id = "selectnav2")
    private WebElement thirdFrameMenuFromFistFrame;

    @FindBy(id = "input")
    private WebElement searchButton;

    @FindBy(id = "APjFqb")
    private WebElement googleSearchText;

    @FindBy(name = "btnK")
    private WebElement googleSearchButton;

    @FindBy(xpath = "//*[contains(h3,'YouTube')]")
    private WebElement selectYoutubeSite;

    @FindBy(xpath = "//*[contains(a,'7.8.0')]")
    private WebElement selectTestNGVersion;

    @FindBy(name = "search_query")
    private WebElement youtubeSearchBox;

    @FindBy(xpath = "//*[contains(h3,'org.testng')]")
    private WebElement selectTestNGSite;


    @FindBy(xpath = "//*[@id='search-icon-legacy']/yt-icon/yt-icon-shape/icon-shape/div")
    private WebElement searchYoutubeButton;


    @FindBy(css = "input[placeholder='First Name']")
    private WebElement firstNameSeleniumSite;

    @FindBy(css = "input[placeholder='Last Name']")
    private WebElement lastNameSeleniumSite;

    @FindBy(css = "textarea[ng-model='Adress']")
    private WebElement address;

    @FindBy(css = "input[type='email']")
    private WebElement emailSeleniumSite;

    @FindBy(css = "input[type='tel']")
    private WebElement phoneNumber;

    @FindBy(css = "input[value='FeMale']")
    private WebElement gender;

    @FindBy(css = "input[value='Cricket']")
    private WebElement selectCricket;

    @FindBy(css = "input[value='Movies']")
    private WebElement selectMovies;

    @FindBy(id = "msdd")
    private WebElement language;

    @FindBy(xpath = "//*[contains(a,'English')]")
    private WebElement selectEnglish;

    @FindBy(xpath = "//*[contains(a,'Hindi')]")
    private WebElement selectHindi;

    @FindBy(xpath = "//*[contains(label,'Languages')]")
    private WebElement outside;

    @FindBy(id = "Skills")
    private WebElement setSkills;

    @FindBy(css = "span[role='combobox']")
    private WebElement selectCountry;

    @FindBy(css = "input[type='search']")
    private WebElement searchCountry;

    @FindBy(css = "li[role='treeitem']")
    private WebElement selectCountryAfterSearch;

    @FindBy(id = "yearbox")
    private WebElement selectYear;

    @FindBy(css = "select[placeholder='Month']")
    private WebElement selectMonth;

    @FindBy(id = "daybox")
    private WebElement selectDate;

    @FindBy(id = "firstpassword")
    private WebElement firstPassword;

    @FindBy(id = "secondpassword")
    private WebElement secondpassword;

    @FindBy(id = "submitbtn")
    private WebElement submitButton;


    public HomePage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    public void frontPage() throws InterruptedException {
        driver.get(baseUrl);

        Thread.sleep(3000);

        firstNameSeleniumSite.sendKeys("userName");
        lastNameSeleniumSite.sendKeys("lastName");
        address.sendKeys("U.S.A.");
        emailSeleniumSite.sendKeys("username12@gmail.com");
        phoneNumber.sendKeys("8987654567");
        gender.click();

        Thread.sleep(1000);
        selectCricket.click();

        Thread.sleep(1000);
        selectMovies.click();

        language.click();

        selectEnglish.click();
        Thread.sleep(1000);

        selectHindi.click();
        Thread.sleep(1000);
        outside.click();

        Thread.sleep(3000);
       // setSkills.click();
        Select selectSkills = new Select(setSkills);
        selectSkills.selectByValue("Adobe InDesign");

        selectCountry.click();
        searchCountry.sendKeys("india");
        selectCountryAfterSearch.click();

        selectYear.click();
        Select selectedYear=new Select(selectYear);
        selectedYear.selectByValue("1990");

        selectMonth.click();
        Select selectedMonth=new Select(selectMonth);
        selectedMonth.selectByValue("July");

        selectDate.click();
        Select selectedDay=new Select(selectDate);
        selectedDay.selectByValue("7");
        firstPassword.sendKeys("UserName123@");
        secondpassword.sendKeys("UserName123@");

        submitButton.click();


    }

    public void multipleWindowsLoop() throws InterruptedException {
        driver.get(BaseUrlGoogle);
        googleSearchText.sendKeys("youtube");
        Thread.sleep(1000);
        String currentTab = driver.getWindowHandle();

        driver.switchTo().newWindow(WindowType.TAB);
        driver.navigate().to("https://www.google.com/");
        googleSearchText.sendKeys("testng maven dependency");

        for (String tab : driver.getWindowHandles()) {
            if (!tab.equals(currentTab)) {
                Thread.sleep(1000);
                googleSearchButton.click();

                driver.switchTo().window(currentTab);
                Thread.sleep(2000);
                googleSearchButton.click();
                Thread.sleep(2000);
                selectYoutubeSite.click();

                driver.switchTo().window(tab);
                selectTestNGSite.click();

                driver.switchTo().window(currentTab);
                Thread.sleep(2000);
                youtubeSearchBox.sendKeys("Vedio song");

                driver.switchTo().window(tab);
                selectTestNGVersion.click();

                driver.switchTo().window(currentTab);
                Thread.sleep(2000);
                searchYoutubeButton.click();

            }

        }


    }

    public void multipleWindow() throws InterruptedException {
        driver.get(BaseUrlGoogle);
        googleSearchText.sendKeys("youtube");

        driver.switchTo().newWindow(WindowType.TAB);
        driver.navigate().to("https://www.google.com/");
        googleSearchText.sendKeys("testng maven dependency");
        Thread.sleep(1000);
        googleSearchButton.click();
        Thread.sleep(2000);

        ArrayList<String> newTab = new ArrayList<String>(driver.getWindowHandles());

        driver.switchTo().window(newTab.get(0));
        Thread.sleep(2000);
        googleSearchButton.click();
        Thread.sleep(2000);
        selectYoutubeSite.click();

        driver.switchTo().window(newTab.get(1));
        selectTestNGSite.click();

        driver.switchTo().window(newTab.get(0));
        Thread.sleep(3000);
        youtubeSearchBox.sendKeys("Vedio song");

        driver.switchTo().window(newTab.get(1));
        Thread.sleep(3000);
        selectTestNGVersion.click();

        driver.switchTo().window(newTab.get(0));
        Thread.sleep(3000);
        searchYoutubeButton.click();
        driver.quit();
    }


    public void clickSwitchAlert() {
        Actions actions = new Actions(driver);
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

    public void iFrames() throws InterruptedException {
        driver.get(BaseUrlIFrame);
        driver.switchTo().frame(iFrameMenu);
        iFrame.click();
        Select frame = new Select(frameSelect);
        frame.selectByVisibleText("- Java");

        driver.switchTo().defaultContent();

        driver.switchTo().frame("frm2");

        Select frameSel = new Select(frameSelectSecond);
        frameSel.selectByVisibleText("- Basic Controls");
        firstNameHY.sendKeys("userName");
        lastNameHy.sendKeys("lastName");
        female.click();
        english.click();
        hindi.click();
        emailHy.sendKeys("user12@gmail.com");
        password.sendKeys("UserEnjoy12@");

        driver.switchTo().defaultContent();

        driver.switchTo().frame("frm3");
        // frameSelectThird.click();


        driver.switchTo().frame("frm2");
        Select frameSele = new Select(frameSelectSecond);
        frameSele.selectByVisibleText("- Basic Controls");
        firstNameHY.sendKeys("userName");
        lastNameHy.sendKeys("lastName");
        female.click();
        english.click();
        hindi.click();
        emailHy.sendKeys("user12@gmail.com");
        password.sendKeys("UserEnjoy12@");
        driver.switchTo().defaultContent();

        driver.switchTo().frame(iFrameMenu);
        iFrame.click();
        Select frameOne = new Select(frameSelect);
        frameOne.selectByVisibleText("- Java");
        driver.switchTo().defaultContent();

        driver.switchTo().frame("frm3");
        thirdFrameMenuFromFistFrame.click();
        Select menuSel = new Select(thirdFrameMenuFromFistFrame);
        menuSel.selectByVisibleText("Home");


    }
}

