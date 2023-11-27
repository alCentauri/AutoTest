package com.ignitisTest.stepdefinitions.utils;
import org.openqa.selenium.*;
import java.util.Optional;
public class TestUtils {
    public static Optional<WebElement> findElementInPage(WebDriver driver, String elementXpath) {
        WebElement elementToFind;
        JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
        while (true) {
            try {
                elementToFind = driver.findElement(By.xpath(elementXpath));
                if (elementToFind.isDisplayed()) {
                    return Optional.of(elementToFind);
                }
            } catch (NoSuchElementException e) {
                jsExecutor.executeScript("window.scrollBy(0, 100);"); // Scroll down by 100 pixels
            }
            boolean isScrolledToEnd = (boolean) jsExecutor.executeScript(
                    "return window.innerHeight + window.scrollY >= document.body.offsetHeight");
            if (isScrolledToEnd) {
                break;
            }
        }
        return Optional.empty();
    }
}
