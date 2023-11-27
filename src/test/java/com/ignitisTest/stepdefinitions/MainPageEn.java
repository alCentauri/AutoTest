package com.ignitisTest.stepdefinitions;
import com.ignitisTest.stepdefinitions.utils.Scrolling;
import com.ignitisTest.stepdefinitions.utils.XpathConstants;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import java.util.Optional;
public class MainPageEn {
    private final WebDriver driver;
    public MainPageEn(WebDriver driver) {
        this.driver = driver;
    }
    public void enterSearchString(String searchString) {
        driver.findElement(By.xpath(XpathConstants.SEARCH_STRING_INPUT)).sendKeys(searchString);
    }
    public void clickSearchButton(){
        driver.findElement(By.xpath(XpathConstants.SEARCH_BUTTON)).click();
    }
    public void searchResultIsVisible() {
        assert driver.findElement(By.xpath(XpathConstants.SEARCH_RESULTS)).isDisplayed();
    }
    public void findAndClickTheArticle(String articleName) {
        String articleXpath = "//h3[text()='" + articleName + "']";
        Optional<WebElement> articleElement = Scrolling.findElementInPage(driver, articleXpath);
        articleElement.ifPresent(WebElement::click);
    }
}