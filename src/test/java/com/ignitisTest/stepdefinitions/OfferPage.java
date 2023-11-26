package com.ignitisTest.stepdefinitions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;
import static org.junit.Assert.assertEquals;
public class OfferPage {
    private final WebDriver driver;
    public OfferPage(WebDriver driver) {
        this.driver = driver;
    }
    public void fillInRandomDataValues() {
            driver.findElement(By.xpath(XpathConstants.GAS_CONSUMPTION_UPTO_RADIO_BUTTON)).click();
            driver.findElement(By.xpath(XpathConstants.PURCHASING_FROM_INDEPENDENT_SUPPLIERS_RADIO_BUTTON)).click();
            driver.findElement(By.xpath(XpathConstants.COMPANY_INPUT)).sendKeys("@#$@!^%@$^!");
            driver.findElement(By.xpath(XpathConstants.COMPANY_CODE_INPUT)).sendKeys("0");
            driver.findElement(By.xpath(XpathConstants.COMPANY_PHONE_INPUT)).sendKeys("00000000");
            driver.findElement(By.xpath(XpathConstants.COMPANY_EMAIL_INPUT)).sendKeys("0@0.lt");
            driver.findElement(By.xpath(XpathConstants.REPRESENTATIVE_NAME_INPUT)).sendKeys("User");
            driver.findElement(By.xpath(XpathConstants.REPRESENTATIVE_PHONE_INPUT)).sendKeys("123456");
            driver.findElement(By.xpath(XpathConstants.REPRESENTATIVE_EMAIL_INPUT)).sendKeys("abc@ggg.lt");
            driver.findElement(By.xpath(XpathConstants.GDPR_CHECK_BOX)).click();
            driver.findElement(By.xpath(XpathConstants.OFFERS_CHECK_BOX)).click();
    }
    public void submitTheForm() {
        driver.findElement(By.xpath(XpathConstants.SUBMIT_THE_INQUIRY_BUTTON)).click();
    }
    public void confirmationMessageIsDisplayed() {
        try {
            Thread.sleep(5000);
            String expectedUrl = "https://ignitis.lt/en/gas-offer-business-thank-you";
            String actualUrl = driver.getCurrentUrl();
            assertEquals(expectedUrl, actualUrl);
        } catch (InterruptedException e) {
        e.printStackTrace();
        }
    }
}