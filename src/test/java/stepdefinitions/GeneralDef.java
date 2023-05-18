package stepdefinitions;

import io.cucumber.java.en.Given;
import org.junit.Assert;
import pages.Pages;
import utilities.Driver;

public class GeneralDef {
    Pages pages = new Pages();

    @Given("User allows permissions.")
    public void user_allows_permissions() {
        pages.permissionAllow.click();
    }
    @Given("User verifies that fullsize advert is visible.")
    public void user_verifies_that_fullsize_advert_is_visible() {
        pages.wait(15);
        Assert.assertTrue(pages.adFullsize.isDisplayed());
    }
    @Given("User closes fullsize advert.")
    public void user_closes_fullsize_advert() {
        pages.adFullsize_close.click();
    }
    @Given("User verifies that hepsiburada logo is visible.")
    public void user_verifies_that_hepsiburada_logo_is_visible() {
        Assert.assertTrue(pages.homepageLogo.isDisplayed());
    }
    @Given("User closes the application.")
    public void user_closes_the_application() {
        Driver.quitDriver();
    }

}
