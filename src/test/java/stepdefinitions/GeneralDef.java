package stepdefinitions;

import io.cucumber.java.en.Given;
import org.junit.Assert;
import pages.AndroidPages;
import utilities.DriverManager;

public class GeneralDef {
    AndroidPages androidPages = new AndroidPages();

    @Given("User allows permissions.")
    public void user_allows_permissions() {
        androidPages.permissionAllow.click();
    }
    @Given("User verifies that fullsize advert is visible.")
    public void user_verifies_that_fullsize_advert_is_visible() {
        androidPages.wait(15);
        Assert.assertTrue(androidPages.adFullsize.isDisplayed());
    }
    @Given("User closes fullsize advert.")
    public void user_closes_fullsize_advert() {
        androidPages.adFullsize_close.click();
    }
    @Given("User verifies that hepsiburada logo is visible.")
    public void user_verifies_that_hepsiburada_logo_is_visible() {
        Assert.assertTrue(androidPages.homepageLogo.isDisplayed());
    }
    @Given("User closes the application.")
    public void user_closes_the_application() {
        DriverManager.quitDriver();
    }

}
