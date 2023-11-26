package com.ignitisTest.stepdefinitions.utils;
import org.openqa.selenium.*;
import java.util.Optional;
public class TestUtils {
    public static Optional<WebElement> findElementInPage(WebDriver driver, String elementXpath) {
        WebElement elementToFind;
        JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
        while (true) {
            // Try to find the element
            try {
                elementToFind = driver.findElement(By.xpath(elementXpath));
                if (elementToFind.isDisplayed()) {
                    return Optional.of(elementToFind);
                }
            } catch (NoSuchElementException e) {
                // If element is not found, scroll down and retry
                jsExecutor.executeScript("window.scrollBy(0, 100);"); // Scroll down by 100 pixels
            }
            boolean isScrolledToEnd = (boolean) jsExecutor.executeScript(
                    "return window.innerHeight + window.scrollY >= document.body.offsetHeight");
            if (isScrolledToEnd) {
                break; // Stop the loop if we've reached the end of the page
            }
        }
        return Optional.empty();
    }
}
