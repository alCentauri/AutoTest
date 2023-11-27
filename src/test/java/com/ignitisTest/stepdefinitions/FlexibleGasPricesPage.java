package com.ignitisTest.stepdefinitions;
import com.ignitisTest.stepdefinitions.utils.Scrolling;
import org.openqa.selenium.*;
import java.util.Optional;
public class FlexibleGasPricesPage {
    private final WebDriver driver;
    public FlexibleGasPricesPage(WebDriver driver) {
        this.driver = driver;
    }
    public void clickGetAnOfferButton(String buttonName) {
        String buttonXpath = "//a[text()='" + buttonName + "']";
        Optional<WebElement> buttonElement = Scrolling.findElementInPage(driver, buttonXpath);
        buttonElement.ifPresent(WebElement::click);
    }
}

