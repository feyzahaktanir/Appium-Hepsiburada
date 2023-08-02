package pages;

import org.openqa.selenium.support.PageFactory;
import utilities.DriverManager;

public class iOSPages {
    public iOSPages(){
        PageFactory.initElements(DriverManager.getDriver(),this);
    }
}
