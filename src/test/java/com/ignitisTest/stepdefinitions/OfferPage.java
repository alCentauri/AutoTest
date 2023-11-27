package com.ignitisTest.stepdefinitions;
import com.ignitisTest.stepdefinitions.utils.XpathConstants;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;
import java.util.Random;
import com.ignitisTest.stepdefinitions.utils.Randomizer;

public class OfferPage {
    private final WebDriver driver;
    public OfferPage(WebDriver driver) {
        this.driver = driver;
    }
    public void fillInRandomDataValues() {
        Random random = new Random();
        driver.findElement(By.xpath(XpathConstants.GAS_CONSUMPTION_UPTO_RADIO_BUTTON)).click();
        driver.findElement(By.xpath(XpathConstants.PURCHASING_FROM_INDEPENDENT_SUPPLIERS_RADIO_BUTTON)).click();

        driver.findElement(By.xpath(XpathConstants.COMPANY_INPUT)).sendKeys(Randomizer.generateRandomString(10));
        driver.findElement(By.xpath(XpathConstants.COMPANY_CODE_INPUT)).sendKeys(Randomizer.generateRandomNumberString(5));
        driver.findElement(By.xpath(XpathConstants.COMPANY_PHONE_INPUT)).sendKeys(Randomizer.generateRandomNumberString(8));
        driver.findElement(By.xpath(XpathConstants.COMPANY_EMAIL_INPUT)).sendKeys("email" + random.nextInt(100) + "@sample.com");
        driver.findElement(By.xpath(XpathConstants.REPRESENTATIVE_NAME_INPUT)).sendKeys(Randomizer.generateRandomString(10));
        driver.findElement(By.xpath(XpathConstants.REPRESENTATIVE_PHONE_INPUT)).sendKeys(Randomizer.generateRandomNumberString(5));
        driver.findElement(By.xpath(XpathConstants.REPRESENTATIVE_EMAIL_INPUT)).sendKeys("user" + random.nextInt(100) + "@sample.net");

        driver.findElement(By.xpath(XpathConstants.GDPR_CHECK_BOX)).click();
        driver.findElement(By.xpath(XpathConstants.OFFERS_CHECK_BOX)).click();
    }
}