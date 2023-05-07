package stepdefinitions;

import io.appium.java_client.TouchAction;
import io.cucumber.java.en.Given;
import org.junit.Assert;
import pages.HomePage;
import utilities.Driver;

public class GeneralDef {
    HomePage homePage = new HomePage();

    @Given("User allows permissions.")
    public void user_allows_permissions() {
        homePage.permissionAllow.click();
    }
    @Given("User verifies that fullsize advert is visible.")
    public void user_verifies_that_fullsize_advert_is_visible() {
        homePage.wait(15);
        Assert.assertTrue(homePage.adFullsize.isDisplayed());
    }
    @Given("User closes fullsize advert.")
    public void user_closes_fullsize_advert() {
        homePage.adFullsize_close.click();
    }
    @Given("User verifies that hepsiburada logo is visible.")
    public void user_verifies_that_hepsiburada_logo_is_visible() {
        Assert.assertTrue(homePage.homepageLogo.isDisplayed());
    }
    @Given("User closes the application.")
    public void user_closes_the_application() {
        Driver.quitDriver();
    }

}
