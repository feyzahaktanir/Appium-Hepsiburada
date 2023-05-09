package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class HomePage {
    public HomePage (){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(id="com.android.permissioncontroller:id/permission_allow_button")
    public WebElement permissionAllow;
    @FindBy(id = "com.pozitron.hepsiburada:id/com_braze_inappmessage_full_frame")
    public WebElement adFullsize;
    @FindBy(id = "com.pozitron.hepsiburada:id/com_braze_inappmessage_full_close_button")
    public WebElement adFullsize_close;
    @FindBy(id = "com.pozitron.hepsiburada:id/image_message_of_day")
    public WebElement homepageLogo;

    //Wait Class ------------------------------------------------------------------
    public void wait(int seconds){
        try { Thread.sleep(seconds*1000);;}
        catch (InterruptedException e) { e.printStackTrace(); }
    }
    //-----------------------------------------------------------------------------


    //Login Page ------------------------------------------------------------------
    @FindBy(id = "com.pozitron.hepsiburada:id/account_menu_button")
    public WebElement loginButton;
    @FindBy(id = "com.pozitron.hepsiburada:id/tvToolbarTitle")
    public WebElement guestUser;
    @FindBy(xpath = "//android.view.ViewGroup[@content-desc=\"account_menu_button_1\"]/android.view.ViewGroup/android.widget.Button")
    public WebElement loginButton_profilPage;
    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout[2]/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.widget.TextView[1]")
    public WebElement loginTab;
    @FindBy(xpath = "//android.widget.EditText[@resource-id='txtUserName']")
    public WebElement username;
    @FindBy(xpath = "//android.widget.Button[@text='Giriş yap']")
    public WebElement usernamePage_loginButton;
    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.TextView")
    public WebElement username_WrongAlert;
    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.Image")
    public WebElement username_WrongAlert2;
    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View[1]")
    public WebElement passwordPage_WelcomeText;
    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.widget.TextView[1]")
    public WebElement passwordPage_MailText;
    @FindBy(xpath = "//android.widget.EditText[@resource-id='txtPassword']")
    public WebElement password;
    @FindBy(xpath = "//android.widget.Button[@resource-id='btnEmailSelect']")
    public WebElement passwordPage_loginButton;
    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout[2]/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.widget.TextView[3]")
    public WebElement password_WrongAlert;
    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout[2]/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.widget.TextView[4]")
    public WebElement password_WrongAlert2;
    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout[2]/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View[3]/android.widget.Image")
    public WebElement password_WrongAlert_close;
    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout[3]/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View[4]/android.view.View/android.view.View/android.view.View/android.widget.Image")
    public WebElement passwordShow;
    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout[3]/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View[4]/android.view.View/android.view.View/android.view.View/android.widget.Image")
    public WebElement passwordHide;


    //-----------------------------------------------------------------------------

}
