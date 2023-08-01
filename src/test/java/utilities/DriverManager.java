package utilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class DriverManager {
    private static AppiumDriver driver;

    public static AppiumDriver getDriver() {
        if (driver == null) {

            DesiredCapabilities cap = new DesiredCapabilities();
            cap.setCapability(MobileCapabilityType.DEVICE_NAME, ConfigReader.getProperty("deviceName"));
            cap.setCapability(MobileCapabilityType.PLATFORM_NAME, ConfigReader.getProperty("platformName"));
            cap.setCapability(MobileCapabilityType.PLATFORM_VERSION, ConfigReader.getProperty("platformVersion"));
            cap.setCapability(MobileCapabilityType.AUTOMATION_NAME, "MobileAutomation");
            cap.setCapability("app", ConfigReader.getProperty("app"));
            cap.setCapability("udid",ConfigReader.getProperty("udid"));
            cap.setCapability("skipUnlock",ConfigReader.getProperty("skipUnlock"));
            cap.setCapability("noReset",ConfigReader.getProperty("noReset"));
            cap.setCapability("fullReset",ConfigReader.getProperty("fullReset"));
            cap.setCapability("enableMultiWindows", ConfigReader.getProperty("enableMultiWindows"));


            if (ConfigReader.getProperty("platform").equalsIgnoreCase("ios")) {
                try {
                    driver = new IOSDriver(new URL("http://localhost:4723/wd/hub"), cap);
                } catch (MalformedURLException e) {
                    throw new RuntimeException(e);
                }
            } else if (ConfigReader.getProperty("platform").equalsIgnoreCase("android")) {
                cap.setCapability(MobileCapabilityType.AUTOMATION_NAME, "UiAutomator2");
                cap.setCapability("appPackage", ConfigReader.getProperty("appPackage"));
                cap.setCapability("appActivity", ConfigReader.getProperty("appActivity"));
                try {
                    driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), cap);
                } catch (MalformedURLException e) {
                    throw new RuntimeException(e);
                }
            }
            driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        }
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
            driver = null;
        }
    }
}
