package com.ignitisTest.stepdefinitions;
import com.ignitisTest.stepdefinitions.utils.XpathConstants;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
public class MainPage {
    private final WebDriver driver;
    public WebElement logoMain;
    public WebElement adButton;
    public MainPage(WebDriver driver) {
        this.driver = driver;
    }
    public void changeLanguage(String toLanguage) {
        driver.findElement(By.xpath(XpathConstants.LANGUAGE_CHANGE_BUTTON)).click();
        driver.findElement(By.xpath("//li[normalize-space(text())='" + toLanguage + "']")).click();
    }
    public void confirmHomepageWasLoaded() {
        adButton = driver.findElement(By.xpath(XpathConstants.ALLOW_COOKIES_BUTTON));
        logoMain = driver.findElement(By.xpath(XpathConstants.THE_MAIN_PAGE_LOGO));
        adButton.click();
        assert logoMain.isDisplayed();
    }
}