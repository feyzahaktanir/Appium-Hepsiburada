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
}
