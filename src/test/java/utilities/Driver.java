package utilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.HashMap;

public class Driver {

    public Driver(){}
    public static AndroidDriver driver;
    public static WebDriverWait wait;
    public static WebDriver getDriver() {
        DesiredCapabilities cap = new DesiredCapabilities();

        cap.setCapability(MobileCapabilityType.DEVICE_NAME,"Pixel 4 API 31");
        cap.setCapability(MobileCapabilityType.PLATFORM_NAME,"Android");
        cap.setCapability(MobileCapabilityType.PLATFORM_VERSION,"12.0");
        cap.setCapability(MobileCapabilityType.APP,"C:\\Users\\FeyzaPC\\Downloads\\Hepsiburada_5.13.1_.apk");
        cap.setCapability(MobileCapabilityType.AUTOMATION_NAME, "UiAutomator2");
        cap.setCapability("udid","emulator-5554");
        cap.setCapability("skipUnlock",true);
        //cap.setCapability("noReset",false);
        cap.setCapability("fullReset",true);
        cap.setCapability("enableMultiWindows", true);
        //System.out.println(driver.getPageSource());

        try {
            driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), cap);
        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        }
        wait = new WebDriverWait(driver, Duration.ofSeconds(3));

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));

//        //for accept alerts
//        HashMap<String, Object> appAlerts = new HashMap<String, Object>();
//        appAlerts.put("autoAcceptAlerts", "true"); //to accept all alerts
//        //for dismiss alerts
//        HashMap<String, Object> appAlerts = new HashMap<String, Object>();
//        appAlerts.put("autoDismissAlerts", "true"); //to dismiss all alerts
        return driver;
    }

    public static void quitDriver() {
        if (driver != null) {
            driver.quit();
        }
    }

}
