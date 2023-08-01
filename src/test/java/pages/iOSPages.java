package pages;

import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;
import utilities.DriverManager;

import java.time.Duration;

public class iOSPages {
    public iOSPages(){
        PageFactory.initElements(new AppiumFieldDecorator(DriverManager.getDriver(), Duration.ofSeconds(25)),this);
    }
}
