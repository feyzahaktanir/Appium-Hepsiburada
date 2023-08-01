package pages;

import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import utilities.DriverManager;

import java.time.Duration;

public class AndroidPages {
    public AndroidPages(){
        PageFactory.initElements(new AppiumFieldDecorator(DriverManager.getDriver(), Duration.ofSeconds(25)),this);
    }
    @AndroidFindBy(id="com.android.permissioncontroller:id/permission_allow_button")
    public WebElement permissionAllow;
    @AndroidFindBy(id = "com.pozitron.hepsiburada:id/com_braze_inappmessage_full_frame")
    public WebElement adFullsize;
    @AndroidFindBy(id = "com.pozitron.hepsiburada:id/com_braze_inappmessage_full_close_button")
    public WebElement adFullsize_close;
    @AndroidFindBy(id = "com.pozitron.hepsiburada:id/image_message_of_day")
    public WebElement homepageLogo;

    //Wait Class ------------------------------------------------------------------
    public void wait(int seconds){
        try { Thread.sleep(seconds*1000);;}
        catch (InterruptedException e) { e.printStackTrace(); }
    }
    //-----------------------------------------------------------------------------


    //Login Page ------------------------------------------------------------------
    @AndroidFindBy(id = "com.pozitron.hepsiburada:id/account_menu_button")
    public WebElement loginButton;
    @AndroidFindBy(id = "com.pozitron.hepsiburada:id/tvToolbarTitle")
    public WebElement guestUser;
    @AndroidFindBy(xpath = "//android.view.ViewGroup[@content-desc=\"account_menu_button_1\"]/android.view.ViewGroup/android.widget.Button")
    public WebElement loginButton_profilPage;
    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout[2]/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.widget.TextView[1]")
    public WebElement loginTab;
    @AndroidFindBy(xpath = "//android.widget.EditText[@resource-id='txtUserName']")
    public WebElement username;
    @AndroidFindBy(xpath = "//android.widget.Button[@text='Giriş yap']")
    public WebElement usernamePage_loginButton;
    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.TextView")
    public WebElement username_WrongAlert;
    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.Image")
    public WebElement username_WrongAlert2;
    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View[1]")
    public WebElement passwordPage_WelcomeText;
    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.widget.TextView[1]")
    public WebElement passwordPage_MailText;
    @AndroidFindBy(xpath = "//android.widget.EditText[@resource-id='txtPassword']")
    public WebElement password;
    @AndroidFindBy(xpath = "//android.widget.Button[@resource-id='btnEmailSelect']")
    public WebElement passwordPage_loginButton;
    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout[2]/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.widget.TextView[3]")
    public WebElement password_WrongAlert;
    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout[2]/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.widget.TextView[4]")
    public WebElement password_WrongAlert2;
    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout[2]/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View[3]/android.widget.Image")
    public WebElement password_WrongAlert_close;
    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout[3]/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View[4]/android.view.View/android.view.View/android.view.View/android.widget.Image")
    public WebElement passwordShow;
    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout[3]/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View[4]/android.view.View/android.view.View/android.view.View/android.widget.Image")
    public WebElement passwordHide;

    @AndroidFindBy(id = "com.pozitron.hepsiburada:id/parentPanel")
    public WebElement accessPopup;
    @AndroidFindBy(id = "com.pozitron.hepsiburada:id/title_template")
    public WebElement accessPopup_title;
    @AndroidFindBy(id = "android:id/message")
    public WebElement accessPopup_message;
    @AndroidFindBy(id = "android:id/button1")
    public WebElement accessPopup_OKbutton;
    @AndroidFindBy(id = "com.pozitron.hepsiburada:id/tvUserNameFull")
    public WebElement username_profil;
    //-----------------------------------------------------------------------------

    //Search ----------------------------------------------------------------------
    @AndroidFindBy(id = "com.pozitron.hepsiburada:id/etSearchBox")
    public WebElement searchBox;
    @AndroidFindBy(xpath = "android.widget.TextView[@resource-id='com.pozitron.hepsiburada:id/search_suggestion_title']")
    public WebElement search_firstResult;
//    @AndroidFindBy(xpath = "zz")
//    public WebElement zz;
//    @AndroidFindBy(xpath = "zz")
//    public WebElement zz;
//    @AndroidFindBy(xpath = "zz")
//    public WebElement zz;
//    @AndroidFindBy(xpath = "zz")
//    public WebElement zz;
//    @AndroidFindBy(xpath = "zz")
//    public WebElement zz;

    //-----------------------------------------------------------------------------



}
