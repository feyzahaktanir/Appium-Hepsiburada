package stepdefinitions;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import io.cucumber.java.en.Given;
import org.junit.Assert;
import pages.HomePage;
import pages.LoginPage;
import utilities.ConfigReader;
import utilities.Driver;

import static utilities.Driver.driver;

public class LoginDef {

    HomePage homePage = new HomePage();
    //LoginPage loginPage = new LoginPage();

    @Given("User verifies that she is on the homepage.")
    public void user_verifies_that_she_is_on_the_homepage() {
        homePage.wait(10);
        if(homePage.permissionAllow.isDisplayed()){
        homePage.permissionAllow.click();}
        homePage.wait(5);
        if (homePage.adFullsize.isDisplayed()){
        Assert.assertTrue(homePage.adFullsize.isDisplayed());
        homePage.wait(3);
        homePage.adFullsize_close.click();}
        homePage.wait(3);
        Assert.assertTrue(homePage.homepageLogo.isDisplayed());
    }
    @Given("User clicks Profil button in homepage.")
    public void user_clicks_profil_button_in_homepage() {
        homePage.loginButton.click();
    }
    @Given("User verifies no login on user login page.")
    public void user_verifies_no_login_on_user_login_page() {
        Assert.assertTrue(homePage.guestUser.isDisplayed());
    }
    @Given("User clicks Giris Yap button in homapage.")
    public void user_clicks_giris_yap_button_in_homapage() {
        homePage.loginButton_profilPage.click();
    }
    @Given("User verify that Giris Yap Title is visible.")
    public void user_verify_that_giris_yap_title_is_visible() {
        Assert.assertTrue(homePage.loginTab.isDisplayed());
    }
    @Given("User closes the browser.")
    public void user_closes_the_browser() {
        Driver.quitDriver();
    }

    @Given("User goes to log in page.")
    public void user_goes_to_log_in_page() {
        homePage.loginButton.click();
        homePage.wait(3);
        Assert.assertTrue(homePage.guestUser.isDisplayed());
        homePage.loginButton_profilPage.click();
        homePage.wait(3);
        Assert.assertTrue(homePage.loginTab.isDisplayed());
    }
    @Given("User {string} enters in Username textbox.")
    public void user_enters_in_username_textbox(String string) {
        homePage.wait(5);
        homePage.username.click();
        homePage.username.clear();
        homePage.username.sendKeys(ConfigReader.getProperty(string));
    }
    @Given("User clicks Giris Yap button in username page.")
    public void user_clicks_giris_yap_button_in_username_page() {
        homePage.wait(5);
        homePage.usernamePage_loginButton.click();
    }
    @Given("User verifies that wrong username alerts is visible.")
    public void user_verifies_that_wrong_username_alerts_is_visible() {
        homePage.wait(5);
        Assert.assertTrue(homePage.username_WrongAlert.isDisplayed());
        Assert.assertTrue(homePage.username_WrongAlert2.isDisplayed());
    }
    @Given("User verifies that Password page is visible.")
    public void user_verifies_that_password_page_is_visible() {
        Assert.assertTrue(homePage.passwordPage_WelcomeText.isDisplayed());
        Assert.assertTrue(homePage.passwordPage_MailText.isDisplayed());
    }
    @Given("User {string} enters in Password textbox.")
    public void user_enters_in_password_textbox(String string) {
        homePage.wait(5);
        homePage.password.click();
        homePage.password.clear();
        homePage.password.sendKeys(ConfigReader.getProperty(string));
    }
    @Given("User clicks Giris Yap button in password page.")
    public void user_clicks_giris_yap_button_in_password_page() {
        homePage.passwordPage_loginButton.click();
    }
    @Given("User verifies that wrong password alerts is visible.")
    public void user_verifies_that_wrong_password_alerts_is_visible() {
        Assert.assertTrue(homePage.password_WrongAlert.isDisplayed());
        //Assert.assertTrue(homePage.password_WrongAlert2.isDisplayed());
        //homePage.password_WrongAlert_close.click();
    }
    @Given("User verifies that logged in.")
    public void user_verifies_that_logged_in() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
}
