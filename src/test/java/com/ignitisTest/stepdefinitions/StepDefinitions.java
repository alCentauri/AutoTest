package com.ignitisTest.stepdefinitions;
import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class StepDefinitions {
    private final WebDriver driver;
    private final MainPage mainPage;
    private final MainPageEn mainPageEn;
    private final FlexibleGasPricesPage flexibleGasPricesPage;
    private final OfferPage offerPage;
    public StepDefinitions() {
        System.out.println("1Executing step: user navigates to URL");
        System.setProperty("webdriver.chrome.driver", "/Users/olia/IdeaProjects/IgnitisTest/chromedriver/chromedriver");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        mainPage = new MainPage(driver);
        mainPageEn = new MainPageEn(driver);
        offerPage = new OfferPage(driver);
        flexibleGasPricesPage = new FlexibleGasPricesPage(driver);
    }
    @When("the user navigates to {string}")
    public void the_user_navigates_to(String url) {
        driver.get(url);
    }
    @Then("the Ignitis homepage should be displayed")
    public void the_ignitis_homepage_should_be_displayed() {
        mainPage.confirmHomepageLoaded();
    }
    @When("the user changes the language to {string}")
    public void theUserChangesTheLanguageTo(String toLanguage) {
        mainPage.changeLanguage(toLanguage);
    }
    @And("the user enters {string} in the search box")
    public void theUserEntersInTheSearchBox(String searchString) {
        mainPageEn.enterSearchString(searchString);
    }
    @And("the user presses the search button")
    public void theUserPressesTheSearchButton() {
        mainPageEn.clickSearchButton();
    }
    @Then("the search results should be displayed")
    public void theSearchResultsShouldBeDisplayed() {
        mainPageEn.searchResultIsVisible();
    }
    @When("the user finds and selects the {string} article")
    public void theUserFindsAndSelectsTheArticle(String articleName) {
        mainPageEn.findAndClickTheArticle(articleName);
    }
    @And("the user clicks on the {string} button")
    public void theUserClicksOnTheButton(String buttonName) {
        flexibleGasPricesPage.clickGetAnOfferButton(buttonName);
    }
    @And("the user fills all the information with random values")
    public void theUserFillsAllTheInformationWithRandomValues() {
        offerPage.fillInRandomDataValues();
    }
}
