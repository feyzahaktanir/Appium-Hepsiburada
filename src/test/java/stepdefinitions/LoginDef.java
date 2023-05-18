package stepdefinitions;

import io.cucumber.java.en.Given;
import org.junit.Assert;
import pages.Pages;
import utilities.ConfigReader;

public class LoginDef {

    Pages pages = new Pages();

    @Given("User verifies that she is on the homepage.")
    public void user_verifies_that_she_is_on_the_homepage() {
        pages.wait(10);
        if(pages.permissionAllow.isDisplayed()){
        pages.permissionAllow.click();}
        pages.wait(5);
        if (pages.adFullsize.isDisplayed()){
        Assert.assertTrue(pages.adFullsize.isDisplayed());
        pages.wait(3);
        pages.adFullsize_close.click();}
        pages.wait(3);
        Assert.assertTrue(pages.homepageLogo.isDisplayed());
    }
    @Given("User clicks Profil button in homepage.")
    public void user_clicks_profil_button_in_homepage() {
        pages.loginButton.click();
    }
    @Given("User verifies no login on user login page.")
    public void user_verifies_no_login_on_user_login_page() {
        Assert.assertTrue(pages.guestUser.isDisplayed());
    }
    @Given("User clicks Giris Yap button in homapage.")
    public void user_clicks_giris_yap_button_in_homapage() {
        pages.loginButton_profilPage.click();
    }
    @Given("User verify that Giris Yap Title is visible.")
    public void user_verify_that_giris_yap_title_is_visible() {
        Assert.assertTrue(pages.loginTab.isDisplayed());
    }

    @Given("User goes to log in page.")
    public void user_goes_to_log_in_page() {
        pages.loginButton.click();
        pages.wait(3);
        Assert.assertTrue(pages.guestUser.isDisplayed());
        pages.loginButton_profilPage.click();
        pages.wait(10);
        Assert.assertTrue(pages.loginTab.isDisplayed());
    }
    @Given("User {string} enters in Username textbox.")
    public void user_enters_in_username_textbox(String string) {
        pages.wait(5);
        pages.username.click();
        pages.username.clear();
        pages.username.sendKeys(ConfigReader.getProperty(string));
    }
    @Given("User clicks Giris Yap button in username page.")
    public void user_clicks_giris_yap_button_in_username_page() {
        pages.wait(5);
        pages.usernamePage_loginButton.click();
    }
    @Given("User verifies that wrong username alerts is visible.")
    public void user_verifies_that_wrong_username_alerts_is_visible() {
        pages.wait(5);
        Assert.assertTrue(pages.username_WrongAlert.isDisplayed());
        Assert.assertTrue(pages.username_WrongAlert2.isDisplayed());
    }
    @Given("User verifies that Password page is visible.")
    public void user_verifies_that_password_page_is_visible() {
        Assert.assertTrue(pages.passwordPage_WelcomeText.isDisplayed());
        Assert.assertTrue(pages.passwordPage_MailText.isDisplayed());
    }
    @Given("User {string} enters in Password textbox.")
    public void user_enters_in_password_textbox(String string) {
        pages.wait(5);
        pages.password.click();
        pages.password.clear();
        pages.password.sendKeys(ConfigReader.getProperty(string));
    }
    @Given("User clicks Giris Yap button in password page.")
    public void user_clicks_giris_yap_button_in_password_page() {
        pages.passwordPage_loginButton.click();
        pages.wait(10);
    }
    @Given("User verifies that wrong password alerts is visible.")
    public void user_verifies_that_wrong_password_alerts_is_visible() {
        Assert.assertTrue(pages.password_WrongAlert.isDisplayed());
        //Assert.assertTrue(homePage.password_WrongAlert2.isDisplayed());
        //homePage.password_WrongAlert_close.click();
    }
    @Given("User verifies that logged in.")
    public void user_verifies_that_logged_in() {
        Assert.assertTrue(pages.accessPopup.isDisplayed());
        Assert.assertTrue(pages.accessPopup_title.isDisplayed());
        Assert.assertTrue(pages.accessPopup_message.isDisplayed());
        pages.accessPopup_OKbutton.click();
        Assert.assertTrue(pages.username_profil.isDisplayed());
        System.out.println("Username: " + pages.username_profil.getText());
    }
}
